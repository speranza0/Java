/*
 * 상수필드와 변수를 위한 final
 * 1. final 필드 : 상수 값을 지정하기 위한 공간으로 값이 변경되지 않는다.
 *    - 지역변수나 멤버필드 모두 가능하다.
 *    - 리터럴 상수의 경우 대문자로 쓴다! static final
 *    
 * 2. final 메서드 : 상속시 오버라이딩(재정의) 되지 않아야할 메서드에 저장하는 예약어
 * 
 * <변수명의 표기법>
 * 스네이크 케이스(snake case)
 * => 언더바(_)가 들어있는 표현 방식 뱀처럼 생겼다고 스네이크케이스라고 한다
 * int snake_case;
 * 데이터베이스의 필드명
 * 
 * 카멜케이스(camel case)
 * => 중간 글자들은 대문자로 시작하지만 첫글자가 소문자인 경우 낙타와 모양이 비슷하다하여 카멜케이스라고 한다.
 * String camelCase;
 * 자바의 변수에 활용
 * 
 * 파스칼케이스(pascal case)
 * => 첫글자와 중간글자들이 대문자인 경우 파스칼언어의 표기법과 유사하여 파스칼케이스라고 함.
 * float PascalCase;
 * 주로 자바의 클래스에 활용!
 * 
 * */

class Circle {
	public static final double PI_VALUE = 3.141592;
}
public class Exam_08 {
	public static void main(String[] args) {
		System.out.println(Circle.PI_VALUE);
	}
}
