

public class Exam_02 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
			System.out.println(0/0);
			System.out.println(5);
		} catch (Exception e) {
			System.out.println("0으로 나누지마");
		}
	}
}
