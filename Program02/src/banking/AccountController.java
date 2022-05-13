package banking;

import java.io.IOException;

public class AccountController {
	public static void main(String[] args) throws IOException {
		AccountService service = new AccountService();
		
		int menu = 0;
		boolean isStop = false;
		while(!isStop) {
			service.showMenu();
			System.out.print("선택 = ");
			menu = Integer.parseInt(AccountService.in.readLine());
			
			switch(menu) {
			case 1:
				service.addAccount();
				break;
			case 2:
				service.inMoney();
				break;
			case 3:
				service.outMoney();
				break;
			case 4:
				service.showAllAccount();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				isStop = true;
				break;
			default:
				System.out.println("선택이 올바르지 않습니다.");
				break;
			}
		}
		System.out.println("종료");
	}
}
