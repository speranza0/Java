package employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 메뉴를 출력하거나 화면에 관련된 처리를 담당하는 클래스
 * 
 * */
public class EmployeeController {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 포함 오브젝트
		EmployeeService service = new EmployeeService();
		
		while(true) {
			System.out.println("==== Employee System ====");
			System.out.println("1. 직원 등록");
			System.out.println("2. 직원 조회");
			System.out.println("3. 직원 수정");
			System.out.println("4. 직원 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("=========================");
			System.out.print("선택 = ");
			int menu = Integer.parseInt(in.readLine());
			
			switch(menu) {
			case 1:
				System.out.println("<직원 등록>");
				System.out.print("고용형태(1.정규직 / 2.영업직 / 3.알바) = ");
				int createMenu = Integer.parseInt(in.readLine());
				System.out.print("이름 = ");
				String name = in.readLine();
				
				if(createMenu == 1) {
					System.out.println("기본급 = ");
					int salary = Integer.parseInt(in.readLine());
					
					service.createEmployee(name, salary);
					System.out.println(name + "직원이 등록되었습니다.");
				} else if(createMenu == 2) {
					System.out.print("기본급 = ");
					int salary = Integer.parseInt(in.readLine());
					
					System.out.print("판매실적 = ");
					int saleSResult = Integer.parseInt(in.readLine());
					
					System.out.print("보너스율 = ");
					float rate = Float.parseFloat(in.readLine());
					
					service.createEmployee(name, salary, saleSResult, rate);
					System.out.println(name + "직원이 등록되었습니다.");
				} else if(createMenu == 3) {
					System.out.print("시급 = ");
					int timePay = Integer.parseInt(in.readLine());
					
					System.out.print("근무시간 = ");
					int time = Integer.parseInt(in.readLine());
					
					service.createEmployee(name, timePay, time);
					System.out.println(name + "직원이 등록되었습니다.");
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				break;
			case 2:
				System.out.println("<직원 조회>");
				System.out.println("1.개요");
				System.out.println("2.전체 조회");
				System.out.println("3.특정 직원 조회");
				System.out.print("선택 = ");
				int searchMenu = Integer.parseInt(in.readLine());
				
				if(searchMenu == 1) {
					SummaryDTO dto = service.getSummary();
					System.out.println("[개요]");
					System.out.println("직원수 = " + dto.getEmployeeCount());
					System.out.println("정규직 = " + dto.getPremanentCount());
					System.out.println("영업직 = " + dto.getSaleCount());
					System.out.println("알바 = " + dto.getpartTimeCount());
					System.out.println("전체 직원 급여 = " + dto.getSalarySum());
				} else if(searchMenu == 2) {
					Employee[] empList = service.selectAllEmployee();
					System.out.println("[전체 조회]");
					System.out.println("사번\t이름\t고용형태\t급여");
					for(int i = 0; i < empList.length; i++) {
						if(empList[i] != null) {
							System.out.print(empList[i].getIdx() + "\t");
							System.out.print(empList[i].getName() + "\t");
							System.out.print(empList[i].getEmployeeType() + "\t");
							System.out.println(empList[i].getSalary());
						}
					}
				} else if(searchMenu == 3) {
					System.out.println("[특정 직원 조회]");
					System.out.print("사번 = ");
					int idx = Integer.parseInt(in.readLine());
					Employee employee = service.selectOneEmployee(idx);
					
					if(employee == null) {
						System.out.println("사번에 해당하는 직원이 없습니다.");
					} else {
						System.out.println("이름 : " + employee.getName());
						System.out.println("고용형태 : " + employee.getEmployeeType());
						
						// 다운캐스팅
						if(employee instanceof Permanent) {
							Permanent permanent = (Permanent)employee;
							System.out.println("기본급 : " + permanent.getSalary());
						} else if(employee instanceof Sales) {
							Sales sales = (Sales)employee;
							System.out.println("기본급 : " + sales.getSalary());
							System.out.println("판매실적 : " + sales.getSalesResult());
							System.out.println("보너스율 : " + sales.getRate());
						} else if(employee instanceof PartTime) {
							PartTime partTime = (PartTime)employee;
							System.out.println("시급 : " + partTime.getTimePay());
							System.out.println("근무시간 : " + partTime.getTime());
						}
					}
				}
				break;
			case 3:
				System.out.println("<직원 수정>");
				System.out.print("사번 = ");
				int updateIdx = Integer.parseInt(in.readLine());
				
				Employee employee = service.selectOneEmployee(updateIdx);
				if(employee == null) {
					System.out.println("사번에 해당하는 직원이 없습니다.");
				} else {
					System.out.print("고용형태(1.정규직 / 2.영업직 / 3.알바) = ");
					int updateMenu = Integer.parseInt(in.readLine());
					System.out.print("이름 = ");
					String newName = in.readLine();
					
					if(updateMenu == 1) {
						System.out.println("기본급 = ");
						int salary = Integer.parseInt(in.readLine());
						
						service.updateEmployee(updateIdx, newName, salary);
						System.out.println(newName + "직원이 등록되었습니다.");
					} else if(updateMenu == 2) {
						System.out.print("기본급 = ");
						int salary = Integer.parseInt(in.readLine());
						
						System.out.print("판매실적 = ");
						int saleSResult = Integer.parseInt(in.readLine());
						
						System.out.print("보너스율 = ");
						float rate = Float.parseFloat(in.readLine());
						
						service.updateEmployee(updateIdx, newName, salary, saleSResult, rate);
						System.out.println(newName + "직원이 등록되었습니다.");
					} else if(updateMenu == 3) {
						System.out.print("시급 = ");
						int timePay = Integer.parseInt(in.readLine());
						
						System.out.print("근무시간 = ");
						int time = Integer.parseInt(in.readLine());
						
						service.updateEmployee(updateIdx, newName, timePay, time);
						System.out.println(newName + "직원이 등록되었습니다.");
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
				break;
			case 4:
				System.out.println("<직원 삭제>");
				System.out.print("사번 = ");
				int removeIdx = Integer.parseInt(in.readLine());
				
				Employee removeEmployee = service.selectOneEmployee(removeIdx);
				if(removeEmployee == null) {
					System.out.println("사번에 해당하는 직원이 없습니다.");
				} else {
					service.removeEmployee(removeIdx);
					System.out.println(removeEmployee.getName() + "직원이 삭제되었습니다.");
				}
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
