import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 세 개의 정수를 입력받아 큰 순서대로 나열하여 출력하는 프로그램을 구현하시오.
 * <입력형식>
 * 첫번째수 =
 * 두번째수 = 
 * 세번째수 = 
 * 
 * <출력형식>
 * 수나열 : 큰수 >= 중간수 >= 작은수
 * 
 * <처리조건>
 * 1. 없음.
 * 
 */
public class Exam_13 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int num2;
		int num3;
		
		System.out.print("첫번째 수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		System.out.print("두번째 수 = ");
		num2 = Integer.parseInt(in.readLine());
		
		System.out.print("세번째 수 = ");
		num3 = Integer.parseInt(in.readLine());
		
		if(num1 >= num2 && num1 >= num3) {
			if(num2 >= num3) {
				System.out.println("숫자 나열 : " + num1 + ">=" + num2 + ">=" + num3);
			} else if(num3 >= num2) {
				System.out.println("숫자 나열 : " + num1 + ">=" + num3 + ">=" + num2);
			}
		} else if(num2 >= num1 && num2 >= num3) {
			if(num1 >= num3) {
				System.out.println("숫자 나열 : " + num2 + ">=" + num1 + ">=" + num3);
			} else if(num3 >= num1) {
				System.out.println("숫자 나열 : " + num2 + ">=" + num3 + ">=" + num1);
			}
		} else if(num3 >= num1 && num3 >= num2) {
			if(num1 >= num2) {
				System.out.println("숫자 나열 : " + num3 + ">=" + num1 + ">=" + num2);
			} else if(num2 >= num1) {
				System.out.println("숫자 나열 : " + num3 + ">=" + num2 + ">=" + num1);
			}
		}
	}
}
