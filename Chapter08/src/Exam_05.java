/*
 * 의도적 예외 발생
 * 코드내부에서 해당 상황을 예외로 판단하고 명시적으로 예외를 발생시키는 경우
 * Ex. 유효성검사
 * 
 * <예외 발생 형태>
 * 예외타입 예외_인스턴스_명 = new 예외타입생성자(에러 메시지);
 * 
 * <전가>
 * throw 예외_인스턴스명;
 * 
 * <생성하자마자 전가>
 * throw new 예외타입생성자(에러 메시지);
 * 
 * <시스템에 전가>
 * 예외가 발생했음을 시스템에게 알린다.
 * throws 예외_인스턴스명;
 * 
 * <합쳐서 사용>
 * 
 * */
public class Exam_05 {
	public static void main(String[] args) throws Exception { // 책임을 전가한다. 프레임워크에서 처리 플로우를 위임할 수 있다.
		Exception e = new Exception("예외를 발생시켰습니다.");
		throw e;
		
		// throw new Exception("예외를 발생시켰습니다.");
	}
}
