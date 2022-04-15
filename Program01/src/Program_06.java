import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 은행계좌관리 프로그램
 * 
 * <입력>
 * ==== Bank Menu ====
 * 1. 입금처리
 * 2. 출금처리
 * 3. 잔액조회
 * 4. 작업종료
 * ===================
 * 선택 = 
 * 
 * <입금처리 선택시>
 * 입금액 = 
 * 성공: xxx 입금 완료!
 * 실패: 잘못입력하셨습니다.
 * 
 * <출금처리 선택시>
 * 출금액 = 
 * 성공: xxx 출금 완료!
 * 실패: 
 *  잔액부족!
 *  잘못입력하셨습니다.
 *  
 *  <잔액조회 선택시>
 *  고객님의 잔액은 xxx원입니다.
 *  
 *  <작업종료 선택시>
 *  프로그램을 종료합니다. 이용해주셔서 감사합니다.
 *  
 * 
 * */
public class Program_06 {
	public static void main(String[] args) throws IOException{
		// 선언
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int balance = 0;
		
		// 입력
		while(true) {
			System.out.println("==== Bank Menu ====");
			System.out.println("1. 입금처리");
			System.out.println("2. 출금처리");
			System.out.println("3. 잔액조회");
			System.out.println("4. 작업종료");
			System.out.println("===================");
			System.out.println("선택 = ");
			int menu = Integer.parseInt(in.readLine());
			
			switch(menu) {
				case 1: {
					// 입금 처리
					int add;
					do {
						System.out.print("입금액 = ");
						add = Integer.parseInt(in.readLine());
					} while(add <= 0);
					
					balance += add;
					System.out.println(add + "원 입금 완료!");
					break;
			}
				case 2: {
					// 출금 처리
					int sub;
					do {
						System.out.print("출금액 = ");
						sub = Integer.parseInt(in.readLine());
					} while(sub <= 0);
					
					if(balance - sub >= 0 ) {
						balance -= sub;
						System.out.println(sub + "원 출금 완료!");
					} else {
						System.out.println("잔액부족!");
					}
					break;
				}
				case 3:{
					System.out.println("고객님의 잔액은 " + balance + "원 입니다.");
					break;
				}
				case 4:{
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
					System.exit(0);
					break;
				}
			}
		}
	}
}
