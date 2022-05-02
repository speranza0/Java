import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * 생년월일 앞자리 8자리를 입력받아
 * 그사람의 생일이 올해 얼마나 남았는지 보여주는 프로그램을 작성하시오.
 * 
 * <처리 조건>
 * 1. 생일이 지나지 않았다면 D-day를 표현할것
 * 2. 생일이 지났다면 경과일을 표현할것
 * 3. 생일이 오늘이라면 '생일입니다 축하드립니다'를 출력할것
 * */
public class Exma_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("생년월일 8자리 = ");
		String birthStr = in.readLine();
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate birth = LocalDate.parse(birthStr, dtf);
		
		LocalDate nowBirth = birth.withYear(now.getYear());
		
		if(now.isEqual(nowBirth)) {
			System.out.println("생일입니다. 축하드립니다.");
		} else if(now.isBefore(nowBirth)) {
			long dueday = nowBirth.toEpochDay() - now.toEpochDay();
			System.out.println("생일은 " + dueday + "일 남았습니다.");
		} else {
			long elapsedday = now.toEpochDay() - nowBirth.toEpochDay();
			System.out.println("생일은 " + elapsedday + "일 지났습니다.");
		}
	}
}
