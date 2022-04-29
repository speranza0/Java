import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 사용자 정의 예외
 * 기존에 정의된 예외 클래스를 상속받아 새로운 예외 클래스를 정의할 수 있다.
 * 별도의 다른 값을 에러 클래스에 담을 수 있다.
 * 
 * 예외 클래스가 되려면 Exception을 부모로 가지고 있는 클래스를 상속받아야한다.
 * 
 * */
class HttpException extends Exception {
	public final int ERROR_CODE;
	
	public HttpException(int errorCode, String message) {
		super(message);
		this.ERROR_CODE = errorCode;
	}
}
public class Exam_06 {
	public static void main(String[] args) throws IOException {
		String url;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("접속 URL = ");
		url = in.readLine();
		
		try {
			switch (url) {
			case "naver.com":
				System.out.println("네이버 접속!");
				break;
			case "kakao.com":
				System.out.println("카카오 접속!");
				break;
			case "google.com":
				throw new HttpException(500, "구글 서버 오류");
			default:
				throw new HttpException(404, "페이지를 찾을 수 없음");
			}
		} catch(HttpException e) {
			System.out.println("에러코드 : " + e.ERROR_CODE);
			System.out.println("에러내용 : " + e.getMessage());
		}
	}
}
