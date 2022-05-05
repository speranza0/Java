/*
 * 상수 활용
 * */

class Constant {
	public static final String GENDER = "man";
	public static final int ADULT = 19;
	
}
public class Exam_02 {
	public static void main(String[] args) {
		String gender = "man";
		int age = 12;
		
		// 담배 구입이 가능한 여부를 체크하는 로직
		if(canTabaco(age)) {
			System.out.println("구매 가능");
		} else {
			System.out.println("구매 불가능");
		}
	}
	
	static boolean canTabaco(int age) {
		return Constant.ADULT <= age;
	}
}
