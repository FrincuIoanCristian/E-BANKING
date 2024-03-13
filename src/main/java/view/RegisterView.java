package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegisterView extends javax.swing.JFrame {

    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    public RegisterView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelSignUp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jButtonSignUp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ioanf\\Desktop\\ProiectFinalEbanking\\src\\main\\icon\\bank.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-Banking");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addContainerGap(37, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
//        jPanel3.setLayout(new GridBagLayout());
        jPanel3.setLayout(null);

        jLabelSignUp.setBackground(new java.awt.Color(0, 102, 102));
        jLabelSignUp.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabelSignUp.setText("Sign Up");
//        GridBagConstraints gridBagConstraintsSignUp = new GridBagConstraints();
//        gridBagConstraintsSignUp.gridx = 0;
//        gridBagConstraintsSignUp.gridy = 0;
//        gridBagConstraintsSignUp.anchor = GridBagConstraints.WEST;
//        gridBagConstraintsSignUp.insets = new java.awt.Insets(0, 0, 20, 0);
        jLabelSignUp.setBounds(250, 10, 200, 40);
        jPanel3.add(jLabelSignUp);

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setText("First Name");
        jLabel4.setBounds(100, 100, 150, 40);
        jPanel3.add(jLabel4);

        jTextFieldFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jTextFieldFirstName.setBounds(250, 100, 200, 40);
        jPanel3.add(jTextFieldFirstName);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Last Name");
        jLabel6.setBounds(100, 145, 150, 40);
        jPanel3.add(jLabel6);

        jTextFieldLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldLastName.setBounds(250, 145, 200, 40);
        jPanel3.add(jTextFieldLastName);

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        jLabel7.setBounds(100, 190, 150, 40);
        jPanel3.add(jLabel7);

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldEmail.setBounds(250, 190, 200, 40);
        jPanel3.add(jTextFieldEmail);

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password");
        jLabel8.setBounds(100, 235, 150, 40);
        jPanel3.add(jLabel8);

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField.setBounds(250, 235, 200, 40);
        jPanel3.add(jPasswordField);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Confirm Password");
        jLabel9.setBounds(100, 280, 150, 40);
        jPanel3.add(jLabel9);

        jPasswordFieldConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldConfirm.setBounds(250, 280, 200, 40);
        jPanel3.add(jPasswordFieldConfirm);

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Phone Number");
        jLabel10.setBounds(100, 325, 150, 40);
        jPanel3.add(jLabel10);

        jTextFieldPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPhoneNumber.setBounds(250, 325, 200, 40);
        jPanel3.add(jTextFieldPhoneNumber);

        jButtonSignUp.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.setBounds(300, 370, 100, 30);
        jPanel3.add(jButtonSignUp);

        jLabel11.setText("I have an account");
        jLabel11.setBounds(100, 420, 100, 30);
        jPanel3.add(jLabel11);

        jButtonLogin.setForeground(new java.awt.Color(160, 45, 45));
        jButtonLogin.setText("Login");
        jButtonLogin.setBounds(250, 420, 100, 30);
        jPanel3.add(jButtonLogin);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(250, 0, 550, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 126, Short.MAX_VALUE))
        );

        pack();
    }
    public void addRegisterButtonListener(ActionListener actionListener) {
        this.jButtonSignUp.addActionListener(actionListener);
    }
    public void addBackLoginListener(ActionListener actionListener) {
        this.jButtonLogin.addActionListener(actionListener);
    }

    public void showError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public String getFirstName(){
        return jTextFieldFirstName.getText();
    }
    public String getLastName(){
        return jTextFieldLastName.getText();
    }
    public String getEmail(){
        return jTextFieldEmail.getText();
    }
    public String getPassword() {
        // Note: In a real-world scenario, you may want to handle password securely.
        // Avoid storing passwords in plain text.
        char[] passwordChars = jPasswordField.getPassword();
        return new String(passwordChars);
    }
    public String getConfirmPassword() {
        // Note: In a real-world scenario, you may want to handle password securely.
        // Avoid storing passwords in plain text.
        char[] passwordChars = jPasswordFieldConfirm.getPassword();
        return new String(passwordChars);
    }

    public String getPhoneNumber(){
        return jTextFieldPhoneNumber.getText();
    }

}
