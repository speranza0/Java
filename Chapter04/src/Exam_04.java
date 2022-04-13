import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 계산기 프로그램
 * 두개의 정수와 하나의 연산자를 입력받아 계산을 수행한 후 결과를 출력하는 프로그램 구현
 * 
 * <입력 및 출력 형식>
 * 첫번째수 = 10
 * 연산자(+,-,*,/,%) = % 
 * 두번째수 = 3
 * 
 * 10 % 3 = 1
 * */
public class Exam_04 {
	public static void main(String[] args) throws IOException{
		
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		int result = 0;
		char op;
		
		// 입력
		System.out.print("첫번째 수를 입력하세요 : ");
		num1 = Integer.parseInt(in.readLine());
		
		System.out.print("연산자(+,-,*,/,%)를 입력하세요 : ");
		op = in.readLine().charAt(0);
		
		System.out.print("두번째 수를 입력하세요 : ");
		num2 = Integer.parseInt(in.readLine());
		
		// 처리
		switch(op) {
			case '+': {
				result = num1 + num2;
				break;
			}
			case '-': {
				result = num1 - num2;
				break;
			}
			case '*': {
				result = num1 * num2;
				break;
			}
			case '/': {
				result = num1 / num2;
				break;
			}
			case '%':{
				result = num1 % num2;
				break;
			}
			default: {
				System.out.println("연산자가 잘못되었습니다. 시스템을 종료합니다.");
				System.exit(0);
				break;
			}
		}
		
		// 출력
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
}

