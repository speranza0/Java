/*
 * while 문
 * 횟수제어보다는 사용자의 행위로 제어한다. (반복 횟수가 명확하지 않은 경우)
 * 반복을 수행하는데 무한루프에서 사용자의 어떤 행위에 의해 반복을 멈추고 싶을때
 * while(논리조건문) {
 *   반복할 문장;
 * }
 * 
 * 
 * */
public class Exam_09 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println("너무 졸리다!");
			i++;
		}
	}
}
