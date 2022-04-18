/*
 * 메서드 4가지 유형
 *  - 결과형 리턴값도 없고, 매개변수도 없는 형태
 *  - 결과형 리턴값은 없고, 매개변수는 있는 형태
 *  - 결과형 리턴값은 있고, 매개변수는 없는 형태
 *  - 결과형 리턴값도 있고, 매개변수도 있는 형태
 * */
public class Exam_06 {
	public static void aaa() {
		System.out.println("메서드 유형 실습");
		return;
		// return; 생략되어있다.
	}
	
	public static void bbb(int x, int y) {
		System.out.println(x + " + " + y + "=" + (x+y));
	}
	
	public static int ccc() {
		return 34;
	}
	
	public static float ddd(float a) {
		return a;
	}
	
	public static boolean eee() {
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("main의 시작");
		int a = ccc();
		boolean b = eee();
		System.out.println(a); // 34
		System.out.println(ccc()); // 34
		System.out.println(b); // false
		System.out.println("main의 끝");
	}
}
