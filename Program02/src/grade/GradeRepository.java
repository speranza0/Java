package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.JdbcUtils;

public class GradeRepository {
	Connection conn;
	
	public GradeRepository() {
		conn = JdbcUtils.getConnection("grade");
	}
	
	public void createOne(Student student) {
		String sql = "INSERT INTO student(name, kor, eng, math) VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getKor());
			pstmt.setInt(3, student.getEng());
			pstmt.setInt(4, student.getMath());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(pstmt);
		}
	}
	
	public List<Student> selectAll() {
		String sql = "SELECT * FROM student";
		Statement stmt = null;
		List<Student> studentList = null;
		
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			studentList = new ArrayList<Student>();
			
			while(rs.next()) {
				Student student = new Student(rs.getInt("idx"), rs.getString("name"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("math"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(stmt);
		}
		
		return studentList;
	}
}
