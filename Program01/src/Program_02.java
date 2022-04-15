import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 계산기 프로그램
 * 두개의 정수와 하나의 연산자를 입력받아 계산을 수행한 후 결과를 출력하는 프로그램을 구현하시오.
 * 
 * <입력 방식>
 * 첫번째수 =
 * 연산자(+,-,*,/,%) = 
 * 두번째수 =
 * 
 * <출력 방식>
 * 10 * 3 = 30
 * 
 * <처리 조건>
 * 1. 입출력형식을 이용하여 변수와 자료형을 알맞게 선언할것.
 * 2. 주어진 연산기호 이외의 값이 들어오면 다시 입력받도록 구현할것.
 * 3. 연산자가 '/'이고 두번째수가 0이 들어오면 두번째수를 다시 입력받도록 구현할것.
 * 
 * */
public class Program_02 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		int result = 0;
		char op;
		
		// 입력
		System.out.print("첫번째수 = ");
		num1 = Integer.parseInt(in.readLine());
		
		do {
			System.out.print("연산자(+,-,*,/,%) = ");
			op = in.readLine().charAt(0);
			} while(op != '+' && op != '-' && op != '*' && op != '/' && op !='%');
		
		System.out.print("두번째수 = ");
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
						do {
							System.out.print("두번째수 = ");
							num2 = Integer.parseInt(in.readLine());
						} while(num2 == 0);
						result = num1 / num2;
						break;
					}
					case '%':{
						result = num1 % num2;
						break;
					}
				}
		// 출력
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
}
