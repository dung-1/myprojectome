/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;

import QLDA_Conecting.connect;
import QLDA_Model.SANPHAM;
import QLDA_Model.TAIKHOAN;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
//import java.sql.Db;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN DUNG
 */
public class TAIKHOAN_DAO {

    public boolean doiMatKhau(TAIKHOAN bk) throws Exception {
        try {
            String sql = "UPDATE TAIKHOAN SET PASS_WORD=? WHERE USER_NAMES=? AND PASS_WORD=?";
            Connection conn = connect.getConnection();
            PreparedStatement pre = conn.prepareStatement(sql);
            TAIKHOAN tk = new TAIKHOAN();
            pre.setString(1, bk.getMatKhau());
            pre.setString(2, tk.getTenTaiKhoan());
            pre.setString(3, bk.getMatKhau());
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public static void update(String user, String newpass_word) throws Exception {
        String query = "UPDATE TAIKHOAN SET PASS_WORD='" + newpass_word + "' WHERE USER_NAMES='" + user + "' ";
        DbOperations.SetDataOrDelete(query, "change thành công");
    }

    public static void changePassWord(String email, String oldpass, String newpass) {
        try {
            ResultSet rs = DbOperations.getdata("SELECT * FROM TAIKHOAN WHERE USER_NAMES='" + email + "' AND PASS_WORD ='" + oldpass + "'");
            if (rs.next()) {
                update(email, newpass);
            } else {
                JOptionPane.showMessageDialog(null, "mât khau sai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
