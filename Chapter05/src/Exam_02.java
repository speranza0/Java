/*
 * 1차원 배열의 선언과 초기화
 * */
public class Exam_02 {
	public static void main(String[] args) {
		// 배열의 선언
		boolean[] a;
		int[] b;
		String[] c;
		float[] k;
		
		// 할당 => 실제 기억공간을 차지하는 작업
		a = new boolean[5]; // a[0] ~ a[4]
		b = new int[3]; // b[0] ~ b[2]
		c = new String[3]; // c[0] ~ c[2]
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("b[0] = " + b[0]);
		System.out.println("c[0] = " + c[0]); // 참조형의 기본값은 null
		
		// 배열의 선언과 초기화를 동시에 해보자.
		int[] x = new int[5]; // x[0] ~ x[4] => 0
		
		// 선언, 초기화, 값 할당
		int[] y = new int[] {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("y[" + i + "] = " + y[i]);
		}
		
		
		// 재할당
		c = new String[] {"국어", "영어", "수학"};
	}
}
