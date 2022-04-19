/*
 * 자동차를 객체로 만들어보자!
 * 
 * 차를 파는 행위를 만들고 새로운 소유주를 등록하게끔 구현하시오.
 * */
class Car {
	// 멤버필드(클래스변수)
	String owner;
	int speed;
	int fuel;
	
	static final int MAX = 200;
	static final int STEP = 10;
	static final int FUEL_STEP = 2;
	
	// 생성자 메서드
	public Car() {} // 디폴트 생성자
	
	// 멤버필드를 초기화 시킬 목적으로 구현된 메서드이다.
	public Car(String owner, int speed, int fuel) {
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
	}
	// 멤버 메서드
	public void carAccel() { // 악셀을 밟은 행위
		/*
		 * 현재 연료의 상태를 파악한 후 자동차의 속도를 증가시킨다.
		 * 단, 현재속도와 증가할 속도의 합이 최고속도를 능가할 수 없다.
		 * */
		// 연료 부족상태
		if(fuel < FUEL_STEP) {
			return;
		} else {
			fuel -= FUEL_STEP;
			if(speed + STEP >= MAX) {
				speed = MAX;
			} else {
				speed += STEP;
			}
		}
	}
	
	public void carBreak() { //브레이크 밟는 행위
		if(speed < STEP) {
			speed = 0;
		} else {
			speed -= STEP;
		}
	}
	
	void showOwner() {
		System.out.println("소유주 = " + owner);
	}
	void showCar() { // 현재 자동차의 상태를 보여준다 계기판
		System.out.println("현재속도 = " + speed);
		System.out.println("남은연료 = " + fuel);
	}
	
	void sellCar(String owner) {
		this.owner = owner;
	}
	// (중첩 클래스)
}
public class Exam_09 {
	public static void main(String[] args) {
		Car sonata = new Car("강씨", 0, 70);
		
		sonata.showOwner(); // 강씨
		sonata.carAccel();
		sonata.carAccel();
		sonata.carAccel();
		sonata.showCar(); // 속도와 연료
		System.out.println();
		
		Car avante = new Car("박씨", 0, 95);
		
		avante.showOwner();
		avante.carAccel();
		avante.carAccel();
		avante.showCar();
		
		avante.sellCar("김씨");
		avante.showOwner();
	}
}
