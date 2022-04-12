import java.util.Scanner;

/*
 * 사용자의 입력을 처리하는 방법
 * Scanner, BufferedReader
 * 
 * */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나를 입력하세요 > ");
		String line = sc.nextLine();
		
		System.out.println("입력하신 숫자는 " + line + "입니다.");
		
		sc.close(); // 자원을 반납해줘야한다.
	}
}
