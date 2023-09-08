package connectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	//DB connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");  //driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb","root","sweet720!!");
												//jdbc:mariadb://ip주소:포트번호/스키마(데이터베이스이름),로그인할계정,계정비밀번호
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//connection close
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//insert 
	public static void insertUser(String id,String name) {
		Connection conn = getConnection();
		String sql = String.format("insert into user (id,name) values('%s','%s')", id,name);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개의 데이터 삽입");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	public static void updateUserName(String id,String name) {
		Connection conn = getConnection();
		String sql = String.format("update user set name = '%s' where id = '%s'", name,id);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개의 데이터 변경");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	public static void deleteUser(String id) {
		Connection conn = getConnection();
		String sql = String.format("delete from user where id = '%s'",id);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개의 데이터 삭제");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	public static void userInfo(String id) {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = String.format("select * from user where id ='%s'",id);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null && rs.next()) {
				String resultId = rs.getString("id");
				String resultName = rs.getString("name");
				System.out.println(String.format("ID:%s NAME:%s",resultId,resultName));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	public static void allUserInfo() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = String.format("select * from user");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null) {
				while(rs.next()) {
					String resultId = rs.getString(1);
					String resultName = rs.getString(2);
					System.out.println(String.format("ID:%s NAME:%s",resultId,resultName));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	public static void main(String[] args) {

//		insertUser("song","송길동");
//		insertUser("jojo","조조");
//		insertUser("koko","코코");
//		updateUserName("song","송송이");
//		deleteUser("song");
//		userInfo("jang");
		allUserInfo();
	}

}
