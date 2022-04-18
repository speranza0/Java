/*
 * Call By Reference
 * => 참조(주소)에 의한 호출
 *    메서드에 참조형 데이터를 매개변수로 받아 처리하는 경우 해당 매개변수의 참조 데이터를 변경시킨다.
 *    
 * */
public class Exam_05 {
	
	public static void changeName(Human human, String name) {
		human.setName(name);
	}
	public static void main(String[] args) {
		Human human = new Human("홍길동");
		
		System.out.println(human.getName());
		changeName(human, "깁갑순");
		
		System.out.println(human.getName());
	}
}

// 클래스 문법.. 나중에 다시보자
class Human {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}