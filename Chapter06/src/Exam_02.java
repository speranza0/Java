import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * main() 메서드
 * - 프로그램 시작시 사용자로부터 값을 입력받아 처리할 목적으로 구현된다.
 * - args => 프로그램 시작시 사용자에게 특정 값을 받아서 처리하는 경우에 사용한다.
 * - 프로그램 종료
 * System.exti(0);
 * */

/*
 * 접근제한자(접근지정자) 결과형리턴값 메서드명(매개변수들) [throws 예외 클래스들...] {
 *  내용 정의부;
 * }
 * */
public class Exam_02 {
	public static void main(String[] args) throws IOException {
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(i + "번째 = " + args[i]);
//		}
		
		System.out.println("시스템 입력 인원값 = " + args[0]);
		
		int count = Integer.parseInt(args[0]);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] names = new String[count];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(i + "번째 사람 이름 = ");
			names[i] = in.readLine();
		}
		
		System.out.println();
		
		for(int i = 0; i <names.length; i++) {
			System.out.println(i + "번째 : " + names[i]);
		}
	}
}
