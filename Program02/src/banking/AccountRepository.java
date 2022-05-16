package banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.JdbcUtils;

/*
 * 데이터베이스 바로 앞에서 SQL 구문을 전송하는 역할을 수행하는 클래스
 * */
public class AccountRepository {
	Connection conn;
	
	public AccountRepository() {
		conn = JdbcUtils.getConnection("bank");
	}
	
	public void createOne(Account account) {
		String sql = "INSERT INTO account(number, balance, name) VALUES(?, ?, ?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountNum());
			pstmt.setInt(2, account.getBalance());
			pstmt.setString(3, account.getName());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(pstmt);
		}
	}
	
	public Account selectOne(String accountNum) {
		String sql = "SELECT * FROM account WHERE number = ?";
		PreparedStatement pstmt = null;
		Account account = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				account = new Account(rs.getInt("idx"), rs.getString("number"), rs.getInt("balance"), rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(pstmt);
		}
		return account;
	}
	
	public List<Account> selectAll() {
		String sql = "SELECT * FROM account";
		Statement stmt = null;
		List<Account> accountList = null;
		
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			accountList = new ArrayList<Account>();
			
			while(rs.next()) {
				Account account = new Account(rs.getInt("idx"), rs.getString("number"), rs.getInt("balance"), rs.getString("name"));
				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(stmt);
		}
		
		return accountList;
	}
	
	public void updateOne(int idx, Account account) {
		String sql = "UPDATE account SET balance = ? WHERE idx = ?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setInt(2, idx);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(pstmt);
		}
	}
}
