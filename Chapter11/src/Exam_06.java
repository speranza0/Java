import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 문자열을 입력받아 ArrayList에 저장한 후 가장 긴 문자열을 출력하는 프로그램을 구현해보자.
 * 5개 입력받자
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("이름 = ");
			String name = sc.nextLine();
			names.add(name);
		}
		
		int max = 0; // 가장 큰 이름이 첫번째 인덱스에 들어왔다 라고 가정
		
		for(int i = 1; i < names.size(); i++) {
			if(names.get(max).length() <= names.get(i).length()) {
				max = i;
			}
		}
		System.out.println("가장 긴 이름은 = " + names.get(max));
		
		sc.close();
	}
}
