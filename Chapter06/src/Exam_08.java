/*
 * 객체지향적인 프로그래밍: JAVA, C#, Javascript(ES6 Class), python...
 * JAVA는 대표적인 OOP
 * 
 * 객체: 현실세계의 유형, 무형의 모든 물질
 * 프로그래밍 = 자동화
 * 
 * 클래스(class): 객체를 프로그래밍 하는 구조(틀) <- 객체 모델링
 * 속성(attribute) - 필드(field = variable) = 변수, 기억공간
 * 기능(function) - 함수 = 메서드, 명령어의 집합, 기능의 묶음, 행위나 동작등을 기술하는 영역
 * 
 * 1) 형식
 *    접근제한자(접근지정자) [지정예약어] class 클래스명 {}
 * 
 * 2) 구성요소 (포함멤버)
 *    - 멤버필드(클래스변수): Member Field
 *    - 생성자 메서드: Constructor
 *    - 멤버 메서드: Member Method
 *    - 중첩 클래스: Nested Class = Inner Class
 *    (자바에서는 1개의 자바파일.java에 1개의 클래스만 원칙적으로 담을수 있다.)
 * 
 * 3) 객체를 생성하는 방법
 *    클래스명 객체명 = new 생성자메서드(매개변수);
 *    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 *                  인스턴스 => BufferedReader 접근하기 위한 열쇠 키
 *                  
 * 4) 객체를 통해 멤버에 접근하는 방법: direct연산자
 *    객체명.멤버필드 or 객체명.멤버메서드();
 *    in.readLine();
 *
 * */

class Person {
	// 클래스 변수, 멤버필드
	String name;
	
	/*
	 * 생성자 메서드
	 * 객체가 생성될때 호출되는 메서드
	 * 생성자 메서드가 존재하지 않으면 default 생상자가 생략되어 있는걸로 간주한다.
	 * 메서드이긴 하지만 결과형 리턴값을 담고있지 않다. 심지어 void 조차 쓰면 안된다.
	 * 멤버필드를 초기화 시킬 목적으로 구현된 메서드이다.
	 * 객체가 생성된 후 처음으로 해야할 작업을 기술할 목적으로 구현한다.
	 * 생성자 메서드는 반드시 클래스명과 동일하게 작성된다.
	 * 생성자도 오버로딩이 가능하다. => 동일한 이름을 가진 메서드를 여러개 만들어서 사용하는 기술
	 * 단, 매개변수의 갯수가 다르거나, 데이터 타입(자료형이)이 달라야한다.
	 * 
	 * this: 클래스 내에서 자기 자신의 객체를 가리킨다.
	 * this(): 클래스 내의 자기 자신의 또다른 생성자
	 * */
	
	// 생성자 메서드는 => 결과형 리턴값이 없다!
	// 클래스 이름과 메서드 이름이 동일하다!
	// 작성하지 않으면 생략되어 있다.
	public Person() {} // 디폴트 생성자
	
	public Person(String name) {
		// 매개변수의 변수는 지역변수로 우선 적용된다.
		// 메서드 안에서 클래스변수, 멤버필드에 접근할때는 this라는 키워드를 사용한다.
		this.name = name;
	}
	
	// 생성자는 매개변수의 타입, 매개변수의 갯수가 다른 경우 여러개 작성이 가능하다.
	// => 오버로딩
	public Person(int age) {
		this("안녕");
	}
	
	// 멤버 메서드: 객체가 하는 행위나 동작등을 기술하는 영역
	public void init(String irum) {
		name = irum;
	}
	
	public void walk(int speed) {
		System.out.println(name + "이/가 " + speed + "km/s의 속도로 걸어갑니다.");
	}
	
	public void run(int speed) {
		System.out.println(name + "이/가 " + speed + "km/s의 속도로 뛰어갑니다.");
	}
	
	class Baby {
		String leftLeg;
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		
		Person parkPerson = new Person("박씨");
		parkPerson.walk(10);
		parkPerson.run(25);
		
		Person kangPerson = new Person("강씨");
		kangPerson.walk(5);
		kangPerson.run(20);
	}
}
