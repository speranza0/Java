package sm.service;

import sm.dto.StudentDTO;
import sm.repository.Repository;

public class Service {
	private Repository repository = new Repository();
	
	public void createStudent(String studentName, int studentClass, int studentBirth) {
		StudentDTO studentdto = new StudentDTO(studentName, studentClass, studentBirth);
		repository.createOne(studentdto);
	}
}
