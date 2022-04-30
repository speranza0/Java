/*
 * Object 객체
 * 자바의 모든 객체는 Object라는 클래스를 상속받는다.
 * 
 * equals
 *  - 객체 자신과 객체 obj가 같은 객체인지 알려준다. 같으면 true 리턴
 * 
 * hashCode
 *  - 객체의 해시코드 값을 리턴한다.
 *  - 주소값 기반으로 생성된 정수값이다.
 *  
 * clone(메서드), cloneable(인터페이스)
 *  - 깊은복사, 얕은복사
 *  - 객체를 new 키워드를 통해 생성하면 메모리를 할당하고 할당된 주소값의 정보를 인스턴스와 연결한다.
 *  - 얕은복사의 경우 인스턴스도 같은 주소값을 갖기때문에 복제된 인스턴스의 작업이 원래의 인스턴스에 영향을 미친다.
 *  
 * 
 * */
public class Exam_01 {
	public static void main(String[] args) {
		String h1 = "Hello";
		String h2 = "Hello";
		String h3 = new String("Hello");
		
		System.out.println("h1 hashcode = " + h1.hashCode());
		System.out.println("h2 hashcode = " + h2.hashCode());
		System.out.println("h3 hashcode = " + h3.hashCode());
		
		boolean isSame1 = h1 == h2;
		boolean isSame2 = h1 == h3;
		
		System.out.println("h1 == h2" + isSame1);
		
		// 같은 해쉬코드인데도 false 리턴한다.
		// ==(등위연산자)는 객체가 같은지를 비교하지만 객체가 갖고 있는 문자열을 비교하지는 않는다.
		System.out.println("h1 == h3" + isSame2);
		
		boolean isSame3 = h1.equals(h3);
		
		System.out.println("h1.equals(h3) : "+ isSame3);
	}
}
