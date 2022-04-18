/*
 * Call By Name
 * => 이름에 의한 호출
 * */
public class Exam_03 {
	public static void star(int x) {
		for(int i = 0; i < x; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		star(4); // Call By Name
		System.out.println("별을 찍자~");
		star(4);
		System.out.println();
		star(10);
		System.out.println("자바가 아주 쉽다");
		System.out.println("매우 쉽다!");
		star(1);
		System.out.println("원하는 만큼 호출하기");
		star(3);
		star(2);
	}
}
