package sm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import sm.dto.StudentDTO;
import sm.service.StudentService;

/*
* ====< 학생정보 관리 >====
* 1. 학생정보 입력
* 2. 학생정보 조회(전체 출력)
* 3. 학생정보 검색
* 4. 학생정보 변경
* 5. 학생정보 삭제
* 6. 첫화면으로
* 선택 = 
*/
public class StudentController {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	StudentService service = new StudentService();
	
	public int mainMenu() throws IOException {
		System.out.println("====< 학생정보 관리 >====");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회(전체 출력)");
		System.out.println("3. 학생정보 검색");
		System.out.println("4. 학생정보 변경");
		System.out.println("5. 학생정보 삭제");
		System.out.println("6. 첫화면으로");
		System.out.print("선택 = ");
		int studentMenu = Integer.parseInt(in.readLine());
		return studentMenu;
	}
	
	public void createMenu() throws IOException {
		System.out.println("====< 학생정보 입력 >====");
		System.out.print("이름 = ");
		String studentName = in.readLine();
		
		int studentClass = 0;
		do {
			System.out.print("학년 = ");
			studentClass = Integer.parseInt(in.readLine());
		} while(studentClass < 1 || studentClass > 4);
		

		String studentBirth;
		do {
			System.out.print("생년월일 = ");
			studentBirth = in.readLine();
		} while(studentBirth.length() != 8);
		
		StudentDTO dto = service.createStudent(studentName, studentClass, studentBirth);
		
		System.out.println(studentName + "(" + dto.getStudentNum() + ") 학생 정보가 등록되었습니다.");

	}
	
	public void listMenu() {
		List<StudentDTO> studentList = service.selectAll();
		int studentCount = service.countAll();
		System.out.println("====< 학생정보 조회 >====");
		System.out.println("등록된 학생수 : " + studentCount);
		System.out.println("학번\t이름\t학년\t생년월일\t나이");
		for(int i = 0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i).getStudentNum() + "\t");
			System.out.print(studentList.get(i).getStudentName() + "\t");
			System.out.print(studentList.get(i).getStudentClass() + "\t");
			System.out.print(studentList.get(i).getStudentBirth() + "\t");
			System.out.println(studentList.get(i).calStudentAge());
		}
	}
	
	public void searchMenu() throws IOException {
		System.out.println("====< 학생정보 검색 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int searchNum = Integer.parseInt(in.readLine());
		StudentDTO search = service.selectOneStudent(searchNum);
		
		try {
			if(search.getStudentNum() != searchNum) {
				System.out.println("학번이 올바르지 않습니다.");
			} else {
				System.out.println("이름 = " + search.getStudentName());
				System.out.println("학년 = " + search.getStudentClass());
				System.out.println("생년월일 = " + search.getStudentBirth());
				System.out.println("나이 = " + search.calStudentAge());
			}
		} catch(NullPointerException e) {
			System.out.println("등록된 학번이 아닙니다.");
		}
	}
	
	public void changeMenu() throws IOException {
		System.out.println("====< 학생정보 변경 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int updateNum = Integer.parseInt(in.readLine());
		System.out.println();
		StudentDTO update = service.selectOneStudent(updateNum);
		
		if(update == null) {
			System.out.println("등록된 학번이 아닙니다.");
			return;
		}
		
		System.out.print("이름(" + update.getStudentName() + ") = ");
		String newName = in.readLine();
		System.out.print("학년(" + update.getStudentClass() + ") = ");
		int newClass = Integer.parseInt(in.readLine());
		System.out.print("생년월일(" + update.getStudentBirth() + ") = ");
		String newBirth = in.readLine();
		System.out.println();
		
		service.updateOneStudent(updateNum, newName, newClass, newBirth);
		System.out.println(newName + "(" + updateNum + ")" + "학생의 정보가 변경되었습니다.");
	}
	
	public void removeMenu() throws IOException {
		System.out.println("====< 학생정보 삭제 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int removeNum = Integer.parseInt(in.readLine());
		System.out.println();
		StudentDTO remove = service.selectOneStudent(removeNum);
		
		if(remove == null) {
			System.out.println("등록된 학번이 아닙니다.");
			return;
		}
		
		// null safe
		if(remove.getStudentNum() != removeNum) {
			System.out.println("학번이 올바르지 않습니다.");
		} else {
			System.out.print(remove.getStudentName() + "(" + remove.getStudentNum() + ") 정보를 삭제하시겠습니까 (Y,N) =");
			String yesorno = in.readLine();
			if("Y".equals(yesorno)) {
				service.removeOneStudent(removeNum);
				System.out.println(remove.getStudentName() + "(" + remove.getStudentNum() + ") 학생 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제를 취소했습니다. 돌아갑니다.");
			}
		}
	}
}
