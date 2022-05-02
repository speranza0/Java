import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * java.time.LocalTime => 시간
 * java.time.LocalDate => 날짜
 * java.time.LocalDateTime => 날짜와 시간
 * 
 * java.time 패키지에 속한 클래스의 객체 생성은 now()와 of()로 한다.
 * LocalDate date = LocalDate.now(); // 현재의 날짜
 * LocalDate date = LocalDate.of(2010, 10, 04); => 구체적인 날짜 설정 가능
 * 
 * 필드값 변경
 * 날짜와 시간에서 특정 필드 값을 변경하려면 with로 시작하는 메서드를 사용한다.
 * withYear
 * withMonth
 * withHour
 * ...
 * 
 * 필드 값 증가 감소
 * 날짜와 시간에서 특정 필드의 값을 증가시키거나 감소시키려면 plus minus로 시작하는 메서드를 사용한다.
 * plusYear
 * minusYear
 * ...
 * 
 * 날짜 출력 형식
 * java.time.format.DateTimeFormatter
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("dateTime = " + dateTime);
		
		LocalDate date2 = LocalDate.of(2010, 1, 26);
		System.out.println("입대일 = " + date2);
		
		// LocalDate와 LocalTime을 합쳐서 만들 수 있다.
		LocalDateTime dateTime2 = LocalDateTime.of(date2, LocalTime.now());
		System.out.println("dateTime2 = " + dateTime2);
		
		// 반대로 LocalDateTime을 LocalDate 또는 LocalTime으로 변환할 수 있다.
		dateTime2.toLocalDate();
		dateTime2.toLocalTime();
		
		
		LocalDateTime dateTime3 = dateTime2.plusYears(5);
		System.out.println("dateTime3 = " + dateTime3);
		
		// 불변성을 지니기때문에 리턴한 값을 다시 담아서 사용해야한다.
		date2 = date2.withYear(2022);
		System.out.println("DateTime2 withYear 2022 = " + date2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String format = formatter.format(dateTime2);
		
		System.out.println("date2 format = " + format);
	}
}
