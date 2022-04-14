import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * while문 예시
 * 무한반복에서 사용자의 행위에 의해 반복을 멈추고 싶은 경우
 * 
 * */
public class Exam_10 {
	public static void main(String[] args) throws IOException{
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("x를 입력하시면 종료됩니다. >>");
			String line = in.readLine();
			char ch = line.charAt(0);
			
			if(ch == 'x') {
				System.out.println("x를 누르셨네요 종료됩니다.");
				break;
			}
		}
	}
}
