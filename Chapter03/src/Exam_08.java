import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 사용자의 입력을 처리하는 방법
 * BufferedReader
 * 
 * 예외처리를 해야한다.
 * */
public class Exam_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 하나를 입력하세요 > ");
		String line = in.readLine();
		
		System.out.println("입력하신 숫자는 " + line + "입니다.");
	}
}
