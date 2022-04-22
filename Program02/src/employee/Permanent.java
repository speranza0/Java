package employee;

public class Permanent extends Employee{
	
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public String getEmployeeType() {
		return "정규직";
	}
	
}
