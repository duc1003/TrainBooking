package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import constant.Constant;

public class DBUtils {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/" + Constant.DB_NAME;
        try {
            conn = DriverManager.getConnection(url, Constant.USERNAME, Constant.PASSWORD);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeDB(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static Statement getStatement() {
		Statement st = null;
		Connection conn = null;
		try {
			conn = getConnection();
			st = conn.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return st;
	}
     public static void main(String[] args) {
         Connection conn = null;

         conn = getConnection();
         if (conn != null) {
             System.out.println("connection successfully");
         } else System.out.println("connection fails");
         Statement stm = null;
         try {
             stm = conn.createStatement();
         } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         if (stm != null) {
            System.out.println("createStatement successfully");
         } else {
             System.out.println("createStatement fails");
        }
     }
}
