/*
 * 반복문과 배열
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		boolean[] a = new boolean[5];
		int[] b = new int[3];
		String[] c = new String[7];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
	}
}
