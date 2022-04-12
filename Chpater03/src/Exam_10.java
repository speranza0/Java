import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 하나의 수를 입력받아 그 수를 제곱하는 프로그램을 작성하시오.
 * 
 * */
public class Exam_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int number;
		int result;
		
		System.out.print("숫자를 입력하세요. > ");
		number = Integer.parseInt(in.readLine());
		
		result = number * number;
		
		System.out.println("입력하신 숫자의 제곱은 " + result + "입니다.");
	}
}
