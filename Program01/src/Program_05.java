import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 369게임을 구현하시오.
 * 1 ~ 99사이의 정수를 키보드로 입력받고, 1부터 입력받은 수까지 반복하여 출력하는 작업을 수행하다가,
 * 해당 숫자가 3, 6, 9 중 하나가 있으면 "박수짝'을 출력하고, 두개가 있으면 "박수짝짝"을 출력하도록 구현하시오.
 * 
 * <입력 방식>
 * 정수 = 9
 * 
 * <출력 방식>
 * 1
 * 2
 * 박수짝
 * 4
 * 5
 * 박수짝
 * 7
 * ...
 * 32
 * 박수짝짝
 * ...
 * */
public class Program_05 {
	public static void main(String[] args) throws IOException{
		//선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String clap = "박수짝";
		
		// 입력
		do {
			System.out.print("정수 = ");
			num = Integer.parseInt(in.readLine());
		} while(num <= 0 || num >= 100);
		
		// 처리 및 출력
		for(int i = 1; i < num+1; i++) {
			if(i/10 == 3 || i/10 == 6 || i/10 == 9) {
				if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
					System.out.println(clap + "짝");
				} else {
				System.out.println(clap);
				}
			} else if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.println(clap);
			} else {
				System.out.println(i);
			}
		}
	}
}
