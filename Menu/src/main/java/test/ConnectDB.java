package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection conn() throws SQLException {
		String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=menu;encrypt=true;trustServerCertificate=true";
		String user = "GSI";
		String pass = "GLORY";
		Connection con = DriverManager.getConnection(url, user, pass);
		//System.out.println("Connected");
		return con;
	}
}
