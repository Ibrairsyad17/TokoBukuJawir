/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.sql.*;

/**
 *
 * @author IBRAHIM
 */
public class Keranjang extends javax.swing.JFrame {
    public DefaultTableModel model;
    int cellBaris;
    public String pri;
    ResultSet rslt1;
//    public String kBuku;
    /**
     * Creates new form Keranjang
     */
    public Keranjang() {
        initComponents();
        keranjangTabel();
        String[] headerTabel = {"Kode Buku", "Kode keranjang", "Nama Buku", "Stok", "Harga satuan", "Jumlah yang dibeli", "Jumlah harga"};
        model = new DefaultTableModel(headerTabel, 0);
        tabelKeranjang.setModel(model);
        userPr.setEditable(false);
        
        Toolkit tlkit = getToolkit();
        Dimension size = tlkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKeranjang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        userPr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        kodeBuku = new javax.swing.JTextField();
        hapusKeranjang = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        editF = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        pesanan = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Nama_Buku", "Penerbit", "Stok", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 136, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Keranjang");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Toko Buku Jawir");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/book (2).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toko Buku Jawir");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/book (2).png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Toko Buku Jawir");

        tabelKeranjang.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        tabelKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode buku", "Kode keranjang", "Nama buku", "Stok", "Harga satuan", "Jumlah yang dibeli", "Total harga"
            }
        ));
        tabelKeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKeranjangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKeranjang);

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 136, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Keranjang");

        jButton1.setBackground(new java.awt.Color(255, 136, 51));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Beli Sekarang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        userPr.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        userPr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userPr.setBorder(null);
        userPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPrActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tampilkan Keranjang");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/shopping-cart.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel9.setText("Kode Buku:");

        kodeBuku.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        kodeBuku.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kodeBuku.setBorder(null);

        hapusKeranjang.setBackground(new java.awt.Color(255, 102, 102));
        hapusKeranjang.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        hapusKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        hapusKeranjang.setText("Hapus dari keranjang");
        hapusKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusKeranjangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel10.setText("Edit Jumlah Pembelian:");

        editF.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        editF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 136, 51)));

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        pesanan.setBackground(new java.awt.Color(51, 255, 51));
        pesanan.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        pesanan.setForeground(new java.awt.Color(255, 255, 255));
        pesanan.setText("Pesanan");
        pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294)
                        .addComponent(userPr, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(hapusKeranjang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(pesanan))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(userPr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(editF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(hapusKeranjang)
                    .addComponent(jButton1))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int barisPilih = tabelKeranjang.getSelectedRow();
        
        String isiKK = model.getValueAt(barisPilih, 1).toString();
        String isiJB = model.getValueAt(barisPilih, 5).toString();
        String isiHB = model.getValueAt(barisPilih, 6).toString();
        String isiHS= model.getValueAt(barisPilih, 4).toString();
        String isiKB= model.getValueAt(barisPilih, 0).toString();
        int isiJBi = Integer.parseInt(isiJB);
        int isiHSi = Integer.parseInt(isiHS);
        int jumI = isiJBi*isiHSi;
        String jum = Integer.toString(jumI);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
            String cmd_sql = "INSERT INTO pesanan (id_keranjang, harga_pesanan, status, id_buku) VALUES (?, ?, \"Belum dibayar\", ?)";
            PreparedStatement stm = cnc.prepareStatement(cmd_sql);
            stm.setString(1, isiKK);
            stm.setString(2, jum);
            stm.setString(3, isiKB);
            int rslt = stm.executeUpdate();


            if(rslt != 0){
                JOptionPane.showMessageDialog(this, "Berhasil Menambahkan ke Pesanan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                kodeBuku.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Tidak valid!");
                kodeBuku.setText("");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "DELETE keranjang FROM keranjang INNER JOIN buku ON keranjang.id_buku = buku.id_buku WHERE id_user = ? AND buku.harga * keranjang.jumlah = ?";
                PreparedStatement stm = cnc.prepareStatement(cmd_sql);
                stm.setString(1, isiKK);
                stm.setString(2, isiHB);
                int rslt = stm.executeUpdate();
                
                
                if(rslt != 0){
                    model.setRowCount(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak valid!");
                    kodeBuku.setText("");
                }
                cnc.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            tampilKeranjang();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pri = userPr.getText(); // Mengambil teks dari textfield
        
        // Mengecek apakah salah satu kosong atau tidak jika ya menampilkan window error
        if(pri.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak boleh ada field yang kosong", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
              tampilKeranjang();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            Dashboard dbrd = new Dashboard();
            dbrd.setVisible(true);
            setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelKeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKeranjangMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tabelKeranjang.getModel();
        cellBaris = tabelKeranjang.getSelectedRow();
        
        kodeBuku.setText(model.getValueAt(cellBaris, 0).toString());
    }//GEN-LAST:event_tabelKeranjangMouseClicked

    private void hapusKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusKeranjangActionPerformed
        // TODO add your handling code here:
        String kBuku = kodeBuku.getText(); // Mengambil teks dari password field
        
        // Mengecek apakah salah satu kosong atau tidak jika ya menampilkan window error
        if(kBuku.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih buku yang ingin di hapus", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "DELETE keranjang FROM keranjang INNER JOIN user ON keranjang.id_user = user.nomor_telephone WHERE keranjang.id_user = ? AND id_buku = ?";
                PreparedStatement stm = cnc.prepareStatement(cmd_sql);
                stm.setString(1, pri);
                stm.setString(2, kBuku);
                int rslt = stm.executeUpdate();
                
                
                if(rslt != 0){
                    JOptionPane.showMessageDialog(this, "Berhasil di hapus dari keranjang", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    model.setRowCount(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak valid!");
                    kodeBuku.setText("");
                }
                cnc.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            tampilKeranjang();
        }
    }//GEN-LAST:event_hapusKeranjangActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String editJum = editF.getText(); // Mengambil teks dari password field
        String kBuku = kodeBuku.getText();
        
        // Mengecek apakah salah satu kosong atau tidak jika ya menampilkan window error
        if(editJum.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih buku yang ingin di hapus", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "UPDATE keranjang INNER JOIN user ON keranjang.id_user = user.nomor_telephone SET keranjang.jumlah = ? WHERE id_user = ? AND keranjang.id_buku = ?";
                PreparedStatement stm = cnc.prepareStatement(cmd_sql);
                stm.setString(1, editJum);
                stm.setString(2, pri);
                stm.setString(3, kBuku);
                
                int rslt = stm.executeUpdate();
                
                
                if(rslt > 0){
                    JOptionPane.showMessageDialog(this, "Berhasil di merubah jumlah dari keranjang", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    model.setRowCount(0);
                    
                    tampilKeranjang();
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak valid!");
                    editF.setText("");
                }
                cnc.close();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananActionPerformed
        // TODO add your handling code here:
        Pesanan psn = new Pesanan();
        psn.setVisible(true);
        setVisible(false);
        
        psn.nomor.setText(userPr.getText());
    }//GEN-LAST:event_pesananActionPerformed

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
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keranjang().setVisible(true);
            }
        });
    }
    
    private void keranjangTabel(){
        tabelKeranjang.setRowHeight(30);
        tabelKeranjang.setGridColor(Color.decode("#FF8833"));
        tabelKeranjang.setShowGrid(true);
        tabelKeranjang.setBackground(Color.WHITE);
        tabelKeranjang.setSelectionBackground(Color.decode("#FFDFAB"));
        tabelKeranjang.getTableHeader().setBackground(Color.decode("#FC2803"));
        tabelKeranjang.getTableHeader().setBackground(Color.red);
        
    }
    
    private void tampilKeranjang(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "SELECT keranjang.id_buku, user.nomor_telephone, buku.nama_buku, buku.stok, buku.harga, keranjang.jumlah,  buku.harga * jumlah AS Jumlah_harga FROM keranjang INNER JOIN buku ON keranjang.id_buku = buku.id_buku INNER JOIN user ON keranjang.id_user = user.nomor_telephone WHERE id_user = ?";
                PreparedStatement stm1 = cnc.prepareStatement(cmd_sql);
                stm1.setString(1, pri);
                rslt1 = stm1.executeQuery();
                
                if(rslt1.next()){
                    for (int i = 0; rslt1.next(); i++) {
                        String row[] = {rslt1.getString(1), rslt1.getString(2), rslt1.getString(3), rslt1.getString(4), rslt1.getString(5), rslt1.getString(6), rslt1.getString(7)};
                        model.addRow(row);
                    }
                    tabelKeranjang.setModel(model);
                }else{
                    JOptionPane.showMessageDialog(null, "Username harus di isi!");
                    userPr.setText("");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editF;
    private javax.swing.JButton hapusKeranjang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodeBuku;
    private javax.swing.JButton pesanan;
    private javax.swing.JTable tabelKeranjang;
    public javax.swing.JTextField userPr;
    // End of variables declaration//GEN-END:variables
}
