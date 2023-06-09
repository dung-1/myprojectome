/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLDA_View;

import QLDA_Conecting.connect;
import QLDA_DAO.KhachHang_Dao;
import QLDA_Model.KHACHHANG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author NGUYEN DUNG
 */
public class Nhanvien extends javax.swing.JPanel {

    DefaultTableModel tblModel;
    ArrayList<KHACHHANG> lstKhachHang;

    /**
     * Creates new form Nhanvien
     */
    public Nhanvien() throws Exception {
        initComponents();
        initTable();
        LoadNhanVienTable();
        btnadd.setEnabled(false);
        btnclose.setEnabled(false);
        btnuppdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmakh = new javax.swing.JTextField();
        txttenkh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsdtkh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        btnnew = new javax.swing.JButton();
        txtngaymua = new com.toedter.calendar.JDateChooser();
        txtthanhtoans = new javax.swing.JComboBox<>();
        btnuppdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablekhachhang = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 15)), "Thông Tin Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Mã Khách Hàng :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel3.setText("Tên Khách Hàng :");

        txtmakh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmakhKeyReleased(evt);
            }
        });

        txttenkh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttenkhKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel4.setText("Số Điện Thoại :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel5.setText("Ngày Mua :");

        txtsdtkh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsdtkhKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel6.setText("Thanh Toán :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel7.setText("Ghi Chú :");

        btnadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Save-icon_1.png"))); // NOI18N
        btnadd.setText("Thêm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Button-Close-icon.png"))); // NOI18N
        btnclose.setText("Xóa");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        txtghichu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtghichuKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtghichu);

        btnnew.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Misc-New-Database-icon_1.png"))); // NOI18N
        btnnew.setText("Mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        txtngaymua.setDateFormatString("dd-MM-yyyy");

        txtthanhtoans.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtthanhtoans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ÐÃ THANH TOÁN", "CHUA THANH TOÁN" }));

        btnuppdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnuppdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Actions-edit-undo-icon.png"))); // NOI18N
        btnuppdate.setText("Cập Nhật");
        btnuppdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuppdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Excel-icon.png"))); // NOI18N
        jButton1.setText("Xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmakh, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txttenkh)
                            .addComponent(txtsdtkh)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnuppdate)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtngaymua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtthanhtoans, 0, 209, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(txtngaymua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthanhtoans, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsdtkh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnew)
                    .addComponent(btnadd)
                    .addComponent(btnclose)
                    .addComponent(btnuppdate)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        tablekhachhang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablekhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Ngày Mua", "Thanh Toán", "Ghi Chú"
            }
        ));
        tablekhachhang.setAlignmentX(10.0F);
        tablekhachhang.setAlignmentY(10.0F);
        tablekhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablekhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablekhachhang);

        txtsearch.setText("Search.......");
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel8.setText("Tìm Kiếm :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addGap(0, 302, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmakh.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã Khách Hàng \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            KHACHHANG bk = new KHACHHANG();
            bk.setMaKhachHang(txtmakh.getText());
            bk.setTenKhachHang(txttenkh.getText());
            bk.setSoDienthoai(txtsdtkh.getText());
            bk.setNgayMua(txtngaymua.getDate());
            bk.setThanhToan(txtthanhtoans.getSelectedItem().toString());
            bk.setGhiChu(txtghichu.getText());
            KhachHang_Dao dk = new KhachHang_Dao();
            dk.insert(bk);
            LoadNhanVienTable();
            JOptionPane.showMessageDialog(this, "Thêm Khách Hàng thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Khách Hàng Này đã tồn tại trong cửa hàng.");
            e.printStackTrace();
        }
        clear();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmakh.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã Khách Hàng \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            KHACHHANG bk = new KHACHHANG();
            bk.setMaKhachHang(txtmakh.getText());
            bk.setTenKhachHang(txttenkh.getText());
            bk.setSoDienthoai(txtsdtkh.getText());
            bk.setNgayMua(txtngaymua.getDate());
            bk.setThanhToan(txtthanhtoans.getSelectedItem().toString());
            bk.setGhiChu(txtghichu.getText());
            KhachHang_Dao dk = new KhachHang_Dao();
            dk.delete(bk);
            LoadNhanVienTable();
            JOptionPane.showMessageDialog(this, "XÓA Khách Hàng thành công !");
        } catch (Exception e) {
            e.printStackTrace();
        }
        clear();

    }//GEN-LAST:event_btncloseActionPerformed

    private void btnuppdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuppdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmakh.getText().equals("")) {
            sb.append("Ma khoa is required! \n");
        }
        if (JOptionPane.showConfirmDialog(this, "BẠN CHẮC CHẮN MUỐN CẬP NHẬT") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            KHACHHANG bk = new KHACHHANG();
            bk.setMaKhachHang(txtmakh.getText());
            bk.setTenKhachHang(txttenkh.getText());
            bk.setSoDienthoai(txtsdtkh.getText());
            bk.setNgayMua(txtngaymua.getDate());
            bk.setThanhToan(txtthanhtoans.getSelectedItem().toString());
            bk.setGhiChu(txtghichu.getText());
            KhachHang_Dao dk = new KhachHang_Dao();
            dk.update(bk);
            LoadNhanVienTable();
            JOptionPane.showMessageDialog(this, "Cập Nhật khách khàng thành công ! ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        clear();

    }//GEN-LAST:event_btnuppdateActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        String timkiem = txtsearch.getText();
        try {
            String query = "Select * from KHACHHANGG WHERE TENKH LIKE '%" + timkiem + "%'";
            Connection conn = connect.getConnection();
            PreparedStatement prst = conn.prepareStatement(query);
            ResultSet rs = prst.executeQuery();
            tablekhachhang.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        txtsearch.setText("");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchMouseClicked

    private void tablekhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablekhachhangMouseClicked
        try {
            int row = tablekhachhang.getSelectedRow();
            if (row >= 0) {
                String tenkhachhang = (String) tablekhachhang.getValueAt(row, 0);
                KhachHang_Dao dk = new KhachHang_Dao();
                KHACHHANG b = dk.FindMaKhachHang(tenkhachhang);
                txtmakh.setText(b.getMaKhachHang());
                txttenkh.setText(b.getTenKhachHang());
                txtsdtkh.setText(b.getSoDienthoai());
                txtngaymua.setDate(b.getNgayMua());
                txtthanhtoans.setSelectedItem(b.getThanhToan());
                txtghichu.setText(b.getGhiChu());
                btnclose.setEnabled(true);

                if (b != null) {
                    txtmakh.setText(b.getMaKhachHang());
                    txttenkh.setText(b.getTenKhachHang());
                    txtsdtkh.setText(b.getSoDienthoai());
                    txtngaymua.setDate(b.getNgayMua());
                    txtthanhtoans.setSelectedItem(b.getThanhToan());
                    txtghichu.setText(b.getGhiChu());
                    btnclose.setEnabled(true);

                }

            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_tablekhachhangMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("customer");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tablekhachhang.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tablekhachhang.getColumnName(i));
                }

                for (int j = 0; j < tablekhachhang.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tablekhachhang.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tablekhachhang.getValueAt(j, k) != null) {
                            cell.setCellValue(tablekhachhang.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            } else {
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        clear();
        btnadd.setEnabled(false);
        btnclose.setEnabled(false);
        btnuppdate.setEnabled(false);
    }//GEN-LAST:event_btnnewActionPerformed

    private void txtmakhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmakhKeyReleased
hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakhKeyReleased

    private void txttenkhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttenkhKeyReleased
hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txttenkhKeyReleased

    private void txtsdtkhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsdtkhKeyReleased
hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdtkhKeyReleased

    private void txtghichuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtghichuKeyReleased
hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtghichuKeyReleased
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private void clear() {
        txtmakh.setText("");
        txttenkh.setText("");
        txtsdtkh.setText("");
        txtngaymua.setDate(txtngaymua.getDate());
        txtthanhtoans.setSelectedIndex(0);
        txtghichu.setText("");

    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "SỐ ĐIỆN THOẠI", "NGÀY MUA", "THANH TOÁN", "GHI CHÚ"});
        tablekhachhang.setModel(tblModel);
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    DecimalFormat dcf = new DecimalFormat("###,###");

    public void LoadNhanVienTable() throws Exception {
        lstKhachHang = KhachHang_Dao.getALL();
        if (lstKhachHang != null) {
            tblModel.setRowCount(0);
            for (KHACHHANG pn : lstKhachHang) {
                Vector vec = new Vector();
                vec.add(pn.getMaKhachHang());
                vec.add(pn.getTenKhachHang());
                vec.add(pn.getSoDienthoai());
                vec.add(sdf.format(pn.getNgayMua()));
                vec.add(pn.getThanhToan());
                vec.add(pn.getGhiChu());
                tblModel.addRow(vec);
            }
        }
    }

    public void hide() {
        String makh = txtmakh.getText();
        String tenkh = txttenkh.getText();
        String sdt = txtsdtkh.getText();
        String ghichu = txtghichu.getText();

        if (!makh.equals("") && !tenkh.equals("") && !sdt.equals("") && !ghichu.equals("")) {
            btnadd.setEnabled(true);
            btnclose.setEnabled(true);
            btnuppdate.setEnabled(true);
        } else {
            btnadd.setEnabled(false);
            btnclose.setEnabled(false);
            btnuppdate.setEnabled(false);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnuppdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablekhachhang;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txtmakh;
    private com.toedter.calendar.JDateChooser txtngaymua;
    private javax.swing.JTextField txtsdtkh;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txttenkh;
    private javax.swing.JComboBox<String> txtthanhtoans;
    // End of variables declaration//GEN-END:variables
}
