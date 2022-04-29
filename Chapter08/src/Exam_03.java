import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 멀티 catch 블록
 * catch 블록에 예상되는 예외 클래스를 명시하여
 * 예외처리의 흐름을 제어할 수 있다.
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("정수 입력 = ");
			int number = Integer.parseInt(in.readLine());
			
			System.out.print("나눌 수 = ");
			int number2 = Integer.parseInt(in.readLine());
			
			System.out.println("계산 결과 = " + number / number2);
			// number2가 0이면 에러 발생
			// 숫자가 아닌 다른걸 입력하면 파싱에러
			// 입력에 관련된 에러
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누지 말랑께~");
		} catch(NumberFormatException e) {
			System.out.println("숫자 입력하랑께~");
		} catch(IOException e) {
			System.out.println("입력에 관한 에러랑께~");
		} catch(Exception e) {
			// switch ~ case ~ break dafault처럼 위에 해당하지 않는 에러의 경우 기본값으로 안전하게 처리한다.
			System.out.println("모든 에러 클래스~");
		} finally {
			// 예외가 발생하든 안하든 무조건 실행되는 블록
			System.out.println("파이널리~");
		}
		
		System.out.println("try~catch문을 빠져나왔습니다.");
	}
}
