package banking;

public class Account {
	private int idx;
	private int accountNum;
	private int balance;
	private String name;
	
	public Account(int idx, int accountNum, String name, int balance) {
		this.idx = idx;
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
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
