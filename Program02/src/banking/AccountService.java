package banking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountService {
	Account[] accountList;
	
	int accountIdx;
	
	static BufferedReader in;
	
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public AccountService() {
		accountList = new Account[100];
		accountIdx = 0;
	}
	
	// 메뉴 출력
	public void showMenu() {
		System.out.println("==== Banking System ====");
		System.out.println("1. 계좌 등록");
		System.out.println("2. 입금 처리");
		System.out.println("3. 출금 처리");
		System.out.println("4. 전체고객 잔액보기");
		System.out.println("5. 프로그램 종료");
		System.out.println("========================");
	}
	// 계좌 등록
	public void addAccount() throws IOException {
		System.out.println("\n==== 계좌 등록 ====");
		
		int accountNum = 0;
		do {
			System.out.print("계좌번호 = ");
			accountNum = Integer.parseInt(in.readLine());
		} while(accountNum < 1 || accountNum > 100);

		System.out.print("고객이름 = ");
		String name = in.readLine();
		
		int balance = 0;
		do {
			System.out.print("예금금액 = ");
			balance = Integer.parseInt(in.readLine());
		} while(balance < 0);
		
		Account account = new Account(accountIdx+1, accountNum, name, balance);
		
		accountList[accountIdx] = account;
		
		accountIdx++;
		
		System.out.println(name + "님 계좌가 등록되었습니다.");
	}
	// 입금처리
	public void inMoney() throws IOException {
		
		System.out.print("계좌번호 = ");
		int accountNum = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < accountIdx; i++) {
			if(accountNum == accountList[i].getAccountNum()) {
				int input = 0;
				int balance = accountList[i].getBalance();
				
				do {
					System.out.print("입금금액 = ");
					input = Integer.parseInt(in.readLine());
				} while(input < 0);
				
				balance += input;
				accountList[i].setBalance(balance);
				
				System.out.println(accountList[i].getName() + "님 현재 잔액은 " + balance + "원 입니다.");
				break;
			} else {
				System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
			}
		}
	}
	// 출금 처리
	public void outMoney() throws IOException {
		System.out.print("계좌번호 = ");
		int accountNum = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < accountIdx; i++) {
			if(accountNum == accountList[i].getAccountNum()) {
				int output = 0;
				int balance = accountList[i].getBalance();
				
				do {
					System.out.print("출금금액 = ");
					output = Integer.parseInt(in.readLine());
				} while(output < 0);
				
				if(balance - output < 0) {
					System.out.println("잔액이 모자랍니다.");
				} else {
					balance -= output;
					accountList[i].setBalance(balance);
					System.out.println(accountList[i].getName() + "님 현재 잔액은 " + balance + "원 입니다.");
				}
				break;
			} else {
				System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
			}
		}
	}
	// 계좌 정보
	public void showAllAccount() {
		System.out.println("\n==== 전체 고객 조회 ====");
		
		for(int i = 0; i < accountIdx; i++) {
			System.out.print("계좌번호 = " + accountList[i].getAccountNum() + ",\t");
			System.out.print("고객이름 = " + accountList[i].getName() + ",\t");
			System.out.print("예금잔액 = " + accountList[i].getBalance() + "\t");
			System.out.print("\n");
		}
	}
}