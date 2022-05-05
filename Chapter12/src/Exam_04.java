import java.util.ArrayList;
import java.util.List;

/*
 * 제네릭 와일드 카드
 * 
 * ?
 * */

class Car {
	private int fuel;

	public Car(int fuel) {
		super();
		this.fuel = fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + "]";
	}
	
}

class Child extends Human {
	private boolean cute;
	
	public Child(String name, int age, boolean cute) {
		super(name, age);
		this.cute = cute;
	}

	public boolean isCute() {
		return cute;
	}

	public void setCute(boolean cute) {
		this.cute = cute;
	}
}

class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Exam_04 {
	public static void main(String[] args) {
		List<Human> list = new ArrayList<Human>();
		Human human1 = new Human("홍길동", 25);
		Human human2 = new Human("이순신", 35);
		Human human3 = new Human("장보고", 60);
		
		list.add(human1);
		list.add(human2);
		list.add(human3);
		
		printAll(list);
		
		List<Car> list2 = new ArrayList<Car>();
		list2.add(new Car(200));
		list2.add(new Car(10));
		
		// printAll(list2);
		
	}
	
	static void printAll(List<? extends Human> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
