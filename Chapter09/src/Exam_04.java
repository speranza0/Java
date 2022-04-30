/*
 * 참조 자료형의 깊은복사
 * 다양한 방법이 있으나 주로 아래의 3가지 방법을 사용한다.
 * 1. 복사 생성자 또는 복사 팩토리를 이용하여 복사한다.
 * 2. 직접 객체 생성하여 복사
 * 3. Cloneable을 상속받아 구현하여 clone()을 재정의한다.
 * 
 * */
class Student {
	private String name;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동");
		Student student2 = new Student();
		
		student2.setName(student1.getName());
		
		System.out.println("student1 hashCode = " + student1.hashCode());
		System.out.println("student2 hashCode = " + student2.hashCode());
		
		student2.setName("홍길동");
		System.out.println("student1 hashCode = " + student1.hashCode());
		System.out.println("student2 hashCode = " + student2.hashCode());
		
		// 둘의 객체에 담긴 이름의 값은 같다 => 같은 주소값인가?
		System.out.println("student1 name = " + student1.getName());
		System.out.println("student2 name = " + student2.getName());
		
		// 자바는 효율적으로 메모리를 관리한다
		System.out.println("student1 hashCode = " + student1.getName().hashCode());
		System.out.println("student2 hashCode = " + student2.getName().hashCode());
		
		// 두 객체는 서로 다르기때문에 서로 영향을 주지 않는다. => 깊은 복사
		System.out.println("student1 equals student2 = " + student1.equals(student2));
	}
}
