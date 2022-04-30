/*
 * String 클래스의 유용한 메서드
 * chatAt => 지정된 index의 문자를 char타입으로 리턴
 * contains => 문자열이 포함되어 있는지 검사한다.
 * equals => 문자열이 일치하는지 체크한다.(대소문자 구분)
 * equalsIgnoreCase => 대소문자 구분하지 않고 문자열이 일치하는지를 체크한다.
 * indexOf => 주어진 문자가 문자열에 존재하는지 체크하여 index를 알려주고 없다면 -1을 리턴한다.
 * length => 문자열의 길이를 리턴해준다.
 * replace => 문자열 중의 문자(정규표현식에 일치)를 새로운 문자열로 변환한다.
 * split => 문자열을 지정된 분리자(구분자)로 나누어 문자열 배열에 담아 변환한다.
 * substring => 주어진 시작위치부터 끝 위치 범위에 포함된 문자열을 추출한다.
 * toLowerCase => 모든 문자열을 소문자로 변환한다.
 * toUpperCase => 모든 문자열을 대문자로 변환한다.
 * trim => 문자열의 왼쪽 끝과 오른쪽 끝의 공백문자를 제거한다.(문자열 중간의 공백은 제거되지 않는다)
 * 
 * */
public class Exam_05 {
	public static void main(String[] args) {
		String abc = "abcdefghijk";
		String ABC = "ABCDEFGHIJK";
		String space = "    A B C    ";
		String comma = "a,b,c,d,e,f,g";
		
		System.out.println(abc.charAt(1)); // b
		System.out.println(abc.contains("abc")); // true
		System.out.println(abc.contains("ABC")); // false
		
		System.out.println(abc.equals("ABCDEFGHIJK")); // false
		System.out.println(abc.equalsIgnoreCase("ABCDEFGHIJK")); // true
		System.out.println(abc.indexOf("f")); // 5
		
		System.out.println(abc.length()); // 11
		System.out.println();
		
		System.out.println(abc.replace("abc", "cba")); // cbadefghijk
		System.out.println(abc); // abcdefghijk
		
		String[] strs = comma.split(","); //
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		System.out.println(abc.substring(3)); // defghijk
		System.out.println(abc.substring(2,6)); // cdef
		
		System.out.println(abc.equals(ABC.toLowerCase())); // true
		System.out.println(space.trim()); // A B C
		
	}
}
