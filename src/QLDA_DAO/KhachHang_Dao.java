/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;

import QLDA_Conecting.connect;
import QLDA_Model.KHACHHANG;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author NGUYEN DUNG
 */
public class KhachHang_Dao {

    public static ArrayList<KHACHHANG> getALL() throws Exception {
        ArrayList<KHACHHANG> lst = new ArrayList<>();
        Connection conn = connect.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from KHACHHANGG";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                KHACHHANG bk = new KHACHHANG();
                bk.setMaKhachHang(rs.getString(1));
                bk.setTenKhachHang(rs.getString(2));
                bk.setSoDienthoai(rs.getString(3));
                bk.setNgayMua(rs.getDate(4));
                bk.setThanhToan(rs.getString(5));
                bk.setGhiChu(rs.getString(6));
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

    public KHACHHANG FindMaKhachHang(String mKhachhang) throws Exception {
        String sql = "select * from KHACHHANGG where MAKH=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setString(1, mKhachhang);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            KHACHHANG bk = new KHACHHANG();
            bk.setMaKhachHang(rs.getString("MAKH"));
            bk.setTenKhachHang(rs.getString("TENKH"));
            bk.setSoDienthoai(rs.getString("SODIENTHOAI"));
            bk.setNgayMua(rs.getDate("NGAYMUA"));
            bk.setThanhToan(rs.getString("THANHTOAN"));
            bk.setGhiChu(rs.getString("GHICHU"));
            return bk;
        }
        return null;
    }

    public boolean insert(KHACHHANG bk) throws Exception {
        String sql = "insert into KHACHHANGG (MAKH,TENKH,SODIENTHOAI,NGAYMUA,THANHTOAN,GHICHU) values (?,?,?,?,?,?)";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaKhachHang());
            prst.setString(2, bk.getTenKhachHang());
            prst.setString(3, bk.getSoDienthoai());
           prst.setTimestamp(4, new java.sql.Timestamp(new java.util.Date().getTime()));
//            prst.setDate(4, (Date) bk.getNgayMua());
            prst.setString(5, bk.getThanhToan());
            prst.setString(6, bk.getGhiChu());

        }
        return prst.executeUpdate() > 0;
    }

    public boolean update(KHACHHANG bk) throws Exception {
        String sql = "update  KHACHHANGG set  TENKH=?,SODIENTHOAI=?, NGAYMUA=?,THANHTOAN=?,GHICHU=? where MAKH=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getTenKhachHang());
            prst.setString(2, bk.getSoDienthoai());
            prst.setTimestamp(3, new java.sql.Timestamp(new java.util.Date().getTime()));
            prst.setString(4, bk.getThanhToan());
            prst.setString(5, bk.getGhiChu());
            prst.setString(6, bk.getMaKhachHang());

        }
        return prst.executeUpdate() > 0;
    }

    public boolean delete(KHACHHANG bk) throws Exception {
        String sql = ("DELETE FROM KHACHHANGG WHERE (MAKH =?) ");
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaKhachHang());
        }
        return prst.executeUpdate() > 0;

    }
}
