import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet
 * 중복을 허용하지 않으며 Iterator패턴을 사용할 수 있다.
 * 
 * Iterator?
 * 순환하다, 반복하다
 * 반복적으로 하나하나 꺼내어 처리가 가능한 컬렉션이다.
 * hasNext() 메서드로 해당값이 있는지 체크하여 next() 메서드를 사용하여 다음값을 리턴받아 사용할 수 있다.
 * 
 * <선언 및 초기화>
 * HashSet<자료형> 인스턴스명 = new HashSet<자료형>();
 * Set<자료형> 인스턴스명 = new HashSet<자료형>();
 * 
 * <관련 메서드>
 * add(자료) -> 자료구조에 자료를 추가한다. (중복된 자료가 있을시 false를 리턴)
 * remove(자료) -> 해당 key에 대한 자료를 삭제한다. (성공시 true를 리턴)
 * size() -> 현재 Set의 크기를 반환한다. length와 동일한 기능
 * toArray() -> Object 타입의 배열로 자료를 리턴한다 (캐스팅하여 사용해야한다.)
 * isEmpty() -> 해당 Set이 비어있는지 체크한다. (boolean 리턴)
 * 
 * 
 * */
public class Exam_04 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		boolean successAdd = set.add(1);
		System.out.println("add(1) = " + successAdd); // true
		
		boolean successAdd2 = set.add(1);
		System.out.println("add(1) = " + successAdd2); // false
		
		System.out.println("size = " + set.size()); // 1
		
		set.add(2);
		set.add(3);
		set.add(4);
		
		Object[] values = set.toArray();
		for(int i = 0; i < values.length; i++) {
			System.out.println((Integer)values[i]);
		}
		
		boolean isRemoved = set.remove(20);
		System.out.println("20삭제 = " + isRemoved);
		
		// Iterator
		Iterator<Integer> itr = set.iterator();
		
		// JS => for (인스턴스명 in 배열이름) {}
		while(itr.hasNext()) {
			System.out.println("이터레이터 반복 = " + itr.next());
		}
	}
}
