package serverchat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    ServerSocket ss;
    Socket s;
    ArrayList users = new ArrayList();

    final static int PORT = 105;

    public Server() {
        try {
            ss = new ServerSocket(PORT);
            System.out.println("Server started at " + ss.toString());
            while (true) {
                s = ss.accept();
                Runnable r = new ServerThread(s, users);
                Thread t = new Thread(r);
                t.start();
            }
        } catch (Exception e) {
            System.err.println("Server constructor " + e);
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
