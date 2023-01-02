/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Penjual;
import Model.Product;
import Model.User;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haikal
 */
public class DashboardPenjual_Product extends javax.swing.JFrame {

    /**
     * Creates new form DashboardPenjual
     */
    public DashboardPenjual_Product(User u) {
        this.p = new Penjual(u.getIdUser(), u.getNamaUser(), u.getEmail(), u.getPassword(), u.getRoles());
        ArrayList<Product> arr = this.p.getAllProduct();
        initComponents();
        DefaultTableModel tabModel = (DefaultTableModel)this.tabel_product.getModel();
        System.out.println(tabModel);
        for (Product product: arr){
            Object[] data = {product.getIdProduct(), product.getNamaProduct(), product.getDeskripsi(), product.getHarga()};
            tabModel.addRow(data);
        }
    }
    
    public DashboardPenjual_Product() {
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

        main_panel = new javax.swing.JPanel();
        navbar_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        navbar_logout = new javax.swing.JPanel();
        label_logout = new javax.swing.JLabel();
        navbar_product = new javax.swing.JPanel();
        label_product = new javax.swing.JLabel();
        navbar_user = new javax.swing.JPanel();
        label_user = new javax.swing.JLabel();
        navbar_transaction = new javax.swing.JPanel();
        label_transaction = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_product = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar_panel.setBackground(new java.awt.Color(255, 255, 255));
        navbar_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo.png"))); // NOI18N
        navbar_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 50));

        navbar_logout.setBackground(new java.awt.Color(255, 255, 255));
        navbar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbar_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navbar_logoutMouseExited(evt);
            }
        });
        navbar_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_logout.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label_logout.setText("Logout");
        navbar_logout.add(label_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));

        navbar_panel.add(navbar_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 50));

        navbar_product.setBackground(new java.awt.Color(255, 255, 255));
        navbar_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbar_productMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navbar_productMouseExited(evt);
            }
        });
        navbar_product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_product.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label_product.setForeground(new java.awt.Color(248, 11, 11));
        label_product.setText("Product");
        navbar_product.add(label_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));

        navbar_panel.add(navbar_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        navbar_user.setBackground(new java.awt.Color(255, 255, 255));
        navbar_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navbar_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbar_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navbar_userMouseExited(evt);
            }
        });
        navbar_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_user.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label_user.setText("User");
        navbar_user.add(label_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));

        navbar_panel.add(navbar_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 50));

        navbar_transaction.setBackground(new java.awt.Color(255, 255, 255));
        navbar_transaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbar_transactionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navbar_transactionMouseExited(evt);
            }
        });
        navbar_transaction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_transaction.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label_transaction.setText("Transaction");
        navbar_transaction.add(label_transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 13, -1, -1));

        navbar_panel.add(navbar_transaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 50));

        main_panel.add(navbar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 620));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_product.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tabel_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProduct", "namaProduct", "description", "harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel_product.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_product.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabel_product.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabel_product);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 700, 410));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 11, 11));
        jLabel4.setText("Dashboard Penjual / Product");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setFocusPainted(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, -1));

        btn_tambah.setBackground(new java.awt.Color(255, 255, 255));
        btn_tambah.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setFocusPainted(false);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));

        btn_hapus.setBackground(new java.awt.Color(255, 255, 255));
        btn_hapus.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setFocusPainted(false);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, -1));

        main_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 770, 620));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 623));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbar_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_logoutMouseEntered
        label_logout.setForeground(new Color(248, 11, 11));
        navbar_logout.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_navbar_logoutMouseEntered

    private void navbar_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_logoutMouseExited
        label_logout.setForeground(navbar_panel.getForeground());
        navbar_logout.setBackground(navbar_panel.getBackground());
    }//GEN-LAST:event_navbar_logoutMouseExited

    private void navbar_productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_productMouseEntered
       
    }//GEN-LAST:event_navbar_productMouseEntered

    private void navbar_productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_productMouseExited
       
    }//GEN-LAST:event_navbar_productMouseExited

    private void navbar_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_userMouseEntered
        label_user.setForeground(new Color(248, 11, 11));
        navbar_user.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_navbar_userMouseEntered

    private void navbar_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_userMouseExited
        label_user.setForeground(navbar_panel.getForeground());
        navbar_user.setBackground(navbar_panel.getBackground());
    }//GEN-LAST:event_navbar_userMouseExited

    private void navbar_transactionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_transactionMouseEntered
        label_transaction.setForeground(new Color(248, 11, 11));
        navbar_transaction.setBackground(new Color(245, 245, 245));
    }//GEN-LAST:event_navbar_transactionMouseEntered

    private void navbar_transactionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_transactionMouseExited
        label_transaction.setForeground(navbar_panel.getForeground());
        navbar_transaction.setBackground(navbar_panel.getBackground());
    }//GEN-LAST:event_navbar_transactionMouseExited

    private void navbar_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar_userMouseClicked
       this.dispose();
       DashboardPenjual_User dashPenjualUser = new DashboardPenjual_User(this.p);
       dashPenjualUser.setVisible(true);
    }//GEN-LAST:event_navbar_userMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        FormTambahProduct form = new FormTambahProduct(this.p);
        form.setVisible(true);
        
        //Refresh Table
        ArrayList<Product> arr = this.p.getAllProduct();
        initComponents();
        DefaultTableModel tabModel = (DefaultTableModel)this.tabel_product.getModel();
        tabModel.getDataVector().removeAllElements();
        System.out.println(tabModel);
        for (Product product: arr){
            Object[] data = {product.getIdProduct(), product.getNamaProduct(), product.getDeskripsi(), product.getHarga()};
            tabModel.addRow(data);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = this.tabel_product.getSelectedRow();
        Object id = this.tabel_product.getValueAt(selectedRow, 0);
        this.p.deleteProduct((int)id);
        
        //Refresh Table
        ArrayList<Product> arr = this.p.getAllProduct();
        initComponents();
        DefaultTableModel tabModel = (DefaultTableModel)this.tabel_product.getModel();
        tabModel.getDataVector().removeAllElements();
        System.out.println(tabModel);
        for (Product product: arr){
            Object[] data = {product.getIdProduct(), product.getNamaProduct(), product.getDeskripsi(), product.getHarga()};
            tabModel.addRow(data);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardPenjual_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardPenjual_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardPenjual_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardPenjual_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardPenjual_Product().setVisible(true);
            }
        });
    }
    
    private Penjual p;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_logout;
    private javax.swing.JLabel label_product;
    private javax.swing.JLabel label_transaction;
    private javax.swing.JLabel label_user;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel navbar_logout;
    private javax.swing.JPanel navbar_panel;
    private javax.swing.JPanel navbar_product;
    private javax.swing.JPanel navbar_transaction;
    private javax.swing.JPanel navbar_user;
    private javax.swing.JTable tabel_product;
    // End of variables declaration//GEN-END:variables
}
