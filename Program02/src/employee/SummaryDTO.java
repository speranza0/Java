package employee;

// 개요를 선택했을때 필요한 정보를 객체로 담아 전달하기 위한 클래스
public class SummaryDTO {
	private int employeeCount;
	private int premanentCount;
	private int saleCount;
	private int partTimeCount;
	private int salarySum;
	public SummaryDTO(int employeeCount, int premanentCount, int saleCount, int partTimeCount, int salarySum) {
		this.employeeCount = employeeCount;
		this.premanentCount = premanentCount;
		this.saleCount = saleCount;
		this.partTimeCount = partTimeCount;
		this.salarySum = salarySum;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public int getPremanentCount() {
		return premanentCount;
	}
	public void setPremanentCount(int premanentCount) {
		this.premanentCount = premanentCount;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	public int getpartTimeCount() {
		return partTimeCount;
	}
	public void setpartTimeCount(int partTimeCount) {
		this.partTimeCount = partTimeCount;
	}
	public int getSalarySum() {
		return salarySum;
	}
	public void setSalarySum(int salarySum) {
		this.salarySum = salarySum;
	}
	
	
}
