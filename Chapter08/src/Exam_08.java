/*
 * 자바에서 자주 발생하는 예외
 * NullPointerException
 * => NPE
 * 
 * NULL 참조형 객체에 접근하여 뭔가 처리하려고 할때 발생한다.
 * 특히 DTO, VO, JAVA Bean과 같이 객체의 멤버필드의 값이 초기화 되어 있지 않은 경우
 * 해당 자료형의 메서드에 접근한 경우 발생한다.
 * 
 * ArrayIndexOutOfBoundsException
 * 배열의 인덱스를 초과하여 접근했을때
 * 
 * 
 * */

class Student {
	private String name;
	private int age;
	
	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Exam_08 {
	public static void main(String[] args) {
		Student student = new Student();
		String name = student.getName();
//		boolean isHong = name.equals("홍길동");
//		if(isHong) {
//			System.out.println("홍길동이 나타났다!");
//		} else {
//			System.out.println("없네?");
//		}
		
		// 이스케이핑, 세이프티 코딩
		if(name != null && name.equals("홍길동")) {
			System.out.println("홍길동이 나타났다!");
		} else {
			System.out.println("없네");
		}
		
		int [] arr = new int[] {1,2};
		System.out.println(arr[2]);
	}
}
