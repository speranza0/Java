import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * HashMap
 * key-value의 한쌍이며 key는 중복될 수 없다. value는 중복 가능
 * 
 * <선언 및 초기화>
 * HashMap<key자료형, 자료형> 인스턴스명 = new HashMap<key자료형, 자료형>();
 * Map<key자료형, 자료형> 인스턴스명 = new HashMap<key자료형, 자료형>();
 * 
 * <관련 메서드>
 * put(key, value) -> 자료구조에 자료를 추가한다.
 * size() -> 현재 맵의 크기를 반환한다. length와 동일한 기능
 * get(key) -> 해당 key에 대한 자료를 가져온다.
 * remove(key) -> 해당 key에 대한 자료를 삭제한다(key도 삭제된다)
 * containsKey(key) -> 현재 맵에 해당 키가 있는지 확인(boolean 리턴)
 * isEmpty() -> 해당 맵이 비어있는지 체크(boolean 리턴)
 * keySet() -> 해당 맵의 key값을 Set으로 리턴한다.
 * values() -> 해당 맵의 values값을 Collection으로 리턴한다.
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		
		map.put("사과", 2000);
		map.put("딸기", 5000);
		map.put("수박", 15000);
		
		int apple = map.get("사과");
		System.out.println("사과 = " + apple);
		
		System.out.println("map의 크기 = " + map.size());
		
		boolean isBanana = map.containsKey("바나나");
		System.out.println("바나나는 있는가? = " + isBanana);
		
		boolean isMap2Empty = map2.isEmpty();
		System.out.println("map2가 비어있는가? = " + isMap2Empty);
		
		Set<String> keys = map.keySet();
		Object[] ary = keys.toArray();
		
		System.out.println("==== keys ====");
		for(int i = 0; i < ary.length; i++) {
			System.out.println((String)ary[i]);
		}
		
		map.remove("수박");
		
		// int 타입은 primitive 타입이기 때문에 null 값을 가질 수 없다.
		// 따라서 래핑클래스를 사용해야 한다.
		Integer watermelon = map.get("수박");
		System.out.println("수박 = " + watermelon);
		
		List<Integer> valueList = new ArrayList<Integer>(map.values());
		
		System.out.println("==== values ====");
		for(int i = 0; i < valueList.size(); i++) {
			System.out.println(valueList.get(i));
		}
	}
}
