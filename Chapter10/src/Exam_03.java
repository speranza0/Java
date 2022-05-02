import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * java.util.Date
 * java.util.Calendar
 * java.text.SimpleDateFormat
 * 
 * Mon May 02 13:10:11 KST 2022
 * 
 * yyyy - 년도 2022
 * yy - 년도 뒷자리 22
 * MM - 월 05
 * M - 월 5 / 11 => 11
 * dd - 일 02
 * d - 일 2 / 11 => 11
 * HH - 시간 (24시간)
 * hh - 시간(12시간)
 * mm - 분
 * ss - 초
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Date ~ ");
		System.out.println(date);
		
		System.out.println(date.getYear()); // 122? 현재 연도 - 1900 한 값...
		System.out.println(date.getMonth()); // JS처럼 0부터 시작한다.
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println();
		System.out.println("Calendar ~ ");
		Calendar cal = Calendar.getInstance();
		Date calDate = cal.getTime();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // JS처럼 0부터 시작한다
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		System.out.println(calDate);
		
		System.out.println();
		System.out.println("SimpleDateFormat ~ ");
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(cal.getTime());
		System.out.println(result);
		
		SimpleDateFormat df2 = new SimpleDateFormat("yy년 MM월 dd일");
		String result2 = df2.format(cal.getTime());
		System.out.println(result2);
	}
}
