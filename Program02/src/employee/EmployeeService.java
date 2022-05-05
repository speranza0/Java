package employee;

import java.util.List;

/*
 * 사원 저장소의 연결통로인 Repository를 통해 데이터를 주고 받아 처리를 담당하는 클래스
 * 
 * */
public class EmployeeService {
	
	private EmployeeRepository repository = new EmployeeRepository();
	
	
	// 한명의 정보를 입력받아 객체를 생성하여 Repository로 전달
	// 오버로딩
	public void createEmployee(String name, int salary) {
		Employee employee = new Permanent(name, salary);
		repository.createOne(employee);
	}
	
	public void createEmployee(String name, int salary, int salesResult, float rate) {
		Employee employee = new Sales(name, salary, salesResult, rate);
		repository.createOne(employee);
	}
	
	public void createEmployee(String name, int timePay, int time) {
		Employee employee = new PartTime(name, timePay, time);
		repository.createOne(employee);
	}

	public SummaryDTO getSummary() {
		
		// 전체 직원수
		int employeeCount = repository.countAll();
		// 정규직, 영업직, 알바의 수
		int permanentCount = repository.countEmployeeType("정규직");
		int salesCount = repository.countEmployeeType("영업직");
		int partTimeCount = repository.countEmployeeType("알바");
		// 전체직원 급여의 합계
		int salarySum = repository.sumSalaryAll();
		
		SummaryDTO dto = new SummaryDTO(employeeCount, permanentCount, salesCount, partTimeCount, salarySum);
		
		return dto;
	}
	
	public List<Employee> selectAllEmployee() {
		return repository.selectAll();
	}
	
	public Employee selectOneEmployee(int idx) {
		return repository.selectOne(idx);
	}
	
	public void updateEmployee(int idx, String name, int salary) {
		Employee employee = new Permanent(name, salary);
		repository.updateOne(idx, employee);
	}
	
	public void updateEmployee(int idx, String name, int salary, int salesResult, float rate) {
		Employee employee = new Sales(name, salary, salesResult, rate);
		repository.updateOne(idx, employee);
	}
	
	public void updateEmployee(int idx, String name, int timePay, int time) {
		Employee employee = new PartTime(name, timePay, time);
		repository.updateOne(idx, employee);
	}
	
	public void removeEmployee(int idx) {
		repository.removeOne(idx);
	}
}
