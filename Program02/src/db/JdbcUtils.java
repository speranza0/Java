package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 데이터베이스에 연결하여 
 * 데이터베이스로 접근할 수 있는 인스턴스를 제공한다.
 * */
public class JdbcUtils {
	static {
		// 클래스가 로딩될때 한번 호출되는 영역
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	// DB 작업에 필요한 Connection 객체를 생성해주는 메서드
	public static Connection getConnection() {
		String url = "jdbc:mariadb://127.0.0.1:3306/bank";
		String user = "root";
		String password = "1234";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("DB 연동 실패");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// transaction 처리하는 메서드
	public static void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
