import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 학생을 관리하는 Student 객체를 만들어 학번을 key로 가지는 Map을 생성해보자.
 * */
class Student {
	private int id;
	private String name;
	private String tel;
	
	public Student(int id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
public class Exam_08 {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		Student student1 = new Student(101, "홍길동", "1234");
		Student student2 = new Student(102, "장보고", "4321");
		Student student3 = new Student(103, "이순신", "9876");
		
		map.put(student1.getId(), student1);
		map.put(student2.getId(), student2);
		map.put(student3.getId(), student3);
		
		// map의 크기
		System.out.println("Map의 크기는 = " + map.size()); // 3
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			Student student = map.get(it.next());
			System.out.println("학번 = " + student.getId());
			System.out.println("이름 = " + student.getName());
			System.out.println("연락처 = " + student.getTel());
		}
	}
}
