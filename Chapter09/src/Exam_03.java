/*
 * 깊은복사는 주소값을 참조하는 것이 아닌 새로운 메모리 공간에 값을 복사하는 것이기때문에 
 * 원본 배열이 변경되어도 복사된 배열에 전혀 상관이 없다.
 * 따라서 배열을 복사한 후에 한쪽 값을 수정해도 다른 배열에 영향을 끼치지 않는다.
 * 
 * */
public class Exam_03 {
	public static void main(String[] args) {
		int[] source = {5,6,7,8,9,0};
		int[] target = source.clone();
		
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
