import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적 처리 프로그램
 * 
 * 3명의 국어, 영어, 수학 성적을 입력받아 각 학생의 총점과 평균을 계산하여 출력하는 프로그램을 구현
 * 
 * <입력>
 * 학생1
 * 국어 = 
 * 영어 = 
 * 수학 =
 * 
 * 학생2
 * 국어 =
 * 영어 =
 * 수학 =
 * 
 * 학생3
 * 국어 =
 * 영어 =
 * 수학 = 
 * 
 * <출력>
 * 학생1
 * 총점 = 
 * 평균 =
 * 
 * 학생2
 * 총점 = 
 * 평균 = 
 * 
 * 학생3
 * 총점 = 
 * 평균 = 
 * 
 * <처리조건>
 * 1. 다차원배열을 활용할것
 * 2. 평균은 소숫점 두째자리까지 표현할것
 * 
 * */
public class Exam_07 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] student = new String[] {"학생1", "학생2", "학생3"};
		String[] subject = new String[] {"국어", "영어", "수학"};
//		String[] resultText = new String[] {"총점", "평균"};
		int[][] score = new int[3][3];
		int[] sum = new int[3];
		float[] avg = new float[3];
		float [][] result = new float[3][2];
		
		// 입력
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
			for(int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + " = ");
				score[i][j] = Integer.parseInt(in.readLine());
			}
		}
		// 처리
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
				avg[i] = (float)sum[i] / subject.length;
				result[i][0] += score[i][j];
				result[i][1] = avg[i];
			}
		}
		
		// 출력
		for(int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
			System.out.println("총점 = " + sum[i]);
			System.out.printf("평균 = %.2f", avg[i]);
			System.out.println();
//			for(int j = 0; j < resultText.length; j++) {
//				System.out.println("총점 = " + result[i][0]);
//				System.out.printf("평균 = %.2f", result);
//				System.out.println(resultText[j] + " = " + result[i][j]);
//			}
		}
		
 	}
}
