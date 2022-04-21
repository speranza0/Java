import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Interface에 포함될 수 있는 멤버
 * - public static final 멤버필드 = 리터럴상수
 * - abstract(추상) 멤버 메서드 => 몸통이 없는 메서드
 * - static inner class 정적 중첩 클래스
 * 
 * 인터페이스는 클래스를 상속 받을 수 없다.
 * 
 * */
interface AA {
	public static final int X = 10;
	// private String no;
	
//	public void display() {
//		System.out.println("출력!");
//	}
	
	public void display();
}

class BB implements AA {
	// 오버라이딩
	public void display() {
		System.out.println("재정의된 메서드!");
		System.out.println(X);
	}
}

class CC implements AA {

	@Override
	public void display() {
		System.out.println("난 CC!!");
	}
	
}
public class Exam_12 {
	public static void main(String[] args) throws IOException{
		// AA aa = new BB();
		// 부모 객체로 자식객체를 담아 생성할 수 있다. => 다형성
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("선택 = ");
		int menu = Integer.parseInt(in.readLine());
		AA cs;
		
		if(menu == 1) {
			cs = new BB();
		} else {
			cs = new CC();
		}
		cs.display();
	}
}
