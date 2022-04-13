/*
 * '=' 대입연산자
 * 변수 = 상수 값
 * 변수 = 변수
 * 변수 = 수식(숫자를 이용한 계산식-산술식, 논리식, 관계식)
 * */
public class Exam_01 {
	public static void main(String[] args) {
		int su1;
		int su2;
		int su3;
		int su4;
		
		su1 = 10; // 상수 값
		su2 = 20; // 상수 값
		su3 = su1 + su2; // 수식
		su4 = su3; // 변수
		
		System.out.println("su3 = " + su3);
		System.out.println(su1 + "+" + su2 + "=" + su3);
		
		boolean a = true;
		boolean b = false;
		boolean c = a && b; // 논리식
	}
}