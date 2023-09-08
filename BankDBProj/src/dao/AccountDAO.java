package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import acc.Account;
import acc.SpecialAccount;

public class AccountDAO {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"),
					db.getProperty("user"),db.getProperty("password"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//selectAccount
	public static Account selectAccount(Connection conn,String id) {
		Account acc = null;
		String sql = "select * from account where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null && rs.next()) {
				String rsId = rs.getString("id");
				String rsName = rs.getString("name");
				Integer rsBalance = rs.getInt("balance");
				String rsGrade = rs.getString("grade");
				//grade 가 있으면 스페셜 없으면 일반계좌로 분류
				if(rsGrade == null) {
					acc = new Account(rsId,rsName,rsBalance);
				} else {
					acc = new SpecialAccount(rsId,rsName,rsBalance,rsGrade);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return acc;
	}
	
	
	
	
	
	
	
	
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			} 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
