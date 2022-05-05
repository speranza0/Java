package sm.repository;

import java.util.ArrayList;
import java.util.List;

import sm.dto.StudentDTO;

public class Repository {
	private List<StudentDTO> studentList;
	
	public Repository() {
		studentList = new ArrayList<StudentDTO>();
	}
	
	// 등록
	public void createOne(StudentDTO emp) {
		int studentNum = (int)(Math.random()*999999 + 1);
		emp.setStudentNum(studentNum);
		studentList.add(emp);
		System.out.println(emp);
	}
	
	// 전체 조회
	public List<StudentDTO> selectAll() {
		return studentList;
	}
	
	// 한명 조회
	public StudentDTO selectOne(int idx) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				return studentList.get(i);
			}
		}
		return null;
	}
	
	// 수정
	public void updateOne(int idx, StudentDTO emp) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				emp.setStudentNum(idx);
				studentList.remove(i);
				studentList.add(emp);
				break;
			}
		}
	}
	
	// 삭제
	public void removeOne(int idx, StudentDTO emp) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i) != null && studentList.get(i).getStudentNum() == idx) {
				studentList.remove(i);
			}
		}
	}
}
