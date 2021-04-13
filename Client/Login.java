package chat;

import java.awt.Color;
import java.awt.Frame;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adeli
 */
public class Login extends javax.swing.JFrame {

    final static int PORT = 105;
    final static String HOST = "167.172.170.117";

    Socket s;
    DataInputStream dis;
    DataOutputStream dos;

    public Login() {
        initComponents();

        //Transparent background
        setBackground(new Color(0, 0, 0, 0));

        //Connection creation using sockets 
        try {
            this.s = new Socket(HOST, PORT);
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNameTxtBox = new javax.swing.JTextField();
        closeBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        passwordTxtBox = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        newAccountBtn = new javax.swing.JButton();
        infoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(500, 390));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("User Name:");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 24));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 27));

        userNameTxtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameTxtBox.setForeground(new java.awt.Color(43, 167, 196));
        userNameTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameTxtBox.setToolTipText("");
        userNameTxtBox.setBorder(null);
        getContentPane().add(userNameTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 30));

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setText("X");
        closeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 20, 20));

        minimizeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimizeBtn.setForeground(new java.awt.Color(255, 255, 255));
        minimizeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeBtn.setText("_");
        minimizeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 20, 20));

        passwordTxtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordTxtBox.setForeground(new java.awt.Color(43, 167, 196));
        passwordTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxtBox.setBorder(null);
        getContentPane().add(passwordTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, 30));

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(43, 167, 196));
        loginBtn.setText("Log In");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setFocusPainted(false);
        loginBtn.setIconTextGap(0);
        loginBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        loginBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 130, 40));

        newAccountBtn.setBackground(new java.awt.Color(255, 255, 255));
        newAccountBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newAccountBtn.setForeground(new java.awt.Color(43, 167, 196));
        newAccountBtn.setText("New account");
        newAccountBtn.setBorder(null);
        newAccountBtn.setFocusPainted(false);
        newAccountBtn.setIconTextGap(0);
        newAccountBtn.setMaximumSize(new java.awt.Dimension(110, 30));
        newAccountBtn.setMinimumSize(new java.awt.Dimension(110, 30));
        newAccountBtn.setPreferredSize(new java.awt.Dimension(110, 30));
        newAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, 40));

        infoTextField.setEditable(false);
        infoTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        infoTextField.setForeground(new java.awt.Color(255, 0, 0));
        infoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infoTextField.setToolTipText("");
        infoTextField.setBorder(null);
        infoTextField.setOpaque(false);
        getContentPane().add(infoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 240, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/10.png"))); // NOI18N
        jLabel3.setIconTextGap(0);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        boolean existUserPassword = false;
        int gender = 4;

        try {
            //Calling backend method for searching a user by name and password
            dos.writeUTF("search_user_password," + userNameTxtBox.getText() + "," + passwordTxtBox.getText());
            dos.flush();
            existUserPassword = dis.readBoolean();
            dos.writeUTF("get_gender," + userNameTxtBox.getText());
            dos.flush();
            gender = dis.readInt();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (userNameTxtBox.getText().isBlank() || passwordTxtBox.getText().isBlank()) {
            infoTextField.setText("Empty fields!");
        } else if (existUserPassword) {

            //Client graphical user interface object
            ClientGui clientGui = new ClientGui(userNameTxtBox.getText(), gender);
            clientGui.setOpacity(1.0f);
            clientGui.setVisible(true);

            try {

                //Telling to server that a new user is connecting
                clientGui.dos.writeUTF("new_user_online," + userNameTxtBox.getText());
                clientGui.dos.flush();
                String s1 = clientGui.dis.readUTF();

                //Online users list update
                s1 = s1.replaceAll("\\[", "");
                s1 = s1.replaceAll("\\]", "");
                s1 = s1.replaceAll(" ", "");
                String[] users = s1.split(",");
                for (String s : users) {
                    if (clientGui.dlm2.contains(s)) {

                    } else {
                        clientGui.dlm2.addElement(s);
                        clientGui.onlineUserList.setModel(clientGui.dlm2);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            this.dispose();
        } else {
            infoTextField.setText("Invalid credentials!");
        }
        userNameTxtBox.setText("");
        passwordTxtBox.setText("");
    }//GEN-LAST:event_loginBtnActionPerformed

    private void newAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountBtnActionPerformed
        //Frame for new user creation
        NewUser newUser = new NewUser();
        newUser.setOpacity(1.0f);
        newUser.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_newAccountBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField infoTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JButton newAccountBtn;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTxtBox;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTxtBox;
    // End of variables declaration//GEN-END:variables
}
