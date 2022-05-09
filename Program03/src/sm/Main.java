package sm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sm.controller.ScoreController;
import sm.controller.StudentController;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StudentController studentController = new StudentController();
		ScoreController scoreController = new ScoreController();
		
		while(true) {
			System.out.println("====< 학생정보관리 프로그램 >====");
			System.out.println("1. 학생정보 관리");
			System.out.println("2. 성적정보 관리");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 = ");
			int mainMenu = Integer.parseInt(in.readLine());
			
			switch(mainMenu) {
			case 1: {
				boolean isMenuStop = false;
				while(!isMenuStop) {
					int studentMenu = studentController.mainMenu();
					switch(studentMenu) {
					case 1:
						studentController.createMenu();
						break;
					case 2:
						studentController.listMenu();
						break;
					case 3:
						studentController.searchMenu();
						break;
					case 4:
						studentController.changeMenu();
						break;
					case 5:
						studentController.removeMenu();
						break;
					case 6:
						isMenuStop = true;
						break;
					default:
						break;
					}
				}
				break;
			}
			case 2: {
				boolean isMenuStop = false;
				while(!isMenuStop) {
					int scoreMenu = scoreController.mainMenu();
					switch(scoreMenu) {
					case 1:
						scoreController.createMenu();
						break;
					case 2:
						scoreController.searchMenu();
						break;
					case 3:
						scoreController.changeMenu();
						break;
					case 4:
						scoreController.removeMenu();
						break;
					case 5:
						isMenuStop = true;
						break;
					default:
						break;
					}
				}
				break;
			}
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
