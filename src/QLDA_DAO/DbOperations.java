/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_DAO;


import QLDA_Conecting.connect;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN DUNG
 */
public class DbOperations {

    public static void SetDataOrDelete(String query, String msg) {
        try {
            Connection conn = connect.getConnection();
            Statement st = conn.createStatement();
            st.executeQuery(query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "mât khau1");

        }

    }

    public static ResultSet getdata(String query) {
        try {
            Connection conn = connect.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "mât khau 2");
            return null;

        }

    }

}
