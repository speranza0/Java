/*
 * 상속관계에서의 접근지정자
 * private : 전용, 클래스 밖 혹은 상속관계에서도 접근을 허용하지 않는다.
 * default : 같은 패키지 내에서는 접근이 허용된다.
 * protected : 상속, 같은 클래스, 같은 패키지에서 접근을 허용한다.
 * public : 공용, 객체만 가지고 있다면 어디서든 접근을 허용한다. 
 * */

class Z {
	private int a;
	public String b;
	protected String c;
	
	public Z(int a) {
		this.a = a;
	}
	
	// 오버로딩
	public Z(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

class Y extends Z {

	public Y(int a) {
		super(a);
	}
	
	public void display() {
		System.out.println(this.c);
	}
	
}
public class Exam_10 {
	public static void main(String[] args) {
		Z z1 = new Z(1);
		// z1.a
		Y y1 = new Y(2);
		System.out.println(y1.b);
		System.out.println(y1.c);
	}
}
