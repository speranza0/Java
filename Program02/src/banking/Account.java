package banking;

public class Account {
	private String accountNum;
	private int balance;
	private String name;
	
	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
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
