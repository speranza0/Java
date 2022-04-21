package grade;

import java.io.IOException;

/*
 * 사용자 <-> 로직을 연결
 * 
 * */
public class GradeController {
	public static void main(String[] args) throws IOException {
		GradeService service = new GradeService();
		
		int menu = 0;
		while(true) {
			service.showMenu();
			System.out.print("선택 = ");
			menu = Integer.parseInt(GradeService.in.readLine());
			
			// 사용자가 선택한 번호에 따라 작업을 수행하는 로직을 실행한다.
			switch(menu) {
			case 1:
				service.addStudent();
				break;
			case 2:
				service.showAllStudent();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("선택이 올바르지 않습니다.");
				break;
			}
			System.out.println();
		}
	}
}
