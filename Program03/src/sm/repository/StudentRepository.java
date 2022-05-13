package sm.repository;

import java.util.List;
import java.util.Set;

import sm.db.Database;
import sm.dto.StudentDTO;

public class StudentRepository {
	private List<StudentDTO> studentList;
	private Set<Integer> number;
	
	public StudentRepository() {
		studentList = Database.studentList;
		number = Database.number;
	}
	
	// 학생 등록
	public void createOne(StudentDTO emp) {
		// 학번생성
		int studentNum = 0;
		
		while(true) {
			int randomNum = (int)(Math.random()*(999999 - 100000 + 1) + 100000);
			boolean isUnique = number.add(randomNum);
			if(isUnique) {
				studentNum = randomNum;
				break;
			}
		}
		
		emp.setStudentNum(studentNum);
		
		studentList.add(emp);
	}
	
	// 학생 전체 조회
	public List<StudentDTO> selectAll() {
		return studentList;
	}
	
	// 전체 학생 수
	public int countAll() {
		return studentList.size();
	}
	
	// 학생 검색
	public StudentDTO selectOne(int idx) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum() == idx) {
				return studentList.get(i);
			}
		}
		return null;
	}
	
	// 학생 수정
	public void updateOne(int studentNum, StudentDTO emp) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum() == studentNum) {
				emp.setStudentNum(studentNum);
				studentList.remove(i);
				studentList.add(emp);;
				break;
			}
		}
	}
	
	// 학생 삭제
	public void removeOne(int idx) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum() == idx) {
				studentList.remove(i);
			}
		}
	}
}
