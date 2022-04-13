/*
 * 반복문
 *   - for, 다중for문
 *   - while
 *   - do~while
 *   
 * for문
 * 반복횟수를 통해 문장을 제어한다.
 * 
 * for(초기식구문; 조건(최종)식구문; 증감식구문;) {
 * 반복할 문장;
 * }
 * */
public class Exam_05 {
	public static void main(String[] args) {
		
		/*
		 * #
		 * ##
		 * ###
		 * ####
		 * #####
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1 ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
