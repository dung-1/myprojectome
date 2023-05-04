/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLDA_View;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import QLDA_Conecting.connect;
import QLDA_DAO.CTDonHang_DAO;
import QLDA_DAO.HOADON_DAO;
import QLDA_Model.CTHoaDon;
import QLDA_Model.HOADON;
import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author NGUYEN DUNG
 */
public class ThongKe extends javax.swing.JPanel {

    DefaultTableModel tblModel1;
    DefaultTableModel tblModel;

    ArrayList<CTHoaDon> lstHoaDon;
    ArrayList<HOADON> lstHoadon1;

    /**
     * Creates new form ThongKe
     */
    public ThongKe() throws Exception {
        initComponents();
//        showData("","");
        initTable();
        LoadNhanVienTable();
        initTable1();
        LoadNhanVienTable1();
        tblModel = (DefaultTableModel) txthoadon.getModel();
        showtable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txthoadon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtdoanhthu = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txttu = new com.toedter.calendar.JDateChooser();
        txtden = new com.toedter.calendar.JDateChooser();
        txttimtuden = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtcthd1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        txthoadon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txthoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma HD", "Ma KH", "Ngay Lap", "Tong Tien", "Ghi Chu"
            }
        ));
        txthoadon.setAlignmentX(10.0F);
        txthoadon.setAlignmentY(10.0F);
        txthoadon.setRowHeight(28);
        jScrollPane2.setViewportView(txthoadon);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setText("TỔNG DOANH THU :");

        txtdoanhthu.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Excel-icon.png"))); // NOI18N
        jButton2.setText("Xuất Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txttimtuden.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txttimtuden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Search-icon.png"))); // NOI18N
        txttimtuden.setText("Tìm Kiếm");
        txttimtuden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimtudenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Thống Kê Từ Ngày : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Đến Ngày :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtdoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txttu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(txtden, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txttimtuden, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 137, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttimtuden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("HÓA ĐƠN", jPanel1);

        txtcthd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcthd1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Sản Phẩm", "Số Lượng", "Đơn Gía", "Thành Tiền"
            }
        ));
        txtcthd1.setAlignmentX(10.0F);
        txtcthd1.setAlignmentY(10.0F);
        txtcthd1.setRowHeight(38);
        jScrollPane3.setViewportView(txtcthd1);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Excel-icon.png"))); // NOI18N
        jButton3.setText("Xuất Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("TÌM KIẾM HÓA ĐƠN :");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("CHI TIẾT HÓA ĐƠN", jPanel2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("QUẢN LÝ HÓA ĐƠN BÁN HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("customer");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < txthoadon.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(txthoadon.getColumnName(i));
                }

                for (int j = 0; j < txthoadon.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < txthoadon.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (txthoadon.getValueAt(j, k) != null) {
                            cell.setCellValue(txthoadon.getValueAt(j, k).toString());
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


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("customer");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < txtcthd1.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(txtcthd1.getColumnName(i));
                }

                for (int j = 0; j < txtcthd1.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < txtcthd1.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (txtcthd1.getValueAt(j, k) != null) {
                            cell.setCellValue(txtcthd1.getValueAt(j, k).toString());
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


    }//GEN-LAST:event_jButton3ActionPerformed
    public void showData(String d1, String d2) throws Exception {
        Connection con = connect.getConnection();
        PreparedStatement st;
        ResultSet rs;

        try {
            // if no date selected display all data
            if (d1.equals("") || d2.equals("")) {
                st = con.prepareStatement("SELECT * FROM HOADONN");
            } else {
                st = con.prepareStatement("SELECT * FROM HOADONN WHERE NGAYLAP BETWEEN ? AND ?");
                st.setString(1, d1);
                st.setString(2, d2);
            }

            rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel) txthoadon.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[5];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                model.addRow(row);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void txttimtudenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimtudenActionPerformed
        try {
            Connection conn = connect.getConnection();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String start = sdf.format(txttu.getDate());
            String end = sdf.format(txtden.getDate());
            PreparedStatement psrt;
            String Sql = ("SELECT * FROM HOADONN WHERE NGAYLAP >='" + start + "'AND NGAYLAP<='" + end + "'");
            psrt = conn.prepareStatement(Sql);
            ResultSet Rs = psrt.executeQuery();
            txthoadon.setModel(DbUtils.resultSetToTableModel(Rs));
            showtable();

        } catch (Exception ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txttimtudenActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String timkiem = jTextField1.getText();
        try {
            String query = "Select * from CHITIETHOADONN WHERE MAHD LIKE '%" + timkiem + "%'";
            Connection conn = connect.getConnection();
            PreparedStatement prst = conn.prepareStatement(query);
            ResultSet rs = prst.executeQuery();
            txtcthd1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jTextField1KeyReleased
    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MÃ HÓA ĐƠN", "MÃ SẢN PHẨM", "SỐ LƯỢNG", "ĐƠN GIÁ", "THÀNH TIỀN"});
        txtcthd1.setModel(tblModel);
    }

    public void LoadNhanVienTable() throws Exception {
        lstHoaDon = CTDonHang_DAO.getALL();
        if (lstHoaDon != null) {
            tblModel.setRowCount(0);
            for (CTHoaDon pn : lstHoaDon) {
                Vector vec = new Vector();
                vec.add(pn.getMaHoaDon());
                vec.add(pn.getMaSanPham());
                vec.add(pn.getSoLuong());
                vec.add(pn.getDonGia());
                vec.add(pn.getThanhTien());
                tblModel.addRow(vec);
            }
        }
    }

    public void initTable1() {
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{"MÃ HÓA ĐƠN", "MÃ KHÁCH HÀNG", "NGÀY LẬP", "TỔNG TIỀN", "GHI CHÚ"});
        txthoadon.setModel(tblModel1);
    }

    public void LoadNhanVienTable1() throws Exception {
        lstHoadon1 = HOADON_DAO.getALL();
        if (lstHoadon1 != null) {
            tblModel1.setRowCount(0);
            for (HOADON pn : lstHoadon1) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Vector vec = new Vector();
                vec.add(pn.getMaHoaDon());
                vec.add(pn.getMaKhachHang());
                vec.add(pn.getNgayLap());
                vec.add(pn.getTongTien());
                vec.add(pn.getGhiChu());
                tblModel1.addRow(vec);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable txtcthd1;
    private com.toedter.calendar.JDateChooser txtden;
    private javax.swing.JLabel txtdoanhthu;
    private javax.swing.JTable txthoadon;
    private javax.swing.JButton txttimtuden;
    private com.toedter.calendar.JDateChooser txttu;
    // End of variables declaration//GEN-END:variables

    private void showtable() {
        DecimalFormat x = new DecimalFormat("###,###,###");
        int Tong = 0;
        for (int i = 0; i < txthoadon.getRowCount(); i++) {
            Tong += Integer.parseInt(txthoadon.getValueAt(i, 3).toString());

        }
        txtdoanhthu.setText(x.format(Tong) + "" + "VND");
    }

}