import java.time.LocalDate;
import java.time.Period;

/*
 * 두 날짜 및 시간의 간격
 * 
 * java.time.Period => 날짜(LocalDate)
 * java.time.Duration => 시간(LocalTime)
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) {
		LocalDate army = LocalDate.of(2010, 1, 26);
		LocalDate now = LocalDate.now();
		
		Period pe = Period.between(army, now);
		System.out.println("위병소 탈출경과 년도 = " + pe.getYears());
		System.out.println("위병소 탈출경과 월 = " + pe.getMonths());
		System.out.println("위병소 탈출경과 일 = " + pe.getDays());
		
		// D-day는 어떻게?
		// LocalDate의 toEpochDay() => Epoch Day인 1970-01-01부터 날짜를 세어서 반환
		long dday = now.toEpochDay() - army.toEpochDay();
		System.out.println("위병소 탈출까지 지난 날 = " + dday);
	}
}
