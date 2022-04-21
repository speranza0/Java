/*
 * 객체 지향적인 프로그래밍 기법
 * 1. 클래스(Class)
 *   - 객체(Object)
 *    1) 클래스의 구성요소 4가지
 *     - 멤버 필드(클래스 변수)
 *     - 생성자 메서드
 *     - 멤버 메서드
 *     - 중첩 클래스
 *    2) 객체 생성 방법
 *     - 클래스명 객체명 = new 생성자 메서드(매개변수);
 *    3) 접근지정자(접근제한자)
 *     - public
 *     - default
 *     - protected 
 *     - private
 * 2. 캡슐화(정보 은닉)
 *   - 멤버 필드는 private
 *   - 멤버 메서드는 public
 * 3. 상속
 *   - 포함 Object의 단점을 보완하기 위해
 *     포함 Object란?
 *     클래스 내부에 임의의 클래스에 접근할 수 있는 객체를 가지고 있는 형태
 *   - 상속(Inheritance) : 부모 클래스의 멤버를 자식 클래스가 그대로 물려받아 사용할 수 있는 기능
 *    - 키워드 : extends
 *    - 접근지정자 [지정예약어] class 자식클래스 extends 부모 클래스{...}
 *    - 기반클래스 = 상위클래스 = 부모클래스
 *    - 파생클래스 = 하위클래스 = 자식클래스
 *    - 단일 상속을 기반으로 구현된다.
 * 4. 다형성
 * 5. 추상(abstract)
 * 6. 다중상속(인터페이스 : interface)
 * */

class Human {
	private String name;
	private int arms = 2;
	private int legs = 2;
	
	public Human(String name) {
		this.name = name;
	}
	public void status() {
		System.out.println("이름 : " + name);
		System.out.println("팔 : " + arms);
		System.out.println("다리 : " + legs);
	}
}

class Baby extends Human {
	private boolean cute;
	
	public Baby(String name) {
		super(name);
		this.cute = true;
	}
	public void cry() {
		System.out.println("waa waa");
	}
}
class Teenager extends Human {
	
	private boolean emotinal;
	
	public Teenager(String name) {
		super(name);
		this.emotinal = true;
	}
	
	public void curse() {
		System.out.println("18181818");
	}
	
}
public class Exam_09 {
	public static void main(String[] args) {
		Baby baby = new Baby("갑돌이");
		Teenager teenager = new Teenager("중이");
		
		baby.status();
		System.out.println();
		
		teenager.status();
		System.out.println();
		
		baby.cry();
		System.out.println();
		
		teenager.curse();
		System.out.println();
	}
}
