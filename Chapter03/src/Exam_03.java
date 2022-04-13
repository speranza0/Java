/*
 * 산술연산자
 * "+" : 더하기
 * "-" : 빼기
 * "*" : 곱하기
 * "/" : 나누기
 * "%" : 나눈 나머지
 * 
 * 연결연산자
 * "+" : 문자 더하기 (연결해서 작성해라!)
 * 자료의 타입이나 연산의 방향에 따라 결정된다.
 * 
 * 연산방향 : 좌에서 우로 진행
 * 
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		int x = 12;
		int y = 24;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("x + y = " + (x + y));
		
		System.out.println('A' + x); // 77
		System.out.println("A" + x); // A12
		System.out.println("A" + (x+y)); // A36
		
		int a = 0;
		int b = 1;
		
		int c = b/a;
		
		System.out.println(c); // JS => infinity Java는 에러
	}
}
