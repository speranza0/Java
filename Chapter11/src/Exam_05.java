import java.util.HashSet;
import java.util.Set;

/*
 * 로또 번호 추첨기
 * Set을 활용하여 로또 번호 추첨기를 만들어보자.
 * 
 * */
public class Exam_05 {
	public static void main(String[] args) {
		Set<Integer> number = new HashSet<Integer>();
		
		while(number.size() < 6) {
			number.add((int)(Math.random()*45 + 1));
		}
		
		System.out.println("이번주 로또 1등 당첨번호 = " + number);
		// 1 ~ 45 랜덤 값
	}
}
