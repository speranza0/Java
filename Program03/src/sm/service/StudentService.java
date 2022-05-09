package sm.service;

import java.util.List;

import sm.dto.StudentDTO;
import sm.repository.StudentRepository;

public class StudentService {
	private StudentRepository repository = new StudentRepository();
	
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
	public int countAll() {
		return repository.countAll();
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
		repository.removeOne(idx);
	}
}
