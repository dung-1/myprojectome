/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;

import QLDA_Conecting.connect;
import QLDA_Model.CTHoaDon;
import QLDA_Model.KHACHHANG;
import QLDA_Model.SANPHAM;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.JTextField;

/**
 *
 * @author NGUYEN DUNG
 */
public class CTDonHang_DAO {

    public static ArrayList<CTHoaDon> getALL() throws Exception {
        ArrayList<CTHoaDon> lst = new ArrayList<>();
        Connection conn = connect.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from CHITIETHOADONN";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CTHoaDon bk = new CTHoaDon();
                bk.setMaHoaDon(rs.getString(1));
                bk.setMaSanPham(rs.getString(2));
                bk.setSoLuong(rs.getString(3));
                bk.setDonGia(rs.getString(4));
                bk.setThanhTien(rs.getString(5));
                lst.add(bk);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lst;
    }

    public CTHoaDon FindMaKhachHang(String mhoadon) throws Exception {
        String sql = "select * from CHITIETHOADONN where MAHD=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setString(1, mhoadon);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            CTHoaDon bk = new CTHoaDon();
            bk.setMaHoaDon(rs.getString("MAHD"));
            bk.setMaSanPham(rs.getString("MASP"));
            bk.setSoLuong(rs.getString("SOLUONG"));
            bk.setDonGia(rs.getString("DONGIA"));
            bk.setThanhTien(rs.getString("THANHTIEN"));
            return bk;
        }
        return null;
    }

    public boolean insert(CTHoaDon bk) throws Exception {
        String sql = "insert into CHITIETHOADONN (MAHD,MASP,SOLUONG,DONGIA,THANHTIEN) values (?,?,?,?,?)";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaHoaDon());
            prst.setString(2, bk.getMaSanPham());
            prst.setString(3, bk.getSoLuong());
            prst.setString(4, bk.getDonGia());
            prst.setString(5, bk.getThanhTien());

        }
        return prst.executeUpdate() > 0;
    }

    public boolean update(CTHoaDon bk) throws Exception {
        String sql = "update  CHITIETHOADONN set  MASP=?, SOLUONG=?,DONGIA=?,THANHTIEN=? where MAHD=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(5, bk.getMaHoaDon());
            prst.setString(1, bk.getMaSanPham());
            prst.setString(2, bk.getSoLuong());
            prst.setString(3, bk.getDonGia());
            prst.setString(4, bk.getThanhTien());
        }
        return prst.executeUpdate() > 0;
    }

    public boolean delete(CTHoaDon bk) throws Exception {
        String sql = ("DELETE FROM CHITIETHOADONN WHERE (MAHD =?) ");
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaHoaDon());
        }
        return prst.executeUpdate() > 0;

    }
}
