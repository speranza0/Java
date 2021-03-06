/*
 * 자바의 변수
 * 자바는 자료형을 명시해줘야 한다.
 * 자바스크립트에서 var를 사용했다면
 * 자바는 구체적으로 그 자료의 형태가 무엇인지를 명확하게 선언해줘야한다.
 * 
 * 자료형 변수명 = 값;
 * 
 * 자료형
 * 자바의 8대 기본 자료형
 * 원시타입 (Primitive type)
 * boolean true / false 1byte
 * char 문자 2byte unsigned(음수부를 사용하지 않음)
 * byte 정수 -128 ~ 127 1byte
 * short 정수 -32768 ~ 32767 2byte
 * int 정수 -2147483648 ~ 2147483647 4byte (정수의 기본형)
 * long 정수 8byte
 * float 실수 4byte
 * double 실수 8byte (실수의 기본형)
 * 
 * 참조자료형
 * 참조타입(Reference Type)
 * 원시 타입을 제외한 타입들(문자열, 배열, 열거, 클래스, 인터페이스)...
 * 
 * */
public class Exam_01 {
	public static void main(String[] args) {
		byte aa; // 선언만 함
		byte a = 1; // 선언과 동시에 할당 => 변수 초기화
		a = 2;
		
		boolean b = false;
		byte c = 127;
		
		short d = 32767;
		int e = 100;
		long f = 100L; // L 써야 long 인식
		
		float g = 3.14f; // f 써야 float로 인식
		double h = 3.14;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
	}
}
