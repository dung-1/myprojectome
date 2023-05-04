/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_Conecting;

import static QLDA_Conecting.connect.conn;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN DUNG
 */
public class conect {

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cuahang";
        var user = "root";
        var password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("thành công ");
        return conn;

    }

}
