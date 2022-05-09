package sm.service;

import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;
import sm.repository.ScoreRepository;
import sm.repository.StudentRepository;

public class ScoreService {
	private StudentRepository studentRepository = new StudentRepository();
	private ScoreRepository scoreRepository = new ScoreRepository();
	
	// 학생 검색 조회
	public StudentDTO selectOneStudent(int idx) {
		return studentRepository.selectOne(idx);
	}
	
	// 성적 등록
	public ScoreDTO createScore(int studentNum, int kor, int math, int eng) {
		StudentDTO stduent = studentRepository.selectOne(studentNum);
		if(stduent == null) {
			return null;
		}
		
		ScoreDTO scoredto = new ScoreDTO(kor, math, eng);
		scoreRepository.createScore(stduent, scoredto);
		
		return scoredto;
	}
	
	// 성적 조회
	public ScoreDTO selectScore(int studentNum) {
		StudentDTO stduent = studentRepository.selectOne(studentNum);
		return scoreRepository.selectScore(stduent);
	}
	
	// 성적 수정
	public void updateScore(int studentNum, int kor, int math, int eng) {
		StudentDTO stduent = studentRepository.selectOne(studentNum);
		ScoreDTO scoredto = new ScoreDTO(kor, math, eng);
		scoreRepository.updateScore(stduent, scoredto);
	}
	
	// 성적 삭제
	public void removeScore(int studentNum) {
		StudentDTO stduent = studentRepository.selectOne(studentNum);
		scoreRepository.removeScore(stduent);
	}
}
