/*
 * 클래스(Class)의 구성요소
 * 1. 멤버필드(클래스변수)
 *   - 접근지정자(public, protected, default, private) => 캡슐화(정보은닉)
 * 2. 생성자 메서드
 *   - 클래스명과 동일하게 작성한다.
 *   - 객체를 생성할때 호출된다. new <- 메서드가 호출됨.
 *   - 멤버필드를 초기화할 목적으로 사용한다.
 *   - 결과형 리턴값을 담지 않는다.(void조차 쓰지 않는다)
 *   - 오버로딩(overloading): 동일한 이름을 가진 메서드를 여러개 만들어서 사용할 수 기능
 *   단, 매개변수 갯수가 다르거나 매개변수의 자료형이 다른경우 사용 가능
 *   - this, this()
 * 3. 멤버 메서드
 *   - 접근지정자:public
 *   - set, get
 *   - 형식
 *   접근지정자(접근제한자) [지정예약어] 결과형리턴값자료형 메서드명(매개변수) [throws 예외클래스]{
 *   	내용
 *   }
 *   - 유형 4가지
 *    결과형리턴 매개변수
 *    x          x
 *    x          o
 *    o          x
 *    o          o
 *   - 결과형 리턴값
 *   return [변수 or 값] -> 메소드 형식의 결과형리턴값의 자료형과 일치해야한다.
 * 4. 중첩 클래스: 4가지
 * 1) 중첩클래스(Inner Class)
 *   - 클래스 내부에 또 다른 클래스를 가짐으로 클래스 관리의 효율성을 높이는 것
 *   - static 포함 불가(안쪽의 중첩클래스)
 *   - 반드시 바깥쪽 객체를 생성한 후에 안쪽 객체를 생성할 수 있다.
 * 2) 정적 중첩클래스(static Inner Class)
 *   - static을 담을수 있다.
 * 3) 지역 중첩 클래스(Local Inner Class)
 * 
 * 4) 익명 중첩클래스(Anonymous Inner Class)
 * 
 * */

class Outer{
	// 멤버필드(클래스변수)
	int x = 100;
	private static int y = 200;
	
	// 디폴트 생성자
	public Outer() {}
	
	// 멤버 메서드
	public void display() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	// 중첩 클래스
	class Inner{
		private int a = 100;
		
		// 생성자 메서드
		public Inner() {}
		
		// 멤버 메서드
		public void display() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("a = " + a);
		}
		
		class Other_Inner{
			
		}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner oi = outer.new Inner(); // 중첩 클래스의 경우 안쪽 중첩문에 접근하는 객체
		Outer.Inner.Other_Inner oio = oi.new Other_Inner();
		
		oi.display();
	}
}
