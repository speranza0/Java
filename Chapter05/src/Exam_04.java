import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 처리 프로그램
 * 국어, 영어, 수학 점수를 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 구현하시오.
 * 
 * <처리조건>
 * 1. 배열을 이용할것.
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int[4];
		String[] subject = new String[] {"국어", "영어", "수학"};
		float avg = 0.0f;
		
		// 입력
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " = ");
			score[i] = Integer.parseInt(in.readLine());
			score[3] += score[i];
		}
		
		// 처리
		avg = score[3] / (float)subject.length;
		
		// 출력문
		System.out.println("총점 = " + score[3]);
		System.out.printf("평균 = %.2f", avg);
	}
}
