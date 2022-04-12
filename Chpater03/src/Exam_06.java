import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3항연산자 : 항을 세 개 가지고 있는 연산자, if제어문의 모체가 된다.
 * 
 * 형식
 * 조건항 ? 항1 : 항2;
 * 
 * 또는
 * 변수 = 조건항 ? 항1 : 항2;
 * 
 * 참이면 1항
 * 거짓이면 2항
 * 처리
 * 
 * 하나의 숫자를 입력받아 양수임을 확인하시오.
 * 
 * */
public class Exam_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String str = "";
		
		System.out.print("숫자를 입력하세요 = ");
		num = Integer.parseInt(in.readLine());
		
		str = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
		
		System.out.println("입력하신 숫자" + num + "은 " + str + "입니다.");
	}
}
