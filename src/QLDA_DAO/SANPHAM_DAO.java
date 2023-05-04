/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;

import QLDA_Conecting.connect;
import QLDA_Model.SANPHAM;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author NGUYEN DUNG
 */
public class SANPHAM_DAO {

    public static ArrayList<SANPHAM> getALL() throws Exception {
        ArrayList<SANPHAM> lst = new ArrayList<>();
        Connection conn = connect.getConnection();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from SANPHAMM";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                SANPHAM bk = new SANPHAM();
                bk.setMaSanpham(rs.getString(1));
                bk.setLoaiSanpham(rs.getString(2));
                bk.setTenSanpham(rs.getString(3));
                bk.setDonVitinh(rs.getString(4));
                bk.setGiaBan(rs.getString(5));
                Blob blob=rs.getBlob(6);
                if(blob!=null){
                    bk.setHinh(blob.getBytes(1, (int)blob.length()));
                }
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

    public SANPHAM FindMaSanPham(String Msanpham) throws Exception {
        String sql = "select * from SANPHAMM where MASP=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setString(1, Msanpham);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            SANPHAM bk = new SANPHAM();
            bk.setMaSanpham(rs.getString("MASP"));
            bk.setLoaiSanpham(rs.getString("LOAISP"));
            bk.setTenSanpham(rs.getString("TENSP"));
            bk.setDonVitinh(rs.getString("DONVITINH"));
            bk.setGiaBan(rs.getString("DONGIA"));
            Blob  blob =  rs.getBlob("IMG");
            bk.setHinh(blob.getBytes(1, (int) blob.length()));
            return bk;
        }
        return null;
    }

    public boolean insert(SANPHAM bk) throws Exception {
        String sql = "insert into SANPHAMM (MASP, LOAISP,TENSP, DONVITINH,DONGIA,IMG) values (?,?,?,?,?,?)";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaSanpham());
            prst.setString(2, bk.getLoaiSanpham());
            prst.setString(3, bk.getTenSanpham());
            prst.setString(4, bk.getDonVitinh());
            prst.setString(5, bk.getGiaBan());
            if (bk.getHinh() != null) {
                Blob hinh = new SerialBlob(bk.getHinh());
                prst.setBlob(6, hinh);
            } else {
                Blob hinh = null;
                prst.setBlob(6, hinh);
            }
        }
        return prst.executeUpdate() > 0;
    }

    public boolean update(SANPHAM bk) throws Exception {
        String sql = "update  SANPHAMM set  LOAISP=?,TENSP=?, DONVITINH=?,DONGIA=?,IMG=? where MASP=?";
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getLoaiSanpham());
            prst.setString(2, bk.getTenSanpham());
            prst.setString(3, bk.getDonVitinh());
            prst.setString(4, bk.getGiaBan());
            if (bk.getHinh() != null) {
                Blob hinh = new SerialBlob(bk.getHinh());
                prst.setBlob(5, hinh);
            } else {
                Blob hinh = null;
                prst.setBlob(5, hinh);
            }
                prst.setString(6, bk.getMaSanpham());

        }
        return prst.executeUpdate()>0 ;
    }

    public boolean delete(SANPHAM bk) throws Exception {
        String sql = ("DELETE FROM SANPHAMM WHERE (MASP =?) ");
        Connection conn = connect.getConnection();
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setString(1, bk.getMaSanpham());
        }
        return prst.executeUpdate() > 0;

    }
}
