/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
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
public class Ad_Discount_Interface extends javax.swing.JFrame {

    //Boolean isVisible = true;
    
    
    public Ad_Discount_Interface() {
        initComponents();
   
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
        admin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        admin3 = new javax.swing.JLabel();
        transaction = new javax.swing.JButton();
        products = new javax.swing.JButton();
        category = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        sellers = new javax.swing.JButton();
        admin2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        applyDiscount = new javax.swing.JButton();
        addDiscount = new javax.swing.JButton();
        addCardDiscount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin(80).png"))); // NOI18N
        admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAM VIRTUAL MART");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );

        BackgroundPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delivering Low-Cost and High-Quality Goods Right at Your Doorstep");

        admin3.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin3.setText("ADMIN");
        admin3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(admin3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(admin3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1200, 50));

        transaction.setBackground(new java.awt.Color(255, 255, 255));
        transaction.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transaction(80).png"))); // NOI18N
        transaction.setBorderPainted(false);
        transaction.setContentAreaFilled(false);
        transaction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transaction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionActionPerformed(evt);
            }
        });
        BackgroundPanel.add(transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 110, -1));

        products.setBackground(new java.awt.Color(255, 255, 255));
        products.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view_list(80).png"))); // NOI18N
        products.setBorderPainted(false);
        products.setContentAreaFilled(false);
        products.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        products.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });
        BackgroundPanel.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        category.setBackground(new java.awt.Color(255, 255, 255));
        category.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/category(80).png"))); // NOI18N
        category.setBorderPainted(false);
        category.setContentAreaFilled(false);
        category.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        category.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        BackgroundPanel.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        customers.setBackground(new java.awt.Color(255, 255, 255));
        customers.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer(80).png"))); // NOI18N
        customers.setBorderPainted(false);
        customers.setContentAreaFilled(false);
        customers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });
        BackgroundPanel.add(customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        sellers.setBackground(new java.awt.Color(255, 255, 255));
        sellers.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        sellers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seller(80).png"))); // NOI18N
        sellers.setBorderPainted(false);
        sellers.setContentAreaFilled(false);
        sellers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sellers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellersActionPerformed(evt);
            }
        });
        BackgroundPanel.add(sellers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        admin2.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        admin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin2.setText("ADMIN");
        admin2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        admin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BackgroundPanel.add(admin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        logout.setBackground(new java.awt.Color(0, 102, 153));
        logout.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout(50).png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        logout.setContentAreaFilled(false);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        logout.setOpaque(true);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        BackgroundPanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, 190, 70));

        applyDiscount.setBackground(new java.awt.Color(255, 255, 255));
        applyDiscount.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        applyDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Apply_Discount(100).png"))); // NOI18N
        applyDiscount.setText("<html>\nAPPLY\n<br>\nDISCOUNT\n</html>");
        applyDiscount.setBorderPainted(false);
        applyDiscount.setContentAreaFilled(false);
        applyDiscount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        applyDiscount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        applyDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyDiscountActionPerformed(evt);
            }
        });
        BackgroundPanel.add(applyDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        addDiscount.setBackground(new java.awt.Color(255, 255, 255));
        addDiscount.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        addDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Discount(100).png"))); // NOI18N
        addDiscount.setText("<html> ADD <br> DISCOUNT </html>");
        addDiscount.setBorderPainted(false);
        addDiscount.setContentAreaFilled(false);
        addDiscount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addDiscount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiscountActionPerformed(evt);
            }
        });
        BackgroundPanel.add(addDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        addCardDiscount.setBackground(new java.awt.Color(255, 255, 255));
        addCardDiscount.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        addCardDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/card(100).png"))); // NOI18N
        addCardDiscount.setText("<html>\nADD\n<br>\nCARD DISCOUNT\n</html>");
        addCardDiscount.setBorderPainted(false);
        addCardDiscount.setContentAreaFilled(false);
        addCardDiscount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addCardDiscount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addCardDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardDiscountActionPerformed(evt);
            }
        });
        BackgroundPanel.add(addCardDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:
        new Ad_Product_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_productsActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
        new Ad_Category_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_categoryActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        // TODO add your handling code here:
        new Ad_Customer_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_customersActionPerformed

    private void sellersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellersActionPerformed
        // TODO add your handling code here:
        new Ad_Seller_Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sellersActionPerformed

    private void transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionActionPerformed
        // TODO add your handling code here:
        new View_Transactions().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_transactionActionPerformed

    private void applyDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDiscountActionPerformed
        // TODO add your handling code here:
        new Apply_Discount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_applyDiscountActionPerformed

    private void addDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiscountActionPerformed
        // TODO add your handling code here:
        new Add_Discount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addDiscountActionPerformed

    private void addCardDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardDiscountActionPerformed
        // TODO add your handling code here:
        new Add_CardDiscount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addCardDiscountActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ad_Discount_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_Discount_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_Discount_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_Discount_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
        JFrame newMain = new Ad_Discount_Interface();
        newMain.setTitle("STAM Virtual Mart");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton addCardDiscount;
    private javax.swing.JButton addDiscount;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin2;
    private javax.swing.JLabel admin3;
    private javax.swing.JButton applyDiscount;
    private javax.swing.JButton category;
    private javax.swing.JButton customers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton products;
    private javax.swing.JButton sellers;
    private javax.swing.JButton transaction;
    // End of variables declaration//GEN-END:variables
}
