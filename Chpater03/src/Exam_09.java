import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 프로그램 처리 플로우
 * 1. 선언
 * 2. 입력
 * 3. 처리
 * 4. 결과 출력
 * 
 * 숫자 하나를 입력받아서 1을 더하는 프로그램을 만드시오.
 * 
 * */
public class Exam_09 {
	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int number;
		
		// 입력
		System.out.print("숫자를 입력하세요 > ");
		number = Integer.parseInt(in.readLine());
		
		// 처리
		// number = number + 1;
		// number += 1;
		number++;
		
		// 출력
		System.out.println("입력하신 숫자의 다음은 " + number + "입니다.");
		
	}
}
