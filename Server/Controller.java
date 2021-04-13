package serverchat;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adeli
 */
//Class responsible for database bussiness
public class Controller {

    String MysqlUrlString;
    String databaseUserName;
    String databasePassword;

    public Controller() {
        MysqlUrlString = "jdbc:mysql://localhost:3306/chat";
        databaseUserName = "root";
        databasePassword = "programmer";
    }

    //Insert a new user in database
    public void insertUser(String username, String parola, int isMale) {
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "insert into users values(null,'" + username + "','" + parola + "'," + isMale + ")";
                PreparedStatement statement = con.prepareStatement(query);
                statement.execute();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Search a user in database by username and password
    public boolean searchUserPassword(String username, String parola) {
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "select * from users where username='" + username + "' and parola ='" + parola + "'";
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if (resultSet.next()) {
                    con.close();
                    return true;
                } else {
                }
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Search a user just by username
    public boolean searchUser(String username) {
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "select * from users where username='" + username + "'";
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if (resultSet.next()) {
                    con.close();
                    return true;
                } else {
                }
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Insert a new message into database
    public void insertMessage(String sender, String receiver, String content) {
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "insert into messages values(null,'" + sender + "','" + receiver + "','" + content + "',now())";
                PreparedStatement statement = con.prepareStatement(query);
                statement.execute();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Get messages sent between 2 users
    public String getMessages(String sender, String receiver) {
        List<String[]> messages = new ArrayList<String[]>();
        String finalMessage = "";
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "select * from messages where (senderUserName='" + sender + "' and receiverUserName='" + receiver + "') or (senderUserName='" + receiver + "' and receiverUserName='" + sender + "') order by date_time asc";
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    String send = rs.getString("senderUserName");
                    String receive = rs.getString("receiverUserName");
                    String message = rs.getString("content");

                    messages.add(new String[]{send + ":", receive + ":", message + ":,"});
                }
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finalMessage = Arrays.deepToString(messages.toArray());
        finalMessage = finalMessage.replaceAll("\\]\\,", "\\];").replaceAll("\\:\\,", "`");
        finalMessage = finalMessage.replaceAll("\\:\\,", "`");
        System.out.println(finalMessage);
        return finalMessage;
    }

    //Verifying gender of a user by usename
    public boolean isMale(String username) {
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "select isMale from users where username='" + username + "'";
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                if (resultSet.getInt("isMale") == 0) {
                    con.close();
                    return false;
                } else {

                }
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    //Getting gender of a user by his/her username
    public int getGender(String username) {
        int gender = 0;
        try {
            Connection con = DriverManager.getConnection(MysqlUrlString, databaseUserName, databasePassword);
            if (con != null) {
                String query = "select * from users where username='" + username + "'";
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    gender = resultSet.getInt("isMale");
                }
                con.close();
                return gender;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
