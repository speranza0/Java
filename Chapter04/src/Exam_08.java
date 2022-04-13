import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 정수를 입력받아 그 수에 맞는 층의 피라미드를 출력하는 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 출력할 피라미드의 층수(30층까지 가능) = 3 
 * 
 * <출력>
 * 1~30 입력시 아래처럼 나온다.
 *     #
 *    ###
 *   #####
 *  #######
 * #########
 * ...
 * 
 * 30을 초과하여 입력시 아래의 내용을 출력한다.
 * 너무 높습니다. 시스템을 종료합니다.
 * 
 * <출력조건>
 * 최대 30층까지만 출력이 가능하다.
 * 
 * */
public class Exam_08 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.print("출력할 피라미드의 층수(30층까지 가능) = ");
		num = Integer.parseInt(in.readLine());

		if(num <= 30) {
			for(int i = 0; i < num; i++) {
				for (int j = 1; j < num - i; j++) {
					System.out.print(" ");
					}
				for (int k = 0; k < 2 * i + 1; k++) {
					System.out.print("#");
					}
				System.out.println();
			}
		} else {
			System.out.println("너무 높습니다. 시스템을 종료합니다.");
		}
	}
}
