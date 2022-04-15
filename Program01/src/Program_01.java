import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학 점수를 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 작성하시오.
 * 
 * <입력 방식>
 * 국어 = 
 * 영어 =
 * 수학 = 
 * 
 * <출력 방식>
 * 총점 =
 * 평균 =
 * 학점 =
 * 
 * <처리 조건>
 * 1. 프로그램에 사용될 변수의 자료형과 초기값은 입출력형식을 이용하여 구현할것.
 * 2. 0~100 사이의 수를 사용자가 입력하지 않은 경우 해당 입력을 다시 받을것.
 * 3. 평균은 소숫점 이하 둘째자리까지 표현할것.
 * 4. 학점은 아래의 기준대로 출력하며 switch ~ case 문을 활용할것.
 *    90점 이상 A
 *    80점 이상 B
 *    70점 이상 C
 *    60점 이상 D
 *    59점 이하 F
 * */
public class Program_01 {
	public static void main(String[] args) throws IOException {
		
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] score = new int[3];
		int sum = 0;
		float avg = 0;
		char grd;
		
		// 입력
		int kor = 0;
		do {
			System.out.print("국어 = ");
			kor = Integer.parseInt(in.readLine());
			score[0] = kor;
		} while(kor < 0 || kor > 100);
		
		int eng = 0;
		do {
			System.out.print("영어 = ");
			eng = Integer.parseInt(in.readLine());
			score[1] = eng;
		} while(eng < 0 && eng > 100);
		
		int math = 0;
		do {
			System.out.print("수학 = ");
			math = Integer.parseInt(in.readLine());
			score[2] = math;
			} while(math < 0 && math > 100);
		
		// 처리
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			avg = (float)sum / score.length;
		}
		
		switch((int)avg/10) {
			case 10:
			case 9:
				grd = 'A';
				break;
			case 8: 
				grd = 'B';
				break;
			case 7:
				grd = 'C';
				break;
			case 6:
				grd = 'D';
				break;
			default : 
				grd = 'F';
				break;
		}
		
		// 출력
		System.out.println("총점 = " + sum);
		System.out.printf("평균 = %.2f", avg);
		System.out.println();
//		System.out.println((int)avg/10);
//		System.out.println();
		System.out.println("학점 = " + grd);
	}
}
