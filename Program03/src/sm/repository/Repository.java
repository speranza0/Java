package sm.repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;

public class Repository {
	private List<StudentDTO> studentList;
	private List<ScoreDTO> scoreList;
	
	public Repository() {
		studentList = new ArrayList<StudentDTO>();
		scoreList = new ArrayList<ScoreDTO>();
	}
	
	
	// 학생 등록
	public void createOne(StudentDTO emp) {
		// 학번생성
		int studentNum = (int)(Math.random()*999999 + 1);
		emp.setStudentNum(studentNum);
		
		studentList.add(emp);
		
		// 나이 계산해서 생성
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate dateTime = LocalDate.parse(emp.getStudentBirth(), dtf);
		int studentAge = date.compareTo(dateTime);
		emp.setStudentAge(studentAge);
	}
	
	// 학생 전체 조회
	public List<StudentDTO> selectAll() {
		return studentList;
	}
	
	// 학생 검색
	public StudentDTO selectOne(int idx) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				return studentList.get(i);
			}
		}
		return null;
	}
	
	// 학생 수정
	public void updateOne(int idx, StudentDTO emp) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				emp.setStudentNum(idx);
				studentList.remove(i);
				studentList.add(emp);
				
				scoreList.get(i).setStudentName(emp.getStudentName());
				
				LocalDate date = LocalDate.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				LocalDate dateTime = LocalDate.parse(emp.getStudentBirth(), dtf);
				int studentAge = date.compareTo(dateTime);
				emp.setStudentAge(studentAge);
				break;
			}
		}
	}
	
	// 학생 삭제
	public void removeOne(int idx, StudentDTO emp) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				studentList.remove(i);
			}
		}
	}
	
	// 성적 등록
	public void createScore(ScoreDTO empS) {
		scoreList.add(empS);
	}
	
	// 성적 조회
	public ScoreDTO selectScore(int idx) {
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i) != null && scoreList.get(i).getStudentNum() == idx) {
				return scoreList.get(i);
			}
		}
		return null;
	}
	
	// 성적 수정
	public void updateScore(int idx, String studentName, ScoreDTO empS) {
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i) != null && scoreList.get(i).getStudentNum() == idx) {
				empS.setStudentNum(idx);
				empS.setStudentName(studentName);
				scoreList.remove(i);
				scoreList.add(empS);
				break;
			}
		}
	}
	
	// 성적 삭제
	public void removeScore(int idx, String studentName, ScoreDTO empS) {
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i) != null && scoreList.get(i).getStudentNum() == idx) {
				empS.setStudentNum(idx);
				empS.setStudentName(studentName);
				scoreList.remove(i);
			}
		}
	}
}
