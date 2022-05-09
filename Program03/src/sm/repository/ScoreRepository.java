package sm.repository;

import java.util.List;

import sm.db.Database;
import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;

public class ScoreRepository {
	
	private List<StudentDTO> studentList;
	
	public ScoreRepository() {
		studentList = Database.studentList;
	}
	
	// 성적 편집을 위한 조회 메서드
	public void updateStudentScore(StudentDTO student, ScoreDTO empS) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum() == student.getStudentNum()) {
				studentList.get(i).setScore(empS);
				break;
			}
		}
	}
		
	// 성적 등록
	public void createScore(StudentDTO student, ScoreDTO empS) {
		updateStudentScore(student, empS);
	}
	
	// 성적 조회
	public ScoreDTO selectScore(StudentDTO student) {
		return student.getScore();
	}
	
	// 성적 수정
	public void updateScore(StudentDTO student, ScoreDTO empS) {
		updateStudentScore(student, empS);
	}
	
	// 성적 삭제
	public void removeScore(StudentDTO student) {
		updateStudentScore(student, null);
	}
}
