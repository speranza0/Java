/*
 * static: 공유필드를 위한 지정예약어
 * - 데이터 값을 공유하기 위해 사용되는 지정예약어
 * - 멤버 필드만 가능하다.
 * - 클래스 이름으로 접근이 가능하다.
 * - 객체 발생전에 메모리에 할당된다.
 * - 별도로 초기화 영역을 이용할 수 있다.
 * 
 * <형식>
 * static {
 * 초기화 구문;
 * }
 * 
 * static 메서드 : static 필드를 제어할 목적으로 사용되는 메서드로 static만 담을 수 있다.
 * */
class StaticClass {
	public static int x;
	private int y;
	
	public void print() {
		x++;
		y++;
		System.out.println("x = " + x + ", y = " + y);
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		StaticClass sc1 = new StaticClass();
		StaticClass sc2 = new StaticClass();
		
		for(int i = 0; i < 10; i++) {
			sc1.print();
		}
		System.out.println();
		sc2.print();
		
		System.out.println(StaticClass.x);
	}
}
