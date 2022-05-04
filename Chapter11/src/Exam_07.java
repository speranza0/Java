import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 영어 단어와 한글 단어를 쌍으로 저장하는 HashMap을 만들어서 사용자가 입력한
 * 단어의 뜻을 출력하는 프로그램을 작성해보자
 * */
public class Exam_07 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<String, String>();
		
		dic.put("apple", "사과");
		dic.put("candy", "사탕");
		dic.put("love", "사랑");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영단어 = ");
		String word = sc.nextLine();
		
//		if(dic.containsKey(word)) {
//			System.out.println(dic.get(word));
//		} else {
//			System.out.println("사전에 등록된 단어가 아닙니다.");
//		}
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		boolean hasKey = false;
		
		while(it.hasNext()) {
			String key = it.next();
			if(word.equals(key)) {
				System.out.println(dic.get(key));
				hasKey = true;
				break;
			}
		}
		
		if(!hasKey) {
			System.out.println("사전에 등록된 단어가 아닙니다.");
		}
		
		sc.close();
	}
}
