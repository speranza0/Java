import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * do~while문: 
 * 선실행 후 조건비교
 * 주어진 조건이 거짓이라도 한번은 수행한다.
 * 
 * <형식>
 * do {
 * 반복할 문장;
 * } while(논리조건식);
 * 
 * 유효성검사를 할때 << 입력값을 제한할때
 * 
 * 성적 처리 프로그램
 * 국어, 영어, 수학점수를 입력받아서 총점과 평균을 출력하는 프로그램을 구현하시오.
 * 
 * <처리 조건>
 * 1. 입력과 출력형식에 맞게 변수와 자료형을 선언해라.
 * 2. 평균은 소숫점 이하 둘째자리까지 표현해라.
 * 3. 각 과목의 점수는 0~100점 사이만 입력하지만 범위를 벗어나면 다시 입력받도록 구현하라.
 * */
public class Exam_11 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		int sum = 0;
		float avg;
		
		// 입력
		do {
			System.out.print("국어 = ");
			kor = Integer.parseInt(in.readLine());
		} while(kor < 0 || kor > 100);
		
		do {
			System.out.print("수학 = ");
			math = Integer.parseInt(in.readLine());
		} while(math < 0 || math > 100);
		
		do {
			System.out.print("영어 = ");
			eng = Integer.parseInt(in.readLine());
		} while(eng < 0 || eng > 100);
		
		// 처리
		sum = kor + math + eng;
		avg = sum / 3.0f;
		
		// 출력
		System.out.println("총점 = " + sum);
		System.out.printf("평균 = %.2f", avg);
	}
}
