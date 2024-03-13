
package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminView extends javax.swing.JFrame {

    private javax.swing.JButton updateMoney;
    private javax.swing.JButton logOut;
    private javax.swing.JButton viewTransaction;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public AdminView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logOut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateMoney = new javax.swing.JButton();
        viewTransaction = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 152, 207));

        logOut.setBackground(new java.awt.Color(100, 180, 240));
        logOut.setText("Logout");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(548, Short.MAX_VALUE)
                                .addComponent(logOut)
                                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(logOut)
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1.setBounds(120, 50, 680, 60);
        getContentPane().add(jPanel1);

        jPanel3.setPreferredSize(new java.awt.Dimension(126, 119));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ioanf\\Downloads\\user.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3.setBounds(30, 20, 161, 119);
        getContentPane().add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(33, 152, 207));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 35)); // NOI18N
        jLabel3.setText("ADMIN Portal");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel2.setText("to ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        jLabel4.setText("Welcome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(19, 19, 19))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(128, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(194, Short.MAX_VALUE)))
        );
        jPanel2.setBounds(40, 150, 230, 350);
        getContentPane().add(jPanel2);

        updateMoney.setIcon(new javax.swing.ImageIcon("C:\\Users\\ioanf\\Downloads\\drive-download-20240118T002155Z-001\\payment-method (1).png")); // NOI18N
        updateMoney.setMinimumSize(new java.awt.Dimension(130, 70));
        updateMoney.setPreferredSize(new java.awt.Dimension(100, 70));

        updateMoney.setBounds(330,360,140,80);
        getContentPane().add(updateMoney);

        viewTransaction.setIcon(new javax.swing.ImageIcon("C:\\Users\\ioanf\\Downloads\\drive-download-20240118T002155Z-001\\file.png")); // NOI18N
        viewTransaction.setMinimumSize(new java.awt.Dimension(130, 70));
        viewTransaction.setPreferredSize(new java.awt.Dimension(100, 70));

        viewTransaction.setBounds(550, 360, 140, 80);
        getContentPane().add(viewTransaction);

        comboBox.setBounds(520, 210, 180, 40);
        getContentPane().add(comboBox);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 0, 30)); // NOI18N
        jLabel5.setText("Select Account");
        jLabel5.setBounds(320, 210, 170, 40);
        getContentPane().add(jLabel5);

        pack();
    }// </editor-fold>

    public void setComboBox(ArrayList<String> strings){
        this.comboBox.removeAllItems();
        for(String s:strings){
            this.comboBox.addItem(s);
        }
    }

    public void addModifyBalanceListener(ActionListener actionListener){
        this.updateMoney.addActionListener(actionListener);
    }

    public void addViewTransactionListener(ActionListener actionListener){
        this.viewTransaction.addActionListener(actionListener);
    }

    public void addLogOutListener(ActionListener actionListener){
        this.logOut.addActionListener(actionListener);
    }

    public String getComboBox(){
        return String.valueOf(this.comboBox.getSelectedItem());
    }


}
