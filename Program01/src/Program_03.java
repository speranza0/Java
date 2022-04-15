import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 하나의 65 ~ 90 또는 97 ~ 122 사이의 양의정수를 입력받아
 * 양의 정수를 문자로 변환하여 출력하는 프로그램을 작성하시오.
 * 
 * <입력 방식>
 * 양의 정수 입력 = 65
 * 
 * <출력 방식>
 * 입력하신 숫자에 해당하는 문자는 A입니다.
 * 
 * <처리 조건>
 * 1. 만약 65 ~ 90, 97 ~ 122 사이의 양의정수가 아닌 경우 반복해서 입력할수 있도록 구현한다.
 * 
 * */
public class Program_03 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		char lang = 0;
		
		// 입력
		do {
			System.out.print("양의 정수 입력 = ");
			num = Integer.parseInt(in.readLine());
		} while((65 > num || 90 < num) && (num < 97 || num > 122));
		
		// 처리
		lang = (char)num;
		
		// 출력
		System.out.printf("입력하신 숫자에 해당하는 문자는 " + lang + "입니다.");
	}
}
