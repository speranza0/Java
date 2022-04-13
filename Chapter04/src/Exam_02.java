/*
 * 조건문
 * if, if~else, if ~ else if, if ~ else if ~else
 * 
 * */
public class Exam_02 {
	public static void main(String[] args) {
		if(true) {
			System.out.println("참");
		}
		
		boolean a = false;
		
		if(a) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		int b = 2;
		int c = 2;
		
		if(b > c) {
			System.out.println("크다");
		} else if(b < c) {
			System.out.println("작다");
		} else {
			System.out.println("같다");
		}
	}
}
