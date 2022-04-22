package employee;

public class Sales extends Employee{
	
	private int salary;
	private int salesResult;
	private float rate;
	
	
	public Sales(String name, int salary, int salesResult, float rate) {
		super(name);
		this.salary = salary;
		this.salesResult = salesResult;
		this.rate = rate;
	}
	

	public int getSalesResult() {
		return salesResult;
	}


	public void setSalesResult(int salesResult) {
		this.salesResult = salesResult;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int getSalary() {
		return salary + (int)(salesResult*rate);
	}

	@Override
	public String getEmployeeType() {
		return "영업직";
	}
	
}
