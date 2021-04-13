package chat;

import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.JScrollPane;
import javax.swing.*;

/**
 *
 * @author adelin
 */

//Class used for designing the main graphical part of app
public class ClientGui extends javax.swing.JFrame {

    String username;
    int isMale;
    GridBagConstraints gbc;
    DefaultListModel dlm;
    DefaultListModel dlm2;
    final static int PORT = 105;

    //Real IP was changed for security 
    final static String HOST = "167.aaa.aaa.aaa";

    Socket s;
    DataInputStream dis;
    DataOutputStream dos;

    public ClientGui(String username, int isMale) {
        this.isMale = isMale;
        this.username = username;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        gbc = this.setGBC();
        try {
            this.s = new Socket(HOST, PORT);
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        helloTextField.setText("Hi, " + this.username + "!");
        dlm = new DefaultListModel();
        dlm2 = new DefaultListModel();
        myInitComponents();
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteButton = new javax.swing.JButton();
        logoutSeparator = new javax.swing.JSeparator();
        userSeparator = new javax.swing.JSeparator();
        sendingTextBox = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        friendName = new javax.swing.JLabel();
        messageArea = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        friendList = new javax.swing.JList<>();

        helloTextField = new javax.swing.JTextField();
        userInfoLabel = new javax.swing.JLabel();
        onlineUserSeparatorTop = new javax.swing.JSeparator();
        onlineUserSeparatorBottom = new javax.swing.JSeparator();
        closeButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        onlineUserList = new javax.swing.JList<>();
        addFriendButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        onlineUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(43, 167, 196));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.setFocusPainted(false);
        deleteButton.setIconTextGap(0);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 90, 30));

        logoutSeparator.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(logoutSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 220, 10));

        userSeparator.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 20));

        sendingTextBox.setColumns(2);
        sendingTextBox.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sendingTextBox.setBorder(null);
        getContentPane().add(sendingTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 540, 60));

        sendButton.setBackground(new java.awt.Color(43, 167, 196));
        sendButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setBorder(null);
        sendButton.setBorderPainted(false);
        sendButton.setEnabled(false);
        sendButton.setFocusPainted(false);
        sendButton.setIconTextGap(0);
        sendButton.setLabel("Send");
        sendButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });
        getContentPane().add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 553, 50, 50));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        mainPanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(mainPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 660, 390));

        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/9.png"))); // NOI18N
        getContentPane().add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 660, 40));

        friendName.setBackground(new java.awt.Color(255, 255, 255));
        friendName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        friendName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friendName.setText("Friend Name");
        friendName.setOpaque(true);
        getContentPane().add(friendName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 660, 40));

        messageArea.setBackground(new java.awt.Color(204, 204, 204));
        messageArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageArea.setText("jLabel1");
        messageArea.setOpaque(true);
        getContentPane().add(messageArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 660, 650));

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/1.png"))); // NOI18N
        userIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 100));

        jScrollPane3.setBackground(new Color(0,0,0,0));
        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        friendList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        friendList.setForeground(new java.awt.Color(43, 167, 196));
        friendList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        friendList.setFixedCellHeight(20);
        friendList.setFixedCellWidth(100);
        friendList.setSelectionBackground(new java.awt.Color(101, 227, 147));
        friendList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                friendListMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(friendList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 360));

        helloTextField.setEditable(false);
        helloTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helloTextField.setForeground(new java.awt.Color(255, 255, 255));
        helloTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        helloTextField.setToolTipText("");
        helloTextField.setBorder(null);
        helloTextField.setOpaque(false);
        getContentPane().add(helloTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 30));

        userInfoLabel.setBackground(new java.awt.Color(255, 255, 255));
        userInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/2.png"))); // NOI18N
        userInfoLabel.setIconTextGap(0);
        getContentPane().add(userInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 650));

        onlineUserSeparatorTop.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(onlineUserSeparatorTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 220, 20));

        onlineUserSeparatorBottom.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(onlineUserSeparatorBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 220, 20));

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.setToolTipText("");
        closeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 20, 20));

        minimizeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButton.setText("_");
        minimizeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minimizeButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 20, 20));

        jScrollPane5.setBackground(new Color(0,0,0,0));
        jScrollPane5.setBorder(null);
        jScrollPane5.setOpaque(false);

        onlineUserList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        onlineUserList.setForeground(new java.awt.Color(43, 167, 196));
        onlineUserList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        onlineUserList.setFixedCellHeight(20);
        onlineUserList.setFixedCellWidth(100);
        onlineUserList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(onlineUserList);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 200, 360));

        addFriendButton.setBackground(new java.awt.Color(255, 255, 255));
        addFriendButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addFriendButton.setForeground(new java.awt.Color(43, 167, 196));
        addFriendButton.setText("Add");
        addFriendButton.setBorder(null);
        addFriendButton.setFocusPainted(false);
        addFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addFriendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 90, 30));

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(43, 167, 196));
        logoutButton.setText("Log Out");
        logoutButton.setBorder(null);
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 70, 30));

        onlineUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/6.png"))); // NOI18N
        getContentPane().add(onlineUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Own method for initialize different components
    private void myInitComponents() {
        DefaultListModel listModel1 = new DefaultListModel();
        friendList.setModel(listModel1);

        //Setting user icon by gender
        if (isMale == 0) {
            userIcon.setIcon(new ImageIcon(getClass().getResource("/chat/images/1.png")));
        } else {
            userIcon.setIcon(new ImageIcon(getClass().getResource("/chat/images/4.png")));
        }

        //Timer used for messages area refreshing
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();
                buildChatEntryList(friendList.getSelectedValue());
                
            }
        });

        //Timer used for online users list refreshing
        Timer timer2 = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOnlineList();
            }
        });
        timer.start();
        timer2.start();
    }

    //Updating online users list depending on who is or not online
    public void updateOnlineList() {
        try {
            dos.writeUTF("get_online_list");
            String s1 = dis.readUTF();
            s1 = s1.replaceAll("\\[", "");
            s1 = s1.replaceAll("\\]", "");
            s1 = s1.replaceAll(" ", "");
            String[] users = s1.split(",");
            dlm2.removeAllElements();
            for (String s : users) {
                if (dlm2.contains(s)) {

                } else {
                    dlm2.addElement(s);
                    onlineUserList.setModel(dlm2);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //After each refresh of message area force the scrollbar position to bottom
    private void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    //Setting constraints for mesage bubbles
    private GridBagConstraints setGBC() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1.0;
        
        mainPanel.add(new JPanel(), gbc);

        return gbc;
    }

    //Arrange and design each message bubble depending on the who is the sender and who is the receiver
    private JPanel buildChatUI(List<ChatEntry> chatContentList) {
        JPanel chatPanel = new JPanel();
        chatPanel.setLayout(new GridBagLayout());
        chatPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();

        for (ChatEntry chatEntry : chatContentList) {
            JLabel nameLabel = new JLabel(chatEntry.name);
            BubblePane bubble = new BubblePane(chatPanel, chatEntry.content);

            // Arrange each chat entry based on the user.
            if (chatEntry.type == 1) {
                bubble.setBackground(Color.YELLOW);
                gbc.anchor = GridBagConstraints.WEST;
            } else {
                bubble.setBackground(Color.CYAN);
                gbc.anchor = GridBagConstraints.EAST;
            }

            gbc.insets.set(0, 0, 0, 0);
            gbc.weightx = 1.0;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.fill = GridBagConstraints.NONE;
            chatPanel.add(nameLabel, gbc);

            if (gbc.anchor == GridBagConstraints.WEST) {
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets.set(0, 0, 10, 40);
                //chatPanel.add(bubble, gbc);
            } else {
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets.set(0, 40, 10, 0);
                chatPanel.add(bubble, gbc);
            }
            chatPanel.add(bubble, gbc);
        }
        return chatPanel;
    }

    //Create the list of chat entries from message area
    public void buildChatEntryList(String chattingFriend) {
        String list = "";
        List<ChatEntry> chatEntry = new LinkedList<>();

        //Getting message sent between 2 users from server
        try {
            dos.writeUTF("get_messages," + username + "," + chattingFriend);
            dos.flush();
            list = dis.readUTF();
        } catch (IOException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Adapt returned values from server to match a message bubble format
        String message = list.replaceAll("\\[", "").replaceAll("\\];", "").replaceAll("`\\]\\]", "");
        String[] parts = message.split("` ");

        //Setting the name for sender and adding each message to chat entries list
        for (int i = 0; i < parts.length - 2; i += 3) {
            String nume = parts[i];
            String content = parts[i + 2];
            if (nume.equals(username)) {
                chatEntry.add(new ChatEntry(nume, content, 0));
            } else {
                chatEntry.add(new ChatEntry(chattingFriend, content, 1));
            }
        }

        mainPanel.add(buildChatUI(chatEntry), gbc);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (friendList.getSelectedValue() != null) {
            dlm.removeElement(friendList.getSelectedValue());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked
        if (sendButton.isEnabled()) {
            List<ChatEntry> chatContentList2 = new LinkedList<ChatEntry>();
            if (sendingTextBox.getText().isBlank()) {
            } else {
                try {

                    //Calling the server to insert new message in database
                    chatContentList2.add(new ChatEntry(username, sendingTextBox.getText(), 0));
                    dos.writeUTF("insert_messages," + username + "," + friendList.getSelectedValue() + "," + sendingTextBox.getText());
                    dos.flush();
                    // controller.insertMessage(username, friendList.getSelectedValue(), sendingTextBox.getText());
                    mainPanel.add(buildChatUI(chatContentList2), gbc);
                    sendingTextBox.setText("");
                    scrollToBottom(jScrollPane1);
                    mainPanel.revalidate();
                    mainPanel.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_sendButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        try {
            //Telling to server that a user logged out and app was closed
            dos.writeUTF("user_logout," + username);
        } catch (IOException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void addFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendButtonActionPerformed
        if (((onlineUserList.getSelectedValue() != null) || (onlineUserList.getSelectedValue() != "")) && (!dlm.contains(onlineUserList.getSelectedValue()))) {
            dlm.addElement(onlineUserList.getSelectedValue());
            friendList.setModel(dlm);
        }
    }//GEN-LAST:event_addFriendButtonActionPerformed

    private void friendListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendListMousePressed

        //Adding to friend list users from online users list
        List<ChatEntry> list = new ArrayList<ChatEntry>();
        if (friendList.getSelectedValue() != null) {
            mainPanel.removeAll();
            mainPanel.revalidate();
            mainPanel.repaint();
            friendName.setText(friendList.getSelectedValue());
            sendingTextBox.setEnabled(true);
            sendButton.setEnabled(true);

        } else {
            friendName.setText("");
        }
    }//GEN-LAST:event_friendListMousePressed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        try {
            ////Telling to server that a user logged out
            dos.writeUTF("user_logout," + username);
        } catch (IOException ex) {
            Logger.getLogger(ClientGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login login = new Login();
        login.setOpacity(1.0f);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriendButton;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JList<String> friendList;
    private javax.swing.JLabel friendName;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JTextField helloTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton logoutButton;
    private javax.swing.JSeparator logoutSeparator;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel messageArea;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel onlineUserLabel;
    public javax.swing.JList<String> onlineUserList;
    private javax.swing.JSeparator onlineUserSeparatorBottom;
    private javax.swing.JSeparator onlineUserSeparatorTop;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField sendingTextBox;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userInfoLabel;
    private javax.swing.JSeparator userSeparator;
    // End of variables declaration//GEN-END:variables
}
