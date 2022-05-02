/*
 * 날짜와 시간
 * java.util.Date
 * java.util.Calendar
 *  - JDK 1.0 / 1.1에서 등장한 날짜를 관리하는 클래스
 *  - Calendar는 추상클래스로 객체를 직접 생성할 수는 없다. 메서드를 통해 구현된 클래스의 인스턴스를 얻어야한다.
 *  - 날짜나 시간을 변경하면 기존 객체가 변경된다 => A가 접속해서 날짜를 수정한게 B의 화면에서 반영이 되버린다(공유)
 *  - 멀티쓰레드 환경인 웹에서 쓰레드 세이프 하지 않을 수 있다.
 *  
 * java.time.LocalTime
 * java.time.LocalDate
 * java.time.LocalDateTime
 *   - Date, Calendar의 단점을 해소하기 위해 JDK 1.8부터 등장
 *   - 불변객체(Immutable) => 날짜나 시간을 변경하면 기존의 객체가 변경되는 것이 아니라 새로운 객체를 반환한다.
 *   - 쓰레드 세이프하게 사용할 수 있다.
 *   
 * 형식화
 * java.text.DecimalFormat
 *  - 숫자 데이터를 정수, 부동소수점, 금액 등의 다양한 형식으로 표현할 수 있다.
 *  
 * java.text.SimpleDateFormat
 *  - Date, Calendar 객체의 시간 정보를 원하는 형태로 데이터의 출력형식을 변환할 수 있다.
 *  
 * java.time.format.DateTimeFormatter
 *  - java.time 객체의 시간 정보를 원하는 형태로 데이터의 출력형식을 변환할 수 있다.
 *  
 * */
public class Exam_01 {

}
