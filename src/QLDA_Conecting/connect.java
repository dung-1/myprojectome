/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_Conecting;

/**
 *
 * @author NGUYEN DUNG
 */
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class connect {

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     * @return
     * @throws java.lang.Exception
     */
    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-SKTO6KP\\SQLEXPRESS:1433;databaseName=QuanLy_TraSua;encrypt=true;trustServerCertificate=true;";
        String userName = "sa";
        String password = "12345678";
        conn = DriverManager.getConnection(url, userName, password);
        System.out.println("thành công ");
        return conn;

    }

}
