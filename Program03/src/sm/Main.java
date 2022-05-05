package sm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sm.service.Service;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Service service = new Service();
		
		while(true) {
			System.out.println("====< 학생정보관리 프로그램 >====");
			System.out.println("1. 학생정보 관리");
			System.out.println("2. 성적정보 관리");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 = ");
			int mainMenu = Integer.parseInt(in.readLine());
			
			switch(mainMenu) {
			case 1:
				System.out.println("====< 학생정보 관리 >====");
				System.out.println("1. 학생정보 입력");
				System.out.println("2. 학생정보 조회(전체 출력)");
				System.out.println("3. 학생정보 검색");
				System.out.println("4. 학생정보 변경");
				System.out.println("5. 학생정보 삭제");
				System.out.println("6. 첫화면으로");
				System.out.print("선택 = ");
				int searchMenu1 = Integer.parseInt(in.readLine());
				
				switch(searchMenu1) {
				case 1:
					System.out.println("====< 학생정보 입력 >====");
					System.out.print("이름 = ");
					String studentName = in.readLine();
					System.out.print("학년 = ");
					int studentClass = Integer.parseInt(in.readLine());
					
					int studentBirth = 0;
					do {
						System.out.print("생년월일 = ");
						studentBirth = Integer.parseInt(in.readLine());
					} while(studentBirth <= 0 && studentBirth > 999999);
					service.createStudent(studentName, studentClass, studentBirth);
					
					// System.out.println(name + "(" + studentNum + ") 학생 정보가 등록되었습니다.");
					break;
				case 2:
					System.out.println("====< 학생정보 조회 >====");
					System.out.println("학번\t이름\t학년\t생년월일\t나이");
					break;
				case 3:
					System.out.println("====< 학생정보 검색 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					// studentNum = Integer.parseInt(in.readLine());
					
					break;
				case 4:
					System.out.println("====< 학생정보 변경 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					break;
				case 5:
					System.out.println("====< 학생정보 삭제 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					break;
				case 6:
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("====< 성적정보 관리 >====");
				System.out.println("1. 성적정보 등록");
				System.out.println("2. 성적정보 검색");
				System.out.println("3. 성적정보 변경");
				System.out.println("4. 성적정보 삭제");
				System.out.println("5. 첫화면으로");
				int searchMenu2 = Integer.parseInt(in.readLine());
				
				switch(searchMenu2) {
				case 1:
					System.out.println("====< 성적정보 등록 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					// studentNum = Integer.parseInt(in.readLine());
					break;
				case 2:
					System.out.println("====< 성적정보 검색 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					break;
				case 3:
					System.out.println("====< 성적정보 변경 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					break;
				case 4:
					System.out.println("====< 성적정보 삭제 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					break;
				case 5:
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}
}
