/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Void
 */
public class Seller extends javax.swing.JFrame {

    //Boolean isVisible = true;
    Connection myConn;
    Integer SID;
    String c_pass;
    JFrame f = new JFrame();

    public Seller() {
        initComponents();
    }

    public void Login_method() throws SQLException{

        
        String email = email_var.getText();
        String pass = password.getText();

        String Str_Query = "Select SELLER_ID, PASSWORD from Seller where Email = ? ";
        PreparedStatement ps = myConn.prepareStatement(Str_Query);
        ps.setString(1, email);
        
        
        
        ResultSet resultSet = ps.executeQuery();

        
        while (resultSet.next()) {
                c_pass = resultSet.getString("password");
            }
        
        if (!resultSet.next()) {
            JOptionPane.showMessageDialog(f, "This email has no associated seller account", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if (!c_pass.equals(pass)){
            JOptionPane.showMessageDialog(f, "Incorrect Password", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        
        else {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("SELLER_ID"));
                SID = resultSet.getInt("SELLER_ID");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin1 = new javax.swing.JLabel();
        admin3 = new javax.swing.JLabel();
        admin4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email_var = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        ForgotPassword = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAM VIRTUAL MART");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 13, -1, -1));

        admin.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seller(80).png"))); // NOI18N
        admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to your most trusted online market place");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 113, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delivering Low-Cost and High-Quality Goods Right at Your Doorstep");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        admin2.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin2.setText("SELLER");
        admin2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, -1));

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel2.setText("LOGIN");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        admin1.setFont(new java.awt.Font("Nirmala UI", 1, 35)); // NOI18N
        admin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin1.setText("PASSWORD");
        admin1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        admin3.setFont(new java.awt.Font("Nirmala UI", 1, 35)); // NOI18N
        admin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin3.setText("EMAIL");
        admin3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        admin4.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email(50).png"))); // NOI18N
        admin4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BackgroundPanel.add(admin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 60, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password(50).png"))); // NOI18N
        BackgroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        email_var.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        email_var.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_varActionPerformed(evt);
            }
        });
        BackgroundPanel.add(email_var, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 510, 50));

        password.setFont(new java.awt.Font("Nirmala UI", 0, 30)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        BackgroundPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 510, 50));

        Login.setBackground(new java.awt.Color(0, 102, 153));
        Login.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login(50).png"))); // NOI18N
        Login.setText("LOGIN ");
        Login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Login.setContentAreaFilled(false);
        Login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Login.setOpaque(true);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        BackgroundPanel.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 190, 70));

        ForgotPassword.setBackground(new java.awt.Color(0, 153, 204));
        ForgotPassword.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        ForgotPassword.setText("Forgot Password?");
        ForgotPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ForgotPassword.setContentAreaFilled(false);
        ForgotPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPasswordActionPerformed(evt);
            }
        });
        BackgroundPanel.add(ForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 230, 40));

        SignUp.setBackground(new java.awt.Color(0, 153, 204));
        SignUp.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("New to STAM Virtual Mart ? SIGN UP");
        SignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SignUp.setContentAreaFilled(false);
        SignUp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        SignUp.setOpaque(true);
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        BackgroundPanel.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 480, 50));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back(60).png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        BackgroundPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 130, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_varActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        if (email_var.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Email", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (password.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Missing Value, Enter Password", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Login_method();
            } catch (SQLException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            }

            new HomeSeller().setVisible(true);
            this.setVisible(false);
        }


    }//GEN-LAST:event_LoginActionPerformed

    private void ForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPasswordActionPerformed
        // TODO add your handling code here:
        new SellerForgotPassword().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ForgotPasswordActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        new SellerSignUp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignUpActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new WelcomeScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
        JFrame newMain = new Seller();
        newMain.setTitle("STAM Virtual Mart");
        newMain.setVisible(true);
        newMain.setResizable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton ForgotPassword;
    private javax.swing.JButton Login;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin1;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin3;
    private javax.swing.JLabel admin4;
    private javax.swing.JButton back;
    private javax.swing.JTextField email_var;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
