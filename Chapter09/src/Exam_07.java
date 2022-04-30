/*
 * Math 클래스
 * abs => 절대값
 * ceil => 올림 double 값 리턴
 * floor => 내림 double 값 리턴
 * round => 반올림한 정수값(long)리턴
 * max => 주어진 두값을 비교하여 큰쪽을 리턴
 * min => 주어진 두값을 비교하여 작은쪽을 리턴
 * random => 0 <= x < 1.0의 범위의 임의의 double값을 리턴
 * */
public class Exam_07 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-5)); //5
		System.out.println(Math.ceil(3.14)); // 4.0
		System.out.println(Math.floor(3.14)); // 3.0
		System.out.println(Math.max(3, 6)); // 6
		System.out.println(Math.min(3, 6)); // 3
		System.out.println(Math.random()); // ?
	}
}
