/*
 * Call By Value
 * => 값에 의한 호출
 *    메서드의 매개변수 값을 이용하여 호출하는 행위
 *    메서드 내에서는 복사된 값으로 작업을 하기 때문에 원래의 값을 변경시키지 않는다.
 * */
public class Exam_04 {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int copy(int x, int y) {
		x = 3;
		y = 2;
		return x + y;
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 7;
		int result = 0;
		
		result = add(x, y);
		System.out.println("sum = " + result); // 17
		
		result = copy(x, y);
		System.out.println("sum = " + result); // 5
		System.out.println("x = " + x); // 10
		System.out.println("y = " + y); // 7
	}
}
