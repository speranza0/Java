/*
 * Enum
 * */

enum AGE {
	CHILD(19), ADULT(59), SENIOR(99);
	int age;
	
	AGE(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		int age = 12;
		
		// 담배 구입이 가능한 여부를 체크하는 로직
		if(canTabaco(age)) {
			System.out.println("구매 가능");
		} else {
			System.out.println("구매 불가능");
		}
	}
	
	static boolean canTabaco(int age) {
		AGE con = AGE.ADULT;
		return con.age <= age;
	}
}
