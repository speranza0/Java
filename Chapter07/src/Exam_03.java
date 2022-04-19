/*
 * 접근지정자(접근제한자): 클래스 내부의 멤버에 대한 접근을 제한하는 기능을 가진 키워드
 * 1. private: 전용, 클래스 밖에서 접근을 허용하지 않을때
 * 2. protected: 상속, 같은 클래스, 같은 패키지에서 접근 허용
 * 3. public: 공용, 객체만 가지고 있다면 어디서든 접근 허용
 * 
 * 캡슐화
 * 멤버필드의 접근제한자는 private
 * 멤버메서드의 접근제한자는 public
 * 
 * */
class Point {
	private int x;
	private int y;
	
	// 멤버필드를 초기화 시켜주는 역할을 수행한다.
	Point() {
		x = 0;
		y = 0;
	}
	
	// 오버로딩
	Point(int x) {
		this.x = x;
		y = 0;
	}
	
	// 오버로딩
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 멤버 메서드
	void setX(int x) {
		this.x = x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	int getX() {
		return this.x;
	}
	int getY() {
		return this.y;
	}
	
	public void display() {
		System.out.println("점(x, y) = (" + x + " , " + y + ")");
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Point point = new Point();
		
		point.display();
	}
}
