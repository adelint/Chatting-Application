package serverchat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

//When a user is connecting a server thread is created
//Each server thread manipulate a user(client)
public class ServerThread implements Runnable {

    Socket s;
    ArrayList users;
    DataInputStream dis;
    DataOutputStream dos;
    Controller controller;

    public ServerThread(Socket s, ArrayList users) {
        this.s = s;
        this.users = users;
        try {
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.controller = new Controller();
    }

    @Override
    public void run() {
        String s1;
        String[] info;

        //Depending on method called by client via Output Socket is called matching method from server
        try {
            while (true) {
                s1 = dis.readUTF();
                info = s1.split(",", 0);

                //Calling for getting messages between users
                if (info[0].equals("get_messages")) {
                    String messages;
                    messages = controller.getMessages(info[1], info[2]);
                    dos.writeUTF(messages);

                    //Calling for inserting messages 
                } else if (info[0].equals("insert_messages")) {
                    controller.insertMessage(info[1], info[2], info[3]);

                    //Searching user by username and password
                } else if (info[0].equals("search_user_password")) {
                    dos.writeBoolean(controller.searchUserPassword(info[1], info[2]));

                    //Searching user by username
                } else if (info[0].equals("search_user")) {
                    dos.writeBoolean(controller.searchUser(info[1]));

                    //Inserting a new user    
                } else if (info[0].equals("insert_user")) {
                    controller.insertUser(info[1], info[2], Integer.parseInt(info[3]));

                    //Getting gender of user by username
                } else if (info[0].equals("get_gender")) {
                    dos.writeInt(controller.getGender(info[1]));

                    //Adding a new user to online users list    
                } else if (info[0].equals("new_user_online")) {
                    if (users.contains(info[0])) {

                    } else {
                        users.add(info[1]);
                        dos.writeUTF(users.toString());
                        dos.flush();
                        System.out.println(users);
                    }

                    //Getting all online users
                } else if (info[0].equals("get_online_list")) {
                    dos.writeUTF(users.toString());
                    dos.flush();

                    //Remove the user from online users list
                } else if (info[0].equals("user_logout")) {
                    if (users.contains(info[1])) {
                        users.remove(info[1]);
                    }
                    System.out.println(users);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
