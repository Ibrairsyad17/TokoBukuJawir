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

/**
 *
 * @author IBRAHIM
 */
public class Dashboard extends javax.swing.JFrame {
    
    // username
    public TokoBukuJawir userNameTBJ = new TokoBukuJawir();
    public String userNameNew = userNameTBJ.username;
    
    public DefaultTableModel model;
    int cellBaris;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        bukuTable();
        String[] headerTabel = {"Kode Buku", "Nama Buku", "Penulis", "Kategori","Stok", "Harga"};
        model = new DefaultTableModel(headerTabel, 0);
        tableBuku.setModel(model);
        tampilBuku();
        no.setVisible(false);
        jLabel5.setVisible(false);
        setResizable(false);
        
        Toolkit tlkit = getToolkit();
        Dimension size = tlkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);    
    }

    public void tampilBuku(){
        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "SELECT id_buku, nama_buku, penulis, kategori, stok, harga FROM buku";
                PreparedStatement stm = cnc.prepareStatement(cmd_sql);
                ResultSet rslt = stm.executeQuery();
                
                for (int i = 0; rslt.next(); i++) {
                    String row[] = {rslt.getString(1), rslt.getString(2), rslt.getString(3), rslt.getString(4), rslt.getString(5), rslt.getString( 6)};
                    model.addRow(row);
                }
                tableBuku.setModel(model);
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kodeBuku = new javax.swing.JTextField();
        masukkanKeranjang = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        lihatKeranjang = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pesanan = new javax.swing.JButton();
        cariData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hapusS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toko Buku Jawir");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Toko Buku Jawir");

        tableBuku.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode buku", "Nama buku", "Penulis", "Kategori", "Stok", "Harga"
            }
        ));
        tableBuku.setShowGrid(true);
        tableBuku.setSurrendersFocusOnKeystroke(true);
        tableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBuku);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/book (2).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 136, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daftar Buku");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton1ComponentShown(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kodeBuku.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        kodeBuku.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kodeBuku.setBorder(null);
        kodeBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kodeBukuMouseClicked(evt);
            }
        });

        masukkanKeranjang.setBackground(new java.awt.Color(102, 0, 0));
        masukkanKeranjang.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        masukkanKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        masukkanKeranjang.setText("Masukkan Ke Keranjang");
        masukkanKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukkanKeranjangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("Kode Buku:");

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setText("Nomor Telepon:");

        no.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        no.setBorder(null);

        lihatKeranjang.setBackground(new java.awt.Color(255, 153, 0));
        lihatKeranjang.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        lihatKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        lihatKeranjang.setText("Lihat Keranjang");
        lihatKeranjang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lihatKeranjangComponentShown(evt);
            }
        });
        lihatKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatKeranjangActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pesanan.setBackground(new java.awt.Color(0, 204, 0));
        pesanan.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        pesanan.setForeground(new java.awt.Color(255, 255, 255));
        pesanan.setText("Pesanan");
        pesanan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pesananComponentShown(evt);
            }
        });
        pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananActionPerformed(evt);
            }
        });

        cariData.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cariData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        cariData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cariDataMouseReleased(evt);
            }
        });
        cariData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariDataActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        jLabel6.setText("Cari:");

        hapusS.setBackground(new java.awt.Color(255, 51, 0));
        hapusS.setFont(new java.awt.Font("Poppins SemiBold", 0, 10)); // NOI18N
        hapusS.setForeground(new java.awt.Color(255, 255, 255));
        hapusS.setText("Hapus Pencarian");
        hapusS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lihatKeranjang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(masukkanKeranjang))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hapusS)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(402, 402, 402))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(hapusS, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cariData)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(pesanan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lihatKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masukkanKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cData = cariData.getText();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
            String cmd_sql = "SELECT id_buku, nama_buku, penulis, kategori, stok, harga FROM buku WHERE nama_buku LIKE '%"+cData+"%'";
            PreparedStatement stm = cnc.prepareStatement(cmd_sql);
            ResultSet rslt = stm.executeQuery();

            for (int i = 0; rslt.next(); i++) {
                String row[] = {rslt.getString(1), rslt.getString(2), rslt.getString(3), rslt.getString(4), rslt.getString(5), rslt.getString( 6)};
                model.addRow(row);
            }
            tableBuku.setModel(model);
                
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void masukkanKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukkanKeranjangActionPerformed
        // TODO add your handling code here:
        String noTlp = no.getText(); // Mengambil teks dari textfield
        String kBuku = kodeBuku.getText(); // Mengambil teks dari password field
        
        // Mengecek apakah salah satu kosong atau tidak jika ya menampilkan window error
        if(noTlp.isEmpty() || kBuku.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tidak boleh ada field yang kosong", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
                String cmd_sql = "INSERT INTO keranjang (id_user, id_buku, jumlah) VALUES (?, ?, 1)";
                PreparedStatement stm = cnc.prepareStatement(cmd_sql);
                stm.setString(1, noTlp);
                stm.setString(2, kBuku);
                int rslt = stm.executeUpdate();
                
                
                if(rslt != 0){
                    JOptionPane.showMessageDialog(this, "Berhasil Menambahkan ke Keranjang", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    kodeBuku.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak valid!");
                    no.setText("");
                    kodeBuku.setText("");
                }
                cnc.close();
                
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_masukkanKeranjangActionPerformed

    private void kodeBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kodeBukuMouseClicked
        // TODO add your handling code here:
        kodeBuku.setEditable(false);
    }//GEN-LAST:event_kodeBukuMouseClicked

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tableBuku.getModel();
        cellBaris = tableBuku.getSelectedRow();
        
        kodeBuku.setText(model.getValueAt(cellBaris, 0).toString());
    }//GEN-LAST:event_tableBukuMouseClicked

    private void lihatKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatKeranjangActionPerformed
        // TODO add your handling code here:
        
            Keranjang krn = new Keranjang();
            krn.setVisible(true);
            setVisible(false);
            krn.userPr.setText(no.getText());
    }//GEN-LAST:event_lihatKeranjangActionPerformed

    private void pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananActionPerformed
        // TODO add your handling code here:
        
        Pesanan psn = new Pesanan();
        psn.setVisible(true);
        setVisible(false);
        
        psn.nomor.setText(no.getText());
    }//GEN-LAST:event_pesananActionPerformed

    private void jButton1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComponentShown

    private void pesananComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pesananComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_pesananComponentShown

    private void lihatKeranjangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lihatKeranjangComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatKeranjangComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Edit_profile ep = new Edit_profile();
        ep.setVisible(true);
        setVisible(false);
        
        ep.noT.setText(no.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cariDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariDataActionPerformed
        // TODO add your handling code here:
        String cData = cariData.getText();
        model.setRowCount(0);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
            String cmd_sql = "SELECT id_buku, nama_buku, penulis, kategori, stok, harga FROM buku WHERE nama_buku LIKE '%"+cData+"%'";
            PreparedStatement stm = cnc.prepareStatement(cmd_sql);
            ResultSet rslt = stm.executeQuery();

            for (int i = 0; rslt.next(); i++) {
                String row[] = {rslt.getString(1), rslt.getString(2), rslt.getString(3), rslt.getString(4), rslt.getString(5), rslt.getString( 6)};
                model.addRow(row);
            }
            tableBuku.setModel(model);
                
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cariDataActionPerformed

    private void cariDataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariDataMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cariDataMouseReleased

    private void hapusSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusSActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        cariData.setText("");
        tampilBuku();
    }//GEN-LAST:event_hapusSActionPerformed

    
    private void bukuTable(){
        tableBuku.setRowHeight(30);
        tableBuku.setGridColor(Color.decode("#FF8833"));
        tableBuku.setShowGrid(true);
        tableBuku.setBackground(Color.WHITE);
        tableBuku.setSelectionBackground(Color.decode("#FFDFAB"));
        tableBuku.getTableHeader().setBackground(Color.decode("#FC2803"));
        tableBuku.getTableHeader().setBackground(Color.red);
        
    }
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cariData;
    private javax.swing.JButton hapusS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kodeBuku;
    private javax.swing.JButton lihatKeranjang;
    private javax.swing.JButton masukkanKeranjang;
    public javax.swing.JTextField no;
    private javax.swing.JButton pesanan;
    private javax.swing.JTable tableBuku;
    // End of variables declaration//GEN-END:variables
}
