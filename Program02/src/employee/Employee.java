package employee;

public abstract class Employee {
	private int idx;
	private String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract int getSalary();
	
	public abstract String getEmployeeType();
}
