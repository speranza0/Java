import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 프로그램 흐름에 따른 예외처리
 * 성적처리 프로그램
 * 국어, 영어, 수학 성적을 입력받아 총점과 평균을 출력하는 프로그램을 구현하시오
 * 
 * <처리조건>
 * 1. 사용자 예외 클래스를 만들어 성적 입력값이 0 ~ 100 사이 값이 아닌 경우 프로그램을 종료할것
 * 2. 예외를 전가하여 메인메서드에서 캐치할것
 * 
 * */

class NotValidException extends Exception {
	public NotValidException(String subject) {
		super(subject);
	}
}
public class Exam_07 {
		// 클래스 변수 <- 선언
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static int kor = 0, eng = 0, math = 0, total = 0;
		static float avg = 0;
		
		// 입력
		public static void input() throws Exception, NotValidException{
			try {
				System.out.print("국어 = ");
				kor = Integer.parseInt(in.readLine());
				
				if(kor < 0 || kor > 100) {
					throw new NotValidException("국어");
				}
				
				System.out.print("영어 = ");
				eng = Integer.parseInt(in.readLine());
				
				if(eng < 0 || eng > 100) {
					throw new NotValidException("영어");
				}
				
				System.out.print("수학 = ");
				math = Integer.parseInt(in.readLine());
				
				if(math < 0 || math > 100) {
					throw new NotValidException("수학");
				}
			} catch(Exception e) {
				throw e;
			}
		}
		
		// 처리
		public static void process() {
			total = kor + eng + math;
			avg = total / 3.0f;
		}
		
		// 출력
		public static void print() {
			System.out.println("총점 = " + total);
			System.out.printf("평균 = %.2f", avg);
		}
		
		// 메인
		public static void main(String[] args) {
			try {
				input();
				process();
				print();
			} catch(NotValidException e) {
				System.out.println(e.getMessage() + "성적 입력이 잘못되었습니다.");
			} catch(Exception e) {
				System.out.println("입력 에러가 발생했습니다.");
				e.printStackTrace();
			}
		}
}
