package banking;

public class Account {
	private int idx;
	private String accountNum;
	private int balance;
	private String name;
	
	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	public Account(int idx, String accountNum, int balance, String name) {
		this.idx = idx;
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
