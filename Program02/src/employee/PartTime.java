package employee;

public class PartTime extends Employee{
	
	private int timePay;
	private int time;
	
	public PartTime(String name, int timePay, int time) {
		super(name);
		this.timePay = timePay;
		this.time = time;
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public int getSalary() {
		return timePay * time;
	}

	@Override
	public String getEmployeeType() {
		return "알바";
	}
	
}
