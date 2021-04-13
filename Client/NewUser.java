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
 * @author adeli
 */

public class NewUser extends javax.swing.JFrame {

    final static int PORT = 105;
    final static String HOST = "167.172.170.117";

    Socket s;
    DataInputStream dis;
    DataOutputStream dos;

    public NewUser() {
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

        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userNameTxtBox = new javax.swing.JTextField();
        passwordTxtBox = new javax.swing.JPasswordField();
        newAccountBtn = new javax.swing.JButton();
        passwordLabel1 = new javax.swing.JLabel();
        passwordConfirmTxtBox = new javax.swing.JPasswordField();
        passwordLabel2 = new javax.swing.JLabel();
        comboBoxGender = new javax.swing.JComboBox<>();
        closeBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        infoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("User Name:");
        getContentPane().add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, 24));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 140, 27));

        userNameTxtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameTxtBox.setForeground(new java.awt.Color(43, 167, 196));
        userNameTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameTxtBox.setToolTipText("");
        userNameTxtBox.setBorder(null);
        getContentPane().add(userNameTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        passwordTxtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordTxtBox.setForeground(new java.awt.Color(43, 167, 196));
        passwordTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxtBox.setBorder(null);
        getContentPane().add(passwordTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, 30));

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
        getContentPane().add(newAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, 40));

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel1.setText("Gender: ");
        getContentPane().add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, 27));

        passwordConfirmTxtBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordConfirmTxtBox.setForeground(new java.awt.Color(43, 167, 196));
        passwordConfirmTxtBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordConfirmTxtBox.setBorder(null);
        getContentPane().add(passwordConfirmTxtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 160, 30));

        passwordLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel2.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel2.setText("Confirm Password:");
        getContentPane().add(passwordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 140, 27));

        comboBoxGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBoxGender.setForeground(new java.awt.Color(43, 167, 196));
        comboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboBoxGender.setBorder(null);
        getContentPane().add(comboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 160, 30));

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
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

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
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 20, 20));

        infoTextField.setEditable(false);
        infoTextField.setBackground(new java.awt.Color(255, 255, 255));
        infoTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        infoTextField.setForeground(new java.awt.Color(255, 0, 0));
        infoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infoTextField.setBorder(null);
        infoTextField.setOpaque(false);
        getContentPane().add(infoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/images/11.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        //If new user frame is closed then is open a new log in frame
        Login login = new Login();
        login.setOpacity(1.0f);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void newAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountBtnActionPerformed
        // isMale == 0 means user is female
        // else is male
        int isMale;

        boolean existingUser = false;
        if (comboBoxGender.getSelectedIndex() == 1) {
            isMale = 0;
        } else {
            isMale = 1;
        }

        //Calling server method for search user by name
        try {
            dos.writeUTF("search_user," + userNameTxtBox.getText());
            existingUser = dis.readBoolean();
        } catch (IOException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Inserted values verification
        if (userNameTxtBox.getText().isBlank() || passwordTxtBox.getText().isBlank() || passwordConfirmTxtBox.getText().isBlank()) {
            infoTextField.setText("Please fill in all the fields!");
        } else if (existingUser) {
            infoTextField.setText("This username is already used!");
        } else if (!passwordTxtBox.getText().equals(passwordConfirmTxtBox.getText())) {
            infoTextField.setText("Password fields values are not the same!");
        } else {
            infoTextField.setText("");
            try {
                dos.writeUTF("insert_user," + userNameTxtBox.getText() + "," + passwordTxtBox.getText() + "," + isMale);
            } catch (IOException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            userNameTxtBox.setText("");
            passwordTxtBox.setText("");
            passwordConfirmTxtBox.setText("");
            infoTextField.setText("Account created successfully!");
        }
    }//GEN-LAST:event_newAccountBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private javax.swing.JComboBox<String> comboBoxGender;
    private javax.swing.JTextField infoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JButton newAccountBtn;
    private javax.swing.JPasswordField passwordConfirmTxtBox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JPasswordField passwordTxtBox;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTxtBox;
    // End of variables declaration//GEN-END:variables
}
