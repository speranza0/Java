/*
 * 얕은복사가 주소값을 복사하기 때문에 주소로 값을 참조하여 값이 변경되면 해당 값을 참조하고 있는 
 * 배열들의 값이 변경된다.
 * 즉, 복사된 배열이나 원본 배열이 변경될 때 함께 변경된다. = 연산자는 얕은복사를 수행한다.
 * */
public class Exam_02 {
	public static void main(String[] args) {
		int[] source = {5,6,7,8,9,0};
		int[] target = source;
		
		System.out.println("source hashCode = " + source.hashCode());
		System.out.println("target hashCode = " + target.hashCode());
		
		target[0] = 1;
		target[1] = 29;
		
		for(int i = 0; i < source.length; i++) {
			System.out.println("source[" + i + "] = " + source[i]);
		}
		
		for(int i = 0; i < target.length; i++) {
			System.out.println("target[" + i + "] = " + target[i]);
		}
	}
}
