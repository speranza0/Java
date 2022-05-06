package sm.service;

import java.util.List;

import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;
import sm.repository.Repository;

public class Service {
	private Repository repository = new Repository();
	
	// 학생 등록
	public StudentDTO createStudent(String studentName, int studentClass, String studentBirth) {
		StudentDTO studentdto = new StudentDTO(studentName, studentClass, studentBirth);
		repository.createOne(studentdto);
		return studentdto;
	}
	
	// 학생 전체 조회
	public List<StudentDTO> selectAll() {
		return repository.selectAll();
	}
	
	// 학생 검색 조회
	public StudentDTO selectOneStudent(int idx) {
		return repository.selectOne(idx);
	}
	
	// 학생 수정
	public void updateOneStudent(int idx, String studentName, int studentClass, String studentBirth) {
		StudentDTO studentdto = new StudentDTO(studentName, studentClass, studentBirth);
		repository.updateOne(idx, studentdto);
	}
	
	// 학생 삭제
	public void removeOneStudent(int idx) {
		repository.removeOne(idx, null);
	}
	
	// 성적 등록
	public ScoreDTO createScore(int studentNum, String studentName, int kor, int math, int eng) {
		ScoreDTO scoredto = new ScoreDTO(studentNum, studentName, kor, math, eng);
		repository.createScore(scoredto);
		return scoredto;
	}
	
	// 성적 조회
	public ScoreDTO selectScore(int idx) {
		return repository.selectScore(idx);
	}
	
	// 성적 수정
	public void updateScore(int studentNum, String studentName, int kor, int math, int eng) {
		ScoreDTO scoredto = new ScoreDTO(kor, math, eng);
		repository.updateScore(studentNum, studentName, scoredto);
	}
	
	// 성적 삭제
	public void removeScore(int studentNum, String studentName) {
		repository.removeScore(studentNum, studentName, null);
	}
}
