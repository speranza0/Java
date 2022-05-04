import java.util.ArrayList;

/*
 * ArrayList
 * 가변 배열의 형태
 * 
 * <선언 및 초기화>
 * ArrayList<자료형> 인스턴스명 = new ArrayList<자료형>();
 * List<자료형> 인스턴스명 = new ArrayList<자료형>();
 * -> 다형성적 표현
 * 
 * <관련 메서드>
 * 인스턴스로 접근
 * add(자료) -> 자료구조에 자료를 추가한다.
 * add(인덱스, 자료) -> 원하는 인덱스에 자료를 추가한다 (전체 크기보다 큰 인덱스에는 넣을 수 없다.)
 * size() -> 현재의 리스트 크기를 반환한다. length와 동일한 기능이다.
 * get(인덱스) -> 특정 인덱스의 자료를 가져온다.
 * remove(인덱스) -> 특정 인덱스의 자료를 삭제한다(삭제된 객체를 리턴해준다.)
 * remove(자료) -> 해당 자료와 동일한 자료를 리스트에서 삭제한다(성공시 true 리턴)
 * 
 * 
 * */
public class Exam_02 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("이순신");
		names.add("강감찬");
		
		for(int i = 0; i < names.size(); i++) {
			// names[i] => names.get(i)
			System.out.println(names.get(i));
		}
		
		System.out.println();
		
		String removed = names.remove(0);
		System.out.println(removed);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println(names.size()); // 1
	}
}
