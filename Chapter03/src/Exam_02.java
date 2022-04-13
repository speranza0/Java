/*
 * 단항연산자
 * 
 * 증감연산자 : 1씩 증가하거나 감소하는 연산자
 * 전위연산자 : ++a, --b
 * 후위연산자 : a++, b--
 * 
 * 부호연산자 : +, -
 * 
 * */
public class Exam_02 {
	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		y = ++x;
		System.out.println();
		System.out.println("x = " + x); // 101
		System.out.println("y = " + y); // 101
		
		y = x++;
		System.out.println();
		System.out.println("x = " + x); //102
		System.out.println("y = " + y); //101
		
		int a = -1;
		int b = +1; // 양수는 생략이 가능하다.
		
		System.out.println();
		System.out.println("a = " + a); // -1
		System.out.println("b = " + b); // 1
	}
}
