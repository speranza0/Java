/*
 * 형변환(캐스팅)
 * 자료형 변환의 줄임말
 * 다른 자료형간의 변환
 * 
 * 업캐스팅 / 다운캐스팅
 * 
 * 자료형의 크기를 부등호로 순서지어 나열해보면
 * byte < short < int < long < float < double < String
 * */
public class Exam_03 {
	public static void main(String[] args) {
		float ff = 1;
		System.out.println(ff); // 1.0
		
		int ii = (int)ff;
		System.out.println(ii); // 1
		
		int x = 130;
		long y = x; // promotion(자동형변환)
		byte z = (byte)x; // 자료의 손실이 발생한다.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		byte c = 65;
		short d = c;
		char e = (char)c; // 아스키 코드로 되버림
		
		System.out.println(e); // A
		
		long f = 100L;
		float g = f; // 업캐스팅
		
		System.out.println(g); // 100.0 실수부가 생긴다.
		
		float h = 3.14f;
		
		long i = (long)h; // 다운캐스팅
		
		System.out.println(i); // 3 실수부 자료 손실
	}
}
