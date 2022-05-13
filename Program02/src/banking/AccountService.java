package banking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
	AccountRepository accountRepository = new AccountRepository();
	List<Account> accountList; 
	
	static BufferedReader in;
	
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
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
		
		String accountNum;
		System.out.print("계좌번호 = ");
		accountNum = in.readLine();

		System.out.print("고객이름 = ");
		String name = in.readLine();
		
		int balance = 0;
		do {
			System.out.print("예금금액 = ");
			balance = Integer.parseInt(in.readLine());
		} while(balance < 0);
		
		Account account = new Account(accountNum, name, balance);
		
		accountRepository.createOne(account);
		
		System.out.println(name + "님 계좌가 등록되었습니다.");
	}
	// 입금처리
	public void inMoney() throws IOException {
		
		System.out.print("계좌번호 = ");
		String accountNum = in.readLine();
		
		Account account = accountRepository.selectOne(accountNum);
		
		if(account == null) {
			System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
			return;
		}
		
		int input = 0;
		int balance = account.getBalance();
		
		do {
			System.out.print("입금금액 = ");
			input = Integer.parseInt(in.readLine());
		} while(input < 0);
		
		balance += input;
		account.setBalance(balance);
		
		accountRepository.updateOne(account.getIdx(), account);
		
		System.out.println(account.getName() + "님 현재 잔액은 " + balance + "원 입니다.");
	}
	
	// 출금 처리
	public void outMoney() throws IOException {
		System.out.print("계좌번호 = ");
		String accountNum = in.readLine();
		
		Account account = accountRepository.selectOne(accountNum);
		
		if(account == null) {
			System.out.println("입력하신 계좌번호가 존재하지 않습니다.");
			return;
		}
		
		int output = 0;
		int balance = account.getBalance();
		
		do {
			System.out.print("출금금액 = ");
			output = Integer.parseInt(in.readLine());
		} while(output < 0);
		
		if(balance - output < 0) {
			System.out.println("잔액이 모자랍니다.");
		} else {
			balance -= output;
			account.setBalance(balance);
			accountRepository.updateOne(account.getIdx(), account);
			System.out.println(account.getName() + "님 현재 잔액은 " + balance + "원 입니다.");
		}
	}
	// 계좌 정보
	public void showAllAccount() {
		System.out.println("\n==== 전체 고객 조회 ====");
		
		List<Account> accountList = accountRepository.selectAll();
		
		for(int i = 0; i < accountList.size(); i++) {
			Account account = accountList.get(i);
			System.out.print("계좌번호 = " + account.getAccountNum() + ",\t");
			System.out.print("고객이름 = " + account.getName() + ",\t");
			System.out.print("예금잔액 = " + account.getBalance() + "\t");
			System.out.print("\n");
		}
	}
}
