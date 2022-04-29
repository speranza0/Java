/*
 * 예외에 관련한 정보가 예외 인스턴스에 담겨있다.
 * 메시지를 담아 사용자에게 전달하거나 다양한 처리 플로우 분기를 위해 사용한다.
 * 
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		try {
			System.out.println(0/0);
		} catch (Exception e) {
			// 아무것도 하지 않으면? => 에러를 방조/무시한다 => 위험한 상황이 발생할수 있다
			e.printStackTrace(); // JAVA 에러클래스의 정보를 콘솔창에 보여준다.
			System.out.println(e.getMessage()); // 에러에 담긴 메시지를 확인할수 있다.
		}
	}
}
