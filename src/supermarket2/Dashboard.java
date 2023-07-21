package supermarket2;

import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resetpass = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        product = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        seller = new javax.swing.JLabel();
        stocks = new javax.swing.JLabel();
        dealer = new javax.swing.JLabel();
        productClear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        resetpass.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        resetpass.setForeground(new java.awt.Color(255, 255, 255));
        resetpass.setText("Reset Password");
        resetpass.setAlignmentY(0.0F);
        resetpass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetpassMouseClicked(evt);
            }
        });
        jPanel1.add(resetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 40));

        logout.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setAlignmentY(0.0F);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 520, -1, 30));

        product.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setText("Manage Product");
        product.setAlignmentY(0.0F);
        product.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });
        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 171, 33));

        report.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("Sales Report");
        report.setAlignmentY(0.0F);
        report.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        jPanel1.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, 33));

        seller.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        seller.setForeground(new java.awt.Color(255, 255, 255));
        seller.setText("Manage Seller");
        seller.setAlignmentY(0.0F);
        seller.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerMouseClicked(evt);
            }
        });
        jPanel1.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        stocks.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        stocks.setForeground(new java.awt.Color(255, 255, 255));
        stocks.setText("Low Stocks");
        stocks.setAlignmentY(0.0F);
        stocks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocksMouseClicked(evt);
            }
        });
        jPanel1.add(stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 33));

        dealer.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        dealer.setForeground(new java.awt.Color(255, 255, 255));
        dealer.setText("Manage Dealer");
        dealer.setAlignmentY(0.0F);
        dealer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dealerMouseClicked(evt);
            }
        });
        jPanel1.add(dealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, 32));

        productClear1.setBackground(new java.awt.Color(153, 153, 153));
        productClear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productClear1.setForeground(new java.awt.Color(255, 51, 51));
        productClear1.setText("X");
        productClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClear1MouseClicked(evt);
            }
        });
        jPanel1.add(productClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (3).png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 200, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (5).png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 200, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (4).png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 200, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (7).png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 200, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (6).png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (2).png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\girik\\Downloads\\Untitled design (1).png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetpassMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetpassMouseClicked

    private void dealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealerMouseClicked
        new Dealers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dealerMouseClicked

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        new SalesReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportMouseClicked

    private void stocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocksMouseClicked
        new Stocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stocksMouseClicked

    private void sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerMouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellerMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void productClear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClear1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_productClear1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Dealers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Stocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new SalesReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dealer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel product;
    private javax.swing.JButton productClear1;
    private javax.swing.JLabel report;
    private javax.swing.JLabel resetpass;
    private javax.swing.JLabel seller;
    private javax.swing.JLabel stocks;
    // End of variables declaration//GEN-END:variables
}
