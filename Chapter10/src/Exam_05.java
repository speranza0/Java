import java.time.LocalDate;

/*
 * 날짜와 시간 비교
 * 
 * compareTo()
 * date1.compareTo(date2);
 * 두 날짜가 같으면 0 date1이 이전이면 음수 이후면 양수
 * 
 * boolean형 메서드
 * isAfter
 * isBefore
 * isEqual
 * 
 * date1.isAfter(date2) date1이 date2뒤에 있는가?
 * */
public class Exam_05 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2010, 1, 26);
		LocalDate date2 = LocalDate.now();
		LocalDate date3 = LocalDate.of(2010, 1, 26);
		
		LocalDate date4 = LocalDate.of(2022, 8, 1);
		LocalDate date5 = LocalDate.of(2022, 4, 1);
		
		System.out.println("date1.compareTo(date2) = " + date1.compareTo(date2)); // year => month => day => hour ...순서대로 차이를 리턴
		System.out.println("date4.compareTo(date5) = " + date4.compareTo(date5));
		
		System.out.println("date2.compareTo(date1) = " + date2.compareTo(date1));
		
		System.out.println("date1.isAfter(date2) = " + date1.isAfter(date2)); // false
		System.out.println("date2.isAfter(date1) = " + date2.isAfter(date1)); // true
		
	}
}
