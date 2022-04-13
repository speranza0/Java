/*
 * 쉬프트 연산 : 산술적인 계산과 논리적인 계산(단순히 자료를 이동하는 역할)
 * [1/0][1/0][1/0][1/0] 4비트
 * 
 * Left Shift : 좌측이동 => 곱하기
 * Right Shift : 우측이동 => 나누기
 * 
 * */
public class Exam_05 {
	public static void main(String[] args) {
		int x = 1 << 3; // 1은 2진법으로 0001인데 => 1을 좌측으로 3칸 이동해서 1000이니 이건 10진법으로 8
		int y = 8 << 3; // 8은 2진법으로 1000인데 => 1을 우측으로 3칸 이동해서 0001이니 이건 10진법으로 1
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
