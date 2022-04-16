import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 관리 프로그램
 * 
 * <메뉴화면>
 * ==== Grade Menu ====
 * 1. 국어
 * 2. 수학
 * 3. 영어
 * 4. 총점
 * 5. 평균
 * 6. 학점
 * 7. 작업종료
 * ===================
 * 선택 =
 * 
 * <국어, 수학, 영어 선택시>
 * ## 점수 =
 * ## 성적 입력 완료!
 * 
 * <총점 선택시>
 * 성적 합계는 xxx점 입니다.
 * (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <평균 선택시>
 * 성적 평균은 xx.xx점 입니다.
 * (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * <학점 선택시>
 * 학점은 x입니다.
 * (국어, 수학, 영어) 성적을 입력해주세요.
 * => 입력하지 않은 과목을 표기한다.
 * 
 * 학점 범위
 * 95점 이상 A+
 * 90점 이상 A
 * 85점 이상 B+
 * 80점 이상 B
 * 75점 이상 C+
 * 70점 이상 C
 * 65점 이상 D+
 * 60점 이상 D
 * 59점 이하 F
 * 
 * <처리 조건>
 * 1. 국어, 수학, 영어 성적을 입력받을시 0~100점 사이의 값이 아닌경우 다시 입력받는다.
 * 2. 평균은 소숫점 두번째자리까지 표현한다.
 * 3. 메뉴에서 작업종료를 입력하기 전까지는 메뉴를 계속 반복하여 출력한다.
 * 
 * 
 * */
public class Program_07 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		float avg;
		char grd;
		
		// 입력
		while(true) {
			System.out.println("==== Grade Menu ====");
			System.out.println("1. 국어");
			System.out.println("2. 수학");
			System.out.println("3. 영어");
			System.out.println("4. 총점");
			System.out.println("5. 평균");
			System.out.println("6. 학점");
			System.out.println("7. 작업종료");
			System.out.println("===================");
			System.out.print("선택 = ");
			int menu = Integer.parseInt(in.readLine());
			

			switch(menu) {
				case 1: {
					int add;
					do {
						System.out.println("국어 점수 = ");
						add = Integer.parseInt(in.readLine());
						} while(add < 0 || add > 100);
					
					sum += add;
					System.out.println("국어 성적 입력 완료!");
					break;
				}
				case 2: {
					int add;
					do {
						System.out.println("수학 점수 = ");
						add = Integer.parseInt(in.readLine());
						} while(add < 0 || add > 100);
					
					sum += add;
					System.out.println("수학 성적 입력 완료!");
					break;
				}
				case 3: {
					int add;
					do {
						System.out.println("영어 점수 = ");
						add = Integer.parseInt(in.readLine());
						} while(add < 0 || add > 100);
					
					sum += add;
					System.out.println("영어 성적 입력 완료!");
					break;
				}
				case 4: {
					
					do {
						System.out.println("성적 합계는 " + sum + "점 입니다.");
						
						} while();
					
				}
			}
		}
	}
}