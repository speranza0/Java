/*
 * class static 블록
 * static 필드를 제어할 목적으로 사용되는 메서드로 static만 담을 수 있다.
 * 클래스가 로딩될때 static 필드를 초기화할 수 있다.
 * 
 * */
class Bank {
	private String name;
	public static float rate;
	private double money;
	
	// static 블록
	static {
		rate = 0.03f;
	}
	
	public Bank(String name, float rate, double money) {
		this.name = name;
		this.money = money;
		Bank.rate = rate;
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("rate : " + rate);
		System.out.println("money : " + money);
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		System.out.println(Bank.rate);
		
		Bank aaa = new Bank("aaa", 0.09f, 1000.0);
		aaa.display();
		System.out.println();
		
		Bank bbb = new Bank("bbb", 0.05f, 1000.0);
		aaa.display(); // rate 0.05
		bbb.display(); // rate 0.05
	}
}
