import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드를 통해 3개의 정수를 입력받아 해당 숫자들의 집합이 삼각형의 조건에 만족하는지 판단하는 프로그램을 구현하시오.
 * 
 * 힌트 => 삼각형은 두변의 합이 다른 한변의 합보다 반드시 커야한다.
 * 
 * <입력 방식>
 * 입력 1번째 =
 * 입력 2번째 =
 * 입력 3번째 =
 * 
 * <출력 방식>
 * 삼각형이 가능한 경우:
 * 삼각형 가능
 * 
 * 삼각형이 불가능한 경우:
 * 삼각형 불가능
 * 
 * */
public class Program_04 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int num2;
		int num3;
		int max = 0;
		int mid = 0;
		int min = 0;
		
		// 입력
		do {
			System.out.print("입력 1번째 = ");
			num1 = Integer.parseInt(in.readLine());
		} while(num1 <= 0);
		
		do {
			System.out.print("입력 2번째 = ");
			num2 = Integer.parseInt(in.readLine());
		} while(num2 <= 0);
		
		do {
			System.out.print("입력 3번째 = ");
			num3 = Integer.parseInt(in.readLine());
		} while(num3 <= 0);
		
		// 처리
		// 가장 긴 변 찾고 순서정렬
		if(num1 > num2 && num1 > num3) {
			max = num1;
			mid = num2 > num3 ? num2 : num3;
			min = num2 > num3 ? num3 : num2;
		} else if(num2 > num1 && num2 > num3) {
			max = num2;
			mid = num1 > num3 ? num1 : num3;
			min = num1 > num3 ? num3 : num1;
		} else {
			max = num3;
			mid = num2 > num1 ? num2 : num1;
			min = num2 > num1 ? num1 : num2;
		}
		
		// 계산 및 출력
		if(mid + min > max) {
			System.out.println("삼각형 가능");
		} else {
			System.out.println("삼각형 불가능");
		}
	}
}
