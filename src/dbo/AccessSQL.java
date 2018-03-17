/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ThoDT
 */
public class AccessSQL {

    String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String DB_URL = "jdbc:sqlserver://localhost";
    String SERVER_NAME = null;
    String PORT = null;
    String DB_NAME = null;
    String USER = null;
    String PASS = null;

    Connection con = null;
    Statement stm = null;

    // my default
    public AccessSQL() {
        SERVER_NAME = "KIEMHH";
        PORT = "1433";
        DB_NAME = "Manager";
        USER = "sa";
        PASS = "123456";
        connectDB();
    }

    public AccessSQL(String SERVER_NAME, String PORT, String DB_NAME, String USER, String PASS) {
        this.SERVER_NAME = SERVER_NAME;
        this.PORT = PORT;
        this.DB_NAME = DB_NAME;
        this.USER = USER;
        this.PASS = PASS;
        connectDB();
    }

    public void connectDB() {
        String URL = DB_URL + "\\" + SERVER_NAME + ":" + PORT + ";database=" + DB_NAME;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            stm = con.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public ResultSet executeQuery(String selectSql) {
        if (con == null) 
            return null;
        try {
            return stm.executeQuery(selectSql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }

    public int executeUpdate(String updateSql) {
        if (con == null) 
            return 0;
        try {
            return stm.executeUpdate(updateSql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
}
