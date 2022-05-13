package sm.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;
import sm.service.ScoreService;

/*
 * ====< 성적정보 관리 >====
 * 1. 성적정보 등록
 * 2. 성적정보 검색
 * 3. 성적정보 변경
 * 4. 성적정보 삭제
 * 5. 첫화면으로
 * 선택 =
 * */
public class ScoreController {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	ScoreService service = new ScoreService();
	
	public int mainMenu() throws IOException {
		System.out.println("====< 성적정보 관리 >====");
		System.out.println("1. 성적정보 등록");
		System.out.println("2. 성적정보 검색");
		System.out.println("3. 성적정보 변경");
		System.out.println("4. 성적정보 삭제");
		System.out.println("5. 첫화면으로");
		System.out.print("선택 = ");
		int scoreMenu = Integer.parseInt(in.readLine());
		return scoreMenu;
	}
	
	public void createMenu() throws IOException {
		System.out.println("====< 성적정보 등록 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int scoreCreateNum = Integer.parseInt(in.readLine());
		
		StudentDTO createScoreStudent = service.selectOneStudent(scoreCreateNum);
		try {
			if(createScoreStudent.getStudentNum() != scoreCreateNum) {
				System.out.println("학번이 올바르지 않습니다.");
			} else {
				System.out.println(createScoreStudent.getStudentName() + "(" + scoreCreateNum + ") 학생의 성적 입력");
				
				int kor = 0;
				do {
					System.out.print("국어 = ");
					kor = Integer.parseInt(in.readLine());
				} while(kor < 0 || kor > 100);
				
				int math = 0;
				do {
					System.out.print("수학 = ");
					math = Integer.parseInt(in.readLine());
				} while(math < 0 || math > 100);
				
				int eng = 0;
				do {
					System.out.print("영어 = ");
					eng = Integer.parseInt(in.readLine());
				} while(eng < 0 || eng > 100);
				service.createScore(createScoreStudent.getStudentNum(), kor, math, eng);
				System.out.println(createScoreStudent.getStudentName() + "(" + createScoreStudent.getStudentNum() + ") 학생의 성적이 등록되었습니다.");							
			}
		} catch(NullPointerException e) {
			System.out.println("등록된 학번이 아닙니다.");
		}
	}
	
	public void searchMenu() throws IOException {
		System.out.println("====< 성적정보 검색 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int scoreSearchNum = Integer.parseInt(in.readLine());
		StudentDTO searchScoreStudent = service.selectOneStudent(scoreSearchNum);
		
		if(searchScoreStudent == null) {
			System.out.println("등록된 학번이 아닙니다.");
		} else if (searchScoreStudent.getScore() == null) {
			System.out.println(searchScoreStudent.getStudentName() + "(" + scoreSearchNum + ") 학생의 등록된 성적정보가 없습니다.");
		} else {
			ScoreDTO score = searchScoreStudent.getScore();
			System.out.println(searchScoreStudent.getStudentName() + "(" + scoreSearchNum + ") 학생의 성적");
			System.out.println("국어 = " + score.getKor());
			System.out.println("수학 = " + score.getMath());
			System.out.println("영어 = " + score.getEng());
			System.out.println("총점 = " + score.getSum());
			System.out.printf("평균 = %.2f", score.getAvg());
			System.out.println();
		}
	}
	
	public void changeMenu() throws IOException {
		System.out.println("====< 성적정보 변경 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int scoreUpdateNum = Integer.parseInt(in.readLine());
		System.out.println();
		StudentDTO updateScoreStudent = service.selectOneStudent(scoreUpdateNum);
		
		if(updateScoreStudent == null) {
			System.out.println("등록된 학번이 아닙니다.");
		} else if(updateScoreStudent.getScore() == null) {
			System.out.println("등록된 성적이 없습니다.");
		} else {
			System.out.println(updateScoreStudent.getStudentName() + "(" + scoreUpdateNum + ") 학생의 성적");
			ScoreDTO score = updateScoreStudent.getScore();
			int newkor = 0;
			do {
				System.out.print("국어(" + score.getKor() + ") = ");
				newkor = Integer.parseInt(in.readLine());
			} while(newkor < 0 || newkor > 100);
			
			int newMath = 0;
			do {
				System.out.print("수학(" + score.getMath() + ") = ");
				newMath = Integer.parseInt(in.readLine());
			} while(newMath < 0 || newMath > 100);
			
			int newEng = 0;
			do {
				System.out.print("영어(" + score.getEng() + ") = ");
				newEng = Integer.parseInt(in.readLine());
			} while(newEng < 0 || newEng > 100);
			System.out.println();
			
			service.updateScore(updateScoreStudent.getStudentNum(), newkor, newMath, newEng);
			System.out.println(updateScoreStudent.getStudentName() + "(" + scoreUpdateNum + ")" + "학생의 정보가 변경되었습니다.");
		}					
	}
	
	public void removeMenu() throws IOException {
		System.out.println("====< 성적정보 삭제 >====");
		System.out.println("학번을 입력하세요.");
		System.out.print("학번 = ");
		int removeScoreNum = Integer.parseInt(in.readLine());
		System.out.println();
		StudentDTO removeScoreStudent = service.selectOneStudent(removeScoreNum);
		
		if(removeScoreStudent == null) {
			System.out.println("등록된 학번이 아닙니다.");
		} else if(removeScoreStudent.getScore() == null) {
			System.out.println("등록된 성적이 없습니다.");
		} else {
			System.out.print(removeScoreStudent.getStudentName() + "(" + removeScoreStudent.getStudentNum() + ") 성적 정보를 삭제하시겠습니까 (Y,N) = ");
			String yesorno = in.readLine();
			if(yesorno.equals("Y")) {
				service.removeScore(removeScoreStudent.getStudentNum());
				System.out.println(removeScoreStudent.getStudentName() + "(" + removeScoreStudent.getStudentNum() + ") 학생 성적 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제를 취소했습니다. 돌아갑니다.");
			}
		}		
	}
}
