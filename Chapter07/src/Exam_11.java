/*
 * Interface : 인터페이스
 * 1. interface
 *   - abstract 클래스의 한 종류로 포함 멤버에 제약을 가지는 클래스
 *   - 다중상속이 가능한 유일한 클래스
 *   
 * 2. interface에 포함 가능한 멤버
 *   - public static final 멤버 필드
 *   - public abstract 멤버 메서드
 *   - public static inner 클래스
 *   - default 멤버 메서드 <- JAVA8 이상
 *   
 * 3. 상속관계
 *   - 키워드 implements
 *   - 클래스에서 클래스 상속 : extends
 *   - 인터페이스에서 인터페이스로 상속 : extends
 *   - 인터페이스에서 클래스로 상속 : implements
 *   - 클래스에서 인터페이스로 상속은 불가능하다.
 *   
 * */

interface HumanInterface {
	public static final String NAME = "HI";
	
	// 추상 메서드
	public void walk();
}

class Park implements HumanInterface {

	@Override
	public void walk() {
		// 어떻게 걷는지 Park 클래스만의 걷는 행동을 기술할 수 있다.
	}
}

interface A {}
interface B extends A {}
interface C {}
interface D extends A, C {}

class E {}
class F {}
class G extends E {}
class H extends F implements A {}
class I implements A, C {}

// interface J  extends E {}

public class Exam_11 {
	
}
