/*
 * abstract(추상) : 설계도(디자인)
 * 
 * 1. abstract class
 *   - abstract 메서드를 포함하고 있는 클래스로 다형성 표현으로 사용한다.
 *   - 객체를 발생시킬수 없는 것을 제외하면 일반 클래스와 동일하다.
 *   
 * 2. abstract method
 *   - 메서드의 내용부가 정의되지 않은 형태
 *   - 반드시 오버라이딩(재정의)되어야 사용할 수 있다.
 *   
 * */

abstract class Calculator {
	private String name;
	
	public Calculator(String name) {
		this.name = name;
	}
	
	public abstract int add(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
	
	public void display() {
		System.out.println("계산기 이름 = " + this.name);
	}
}

class MyCalculator extends Calculator {

	public MyCalculator(String name) {
		super(name);
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}
	
}

class FriendCalculator extends Calculator {

	public FriendCalculator(String name) {
		super(name);
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x*x + y*y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x*x - y*y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*x * y*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return (x*x) / (y*y);
	}
	
}
public class Exam_13 {
	public static void main(String[] args) {
		Calculator cal = new MyCalculator("내꺼!");
		int x = 20;
		int y = 10;
		int result = 0;
		
		result = cal.add(x, y);
		
		System.out.println("x + y = " + result);
		cal.display();
		
		cal = new FriendCalculator("친구꺼!");
		result = cal.add(x, y);
		System.out.println("x + y = " + result);
		cal.display();
	}
}
