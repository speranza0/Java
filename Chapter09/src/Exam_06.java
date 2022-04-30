/*
 * 기존의 String이 불변의 속성을 가진 객체이기 때문에 한계가 있다.
 * 따라서 유사 배열처럼 사용할 수 있는 가변의 String Builder, String Buffer가 있다.
 * 
 * String		: 문자열 연산이 적고 멀티쓰레드 환경일 경우
 * StringBuffer : 문자열 연산이 많고 멀티쓰레드 환경일 경우
 * StringBuilder: 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
 *  
 * */
public class Exam_06 {
	public static void main(String[] args) {
		StringBuffer sbuf = new StringBuffer("a");
		System.out.println(sbuf);
		
		sbuf.append("b");
		sbuf.append("c");
		sbuf.append("d");
		
		System.out.println(sbuf);
		
		sbuf.delete(0, 1);
		System.out.println(sbuf); // bcd
		System.out.println(sbuf.length()); // 3
		
		int[] score = {40, 50, 60};
		
		/*
		 * <ul>
		 *  <li>40</li>
		 *  <li>50</li>
		 *  <li>60</li>
		 * </ul>
		 * */
		
		String markup1 = "<ul><li>" + score[0] + "</li><li>" + score[1] + "</li><li>" + score[2] + "</li></ul>";
		
		StringBuffer markup2 = new StringBuffer();
		markup2.append("<ul>");
		for(int i = 0; i < score.length; i++) {
			markup2.append("<li>");
			markup2.append(score[i]);
			markup2.append("</li>");
		}
		markup2.append("</ul>");
		
		System.out.println(markup1);
		System.out.println(markup2);
	}
}
