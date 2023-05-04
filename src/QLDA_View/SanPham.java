/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLDA_View;

import QLDA_Conecting.Image_Doan;
import QLDA_Conecting.messconec;
import QLDA_Conecting.connect;
import QLDA_DAO.SANPHAM_DAO;
import QLDA_Model.SANPHAM;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Vector;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SanPham extends javax.swing.JPanel {

    DefaultTableModel tblModel;
    ArrayList<SANPHAM> lstSanPham;
    private byte[] porsonimage;

    /**
     * Creates new form SanPham
     */
    public SanPham() throws Exception {
        initComponents();
        initTable();
        LoadKhoaTable();

        btnthem.setEnabled(false);
        btnxoa.setEnabled(false);
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
        txtmasanpham = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtgiasp = new javax.swing.JTextField();
        txtdonvitinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtloaisp = new javax.swing.JComboBox<>();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jlbanh = new javax.swing.JLabel();
        btnanh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnuppdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesanpham = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("QUẢN LÝ SẢN PHẨM");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Mã Sản Phẩm :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Tên Sản Phẩm :");

        txtmasanpham.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtmasanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasanphamActionPerformed(evt);
            }
        });
        txtmasanpham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmasanphamKeyReleased(evt);
            }
        });

        txttensp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttenspKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel5.setText("Đơn Vị Tính :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtgiasp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgiaspKeyReleased(evt);
            }
        });

        txtdonvitinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdonvitinhKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel7.setText("Loại Sản Phẩm :");

        txtloaisp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtloaisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRÀ SỮA", "TRÀ CHANH", "KEM", "ĐỒ UỐNG" }));

        btnthem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Save-icon_1.png"))); // NOI18N
        btnthem.setText("Thêm ");
        btnthem.setToolTipText("");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Button-Close-icon.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jlbanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhnen/loho.png"))); // NOI18N
        jlbanh.setPreferredSize(new java.awt.Dimension(500, 500));

        btnanh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anhnen/openfile.png"))); // NOI18N
        btnanh.setText("Mở Ảnh");
        btnanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanhActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Misc-New-Database-icon_1.png"))); // NOI18N
        jButton1.setText("Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel8.setText("Gía Bán :");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Excel-icon.png"))); // NOI18N
        jButton2.setText("Xuất ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnuppdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnuppdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA_ICON/Actions-edit-undo-icon.png"))); // NOI18N
        btnuppdate.setText("Cập Nhật");
        btnuppdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuppdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(35, 35, 35))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(31, 31, 31)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtdonvitinh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtloaisp, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(txttensp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmasanpham, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgiasp))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnthem)
                        .addGap(42, 42, 42)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnuppdate)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(118, 118, 118)
                        .addComponent(jlbanh, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnanh)))
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdonvitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtgiasp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbanh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnanh)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnuppdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtmasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(127, 127, 127))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 255, 204));

        tablesanpham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        tablesanpham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablesanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Loại Sản Phẩm", "Tên Sản Phẩm", "Đơn Vị Tính", "Gía Bán", "Ảnh"
            }
        ));
        tablesanpham.setAlignmentX(10.0F);
        tablesanpham.setAlignmentY(10.0F);
        tablesanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablesanpham);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextField1.setText("Search.....");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Tìm Kiếm :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(365, 365, 365))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
    DecimalFormat dcf = new DecimalFormat("###,###");
    private void tablesanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesanphamMouseClicked
        try {
            int row = tablesanpham.getSelectedRow();
            if (row >= 0) {
                String tensanpham = (String) tablesanpham.getValueAt(row, 0);
                SANPHAM_DAO dk = new SANPHAM_DAO();
                SANPHAM b = dk.FindMaSanPham(tensanpham);
                txtmasanpham.setText(b.getMaSanpham());
                txtloaisp.setSelectedItem(b.getLoaiSanpham());
                txttensp.setText(b.getTenSanpham());
                txtdonvitinh.setText(b.getDonVitinh());
                txtgiasp.setText(b.getGiaBan());
                porsonimage = b.getHinh();
                btnxoa.setEnabled(true);
                if (b != null) {
                    btnxoa.setEnabled(true);
                    txtmasanpham.setText(b.getMaSanpham());
                    txtloaisp.setSelectedItem(b.getLoaiSanpham());
                    txttensp.setText(b.getTenSanpham());
                    txtdonvitinh.setText(b.getDonVitinh());
                    txtgiasp.setText(b.getGiaBan());
                    if (b.getHinh() != null) {
                        Image img = Image_Doan.createImageFromByteArray(b.getHinh(), "jpg");
                        jlbanh.setIcon(new ImageIcon(img));
                        porsonimage = b.getHinh();
                    } else {
                        txtmasanpham.setText(b.getMaSanpham());
                        txtloaisp.setSelectedItem(b.getLoaiSanpham());
                        txttensp.setText(b.getTenSanpham());
                        txtdonvitinh.setText(b.getDonVitinh());
                        txtgiasp.setText(b.getGiaBan());
                        porsonimage = b.getHinh();
                        ImageIcon icon = new ImageIcon(getClass().getResource("/anhnen/loho.png"));
                        jlbanh.setIcon(icon);
                        btnxoa.setEnabled(true);

                    }
                }

            }
        } catch (Exception ex) {
        }


    }//GEN-LAST:event_tablesanphamMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmasanpham.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã San PhẨM \n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            SANPHAM bk = new SANPHAM();
            bk.setMaSanpham(txtmasanpham.getText());
            bk.setLoaiSanpham(txtloaisp.getSelectedItem().toString());
            bk.setTenSanpham(txttensp.getText());
            bk.setDonVitinh(txtdonvitinh.getText());
            bk.setGiaBan(txtgiasp.getText());
            bk.setHinh(porsonimage);
            SANPHAM_DAO dk = new SANPHAM_DAO();
            dk.insert(bk);
            LoadKhoaTable();
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sản Phẩm Này đã tồn tại trong cửa hàng.");
            e.printStackTrace();
        }
        clear();

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmasanpham.getText().equals("")) {
            sb.append("Vui Lòng Nhập Mã San PhẨM \n");
        }
        if (JOptionPane.showConfirmDialog(this, "BẠN CHẮC CHẮN XÓA SẢN PHẨM NÀY") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SANPHAM bk = new SANPHAM();
            bk.setMaSanpham(txtmasanpham.getText());
            bk.setLoaiSanpham(txtloaisp.getSelectedItem().toString());
            bk.setTenSanpham(txttensp.getText());
            bk.setDonVitinh(txtdonvitinh.getText());
            bk.setGiaBan(txtgiasp.getText());
            bk.setHinh(porsonimage);
            SANPHAM_DAO dk = new SANPHAM_DAO();
            dk.delete(bk);
            LoadKhoaTable();
            JOptionPane.showMessageDialog(this, "Xóa sản phẩm thành công !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        clear();

    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnuppdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuppdateActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtmasanpham.getText().equals("")) {
            sb.append("Ma khoa is required! \n");
        }
        if (JOptionPane.showConfirmDialog(this, "BẠN CHẮC CHẮN MUỐN CẬP NHẬT") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SANPHAM bk = new SANPHAM();
            bk.setMaSanpham(txtmasanpham.getText());
            bk.setLoaiSanpham(txtloaisp.getSelectedItem().toString());
            bk.setTenSanpham(txttensp.getText());
            bk.setDonVitinh(txtdonvitinh.getText());
            bk.setGiaBan(txtgiasp.getText());
            bk.setHinh(porsonimage);

            SANPHAM_DAO dk = new SANPHAM_DAO();

            dk.update(bk);
            LoadKhoaTable();
            JOptionPane.showMessageDialog(this, "Cập nhật sản phẩm thành công ! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
        clear();

    }//GEN-LAST:event_btnuppdateActionPerformed

    private void btnanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanhActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image Fide(*.jpg)";
            }

        });
        if (chooser.showOpenDialog(jPanel1) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = Image_Doan.resize(icon.getImage(), 197, 200);
            ImageIcon resizeIcon = new ImageIcon(img);
            jlbanh.setIcon(resizeIcon);
            porsonimage = Image_Doan.toByteArray(img, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
            messconec.showMessageDialog(jPanel1, e.getMessage(), "lỗi");
        }

    }//GEN-LAST:event_btnanhActionPerformed
    private void clear() {
        txtmasanpham.setText("");
        txttensp.setText("");
        txtgiasp.setText("");
        txtdonvitinh.setText("");
        txtloaisp.setSelectedIndex(0);
        porsonimage = null;
        ImageIcon icon = new ImageIcon(getClass().getResource("/anhnen/loho.png"));
        jlbanh.setIcon(icon);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
        btnthem.setEnabled(false);
        btnxoa.setEnabled(false);
        btnuppdate.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmasanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasanphamActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String timkiem = jTextField1.getText();
        try {
            String query = "Select * from SANPHAMM WHERE TENSP LIKE '%" + timkiem + "%'";
            Connection conn = connect.getConnection();
            PreparedStatement prst = conn.prepareStatement(query);
            ResultSet rs = prst.executeQuery();
            tablesanpham.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased
    public void hide() {
        String masp = txtmasanpham.getText();
        String tensp = txttensp.getText();
        String donvt = txtdonvitinh.getText();
        String giabn = txtgiasp.getText();
        if (!masp.equals("") && !tensp.equals("") && !donvt.equals("") && !giabn.equals("")) {
            btnthem.setEnabled(true);
            btnxoa.setEnabled(true);
            btnuppdate.setEnabled(true);
        } else {
            btnthem.setEnabled(false);
            btnxoa.setEnabled(false);
            btnuppdate.setEnabled(false);
        }

    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
                for (int i = 0; i < tablesanpham.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tablesanpham.getColumnName(i));
                }

                for (int j = 0; j < tablesanpham.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tablesanpham.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tablesanpham.getValueAt(j, k) != null) {
                            cell.setCellValue(tablesanpham.getValueAt(j, k).toString());
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtmasanphamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmasanphamKeyReleased
        hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasanphamKeyReleased

    private void txttenspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttenspKeyReleased
        hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txttenspKeyReleased

    private void txtdonvitinhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdonvitinhKeyReleased
        hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtdonvitinhKeyReleased

    private void txtgiaspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgiaspKeyReleased
        hide();        // TODO add your handling code here:
    }//GEN-LAST:event_txtgiaspKeyReleased

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"MÃ SẢN PHẨM", "LOẠI SẢN PHẨM", "TÊN SẢN PHẨM", "ĐƠN VỊ TÍNH", "ĐƠN GÍA", "ẢNH"});
        tablesanpham.setModel(tblModel);
    }

    public void LoadKhoaTable() throws Exception {
        lstSanPham = SANPHAM_DAO.getALL();
        if (lstSanPham != null) {
            tblModel.setRowCount(0);
            for (SANPHAM pn : lstSanPham) {
                Vector vec = new Vector();
                vec.add(pn.getMaSanpham());
                vec.add(pn.getLoaiSanpham());
                vec.add(pn.getTenSanpham());
                vec.add(pn.getDonVitinh());
                vec.add(pn.getGiaBan());
                vec.add(pn.getHinh());
                tblModel.addRow(vec);
            }
        }
    }

    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanh;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnuppdate;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbanh;
    private javax.swing.JTable tablesanpham;
    private javax.swing.JTextField txtdonvitinh;
    private javax.swing.JTextField txtgiasp;
    private javax.swing.JComboBox<String> txtloaisp;
    private javax.swing.JTextField txtmasanpham;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables
}
