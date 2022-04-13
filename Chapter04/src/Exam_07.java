import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 구구단을 출력하는 프로그램을 구현하시오.
 * 출력한 단수를 입력받아 다음과 같은 출력형식이 되도록 코딩하시오.
 * <입력 및 출력방식>
 * 단수 = 7
 * 
 * 7 X 1 = 7
 * 7 X 2 = 14
 * 7 X 3 = 21
 * 7 X 4 = 28
 * 7 X 5 = 35
 * 7 X 6 = 42
 * 7 X 7 = 49
 * 7 X 8 = 56
 * 7 X 9 = 63
 * 
 * */
public class Exam_07 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.print("구구단 단수를 입력해주세요. > ");
		num = Integer.parseInt(in.readLine());
		
		System.out.println("단수 = " + num);
		System.out.println();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	}
}
