/*
 * 은행 계좌를 관리할 목적으로 Account 클래스를 구현하시오.
 * */

class Account {
	// 멤버필드
	int id; // 계좌번호
	String name; // 고객이름
	int balance; // 잔액
	
	// 생성자 메서드
	
	// 멤버 메서드
	public void make(String name, int balance) {
		id = (int)(Math.random() * 100);
		this.name = name;
		this.balance = balance;
	}
	
	public void input(int money) {
		balance += money;
	}
	
	public int output(int money) {
		if(balance < money) {
			return 0;
		} else {
			balance -= money;
			return money;
		}
	}
	
	public void showAccount() {
		System.out.println("계좌번호 = "+ id);
		System.out.println("고객이름 = " + name);
		System.out.println("예금잔액 = " + balance);
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.make("박씨", 100000);
		account.showAccount();
		System.out.println();
		
		account.input(50000);
		if(account.output(1000000) == 0) {
			System.out.println("잔액이 부족합니다!");
		}
		int money = account.output(5000);
		System.out.println("출금금액 = " + money);
		
		account.showAccount();
	}
}
