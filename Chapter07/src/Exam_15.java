
interface InterfaseA {
	public abstract void show();
	
	default void show2() {
		// 자바 8에서 지원하며 인터페이스가 default 키워드로 선언되면 메소드 구현이 가능하다.
	}
}

abstract class AbstractClassA {
	abstract void display();
}

class classA extends AbstractClassA implements InterfaseA{

	@Override
	void display() {
		
	}

	@Override
	public void show() {
		
	}
	
}

public class Exam_15 {

}
