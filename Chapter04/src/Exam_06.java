/*
 * 1부터 100사이의 자연수를 출력하는 프로그램을 구현하시오.
 * 단 1줄에 10개씩만 출력되도록 구현할 것
 * 
 * <출력형식>
 * 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 17 18 19 20
 * ...
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) {
		for(int i = 1; i < 101; i++) {
			System.out.print(i + " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}
}

