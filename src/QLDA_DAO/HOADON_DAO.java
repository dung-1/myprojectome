/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;
import QLDA_Conecting.connect;
import QLDA_Model.CTHoaDon;
import QLDA_Model.HOADON;
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
public class HOADON_DAO {
      public static ArrayList<HOADON> getALL() throws Exception {
        ArrayList<HOADON> lst = new ArrayList<>();
        Connection conn = connect.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from HOADONN";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                HOADON bk = new HOADON();
                bk.setMaHoaDon(rs.getString(1));
                bk.setMaKhachHang(rs.getString(2));
                bk.setNgayLap(rs.getString(3));
                bk.setTongTien(rs.getString(4));
                bk.setGhiChu(rs.getString(5));
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

    public HOADON FindMaKhachHang(String mhoadon) throws Exception {
        String sql = "select * from HOADONN where MAHD=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setString(1, mhoadon);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            HOADON bk = new HOADON();
            bk.setMaHoaDon(rs.getString("MAHD"));
            bk.setMaKhachHang(rs.getString("MAKH"));
            bk.setNgayLap(rs.getString("NGAYLAP"));
            bk.setTongTien(rs.getString("TONGTIEN"));
            bk.setGhiChu(rs.getString("GHICHU"));
            return bk;
        }
        return null;
    }
  

    public boolean insert(HOADON bk) throws Exception {
        String sql = "insert into HOADONN (MAHD,MAKH,NGAYLAP,TONGTIEN,GHICHU) values (?,?,?,?,?)";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaHoaDon());
            prst.setString(2, bk.getMaKhachHang());
           prst.setTimestamp(3, new java.sql.Timestamp(new java.util.Date().getTime()));
            prst.setString(4, bk.getTongTien());
            prst.setString(5, bk.getGhiChu());

        }
        return prst.executeUpdate() > 0;
    }

    public boolean update(HOADON bk) throws Exception {
        String sql = "update  HOADONN set  MAKH=?, NGAYLAP=?,TONGTIEN=?,GHICHU=? where MAHD=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
              prst.setString(5, bk.getMaHoaDon());
            prst.setString(1, bk.getMaKhachHang());
           prst.setTimestamp(2, new java.sql.Timestamp(new java.util.Date().getTime()));
            prst.setString(3, bk.getTongTien());
            prst.setString(4, bk.getGhiChu());
        }
        return prst.executeUpdate() > 0;
    }

    public boolean delete(HOADON bk) throws Exception {
        String sql = ("DELETE FROM HOADONN WHERE (MAHD =?) ");
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaKhachHang());
        }
        return prst.executeUpdate() > 0;

    }
}
