import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 다음 주어진 프로그램이 동작하도록 구현하시오.
 * 점, 원, 사각형을 클래스로 구현하시오.
 * <입력 및 출력형식>
 * 도형(1.점 2.원 3.사각형 4.종료)
 * 선택 = 1
 * 
 * x = 5
 * y = 5
 * 점(x, y) = (5, 5)
 * 
 * 선택 = 2
 * r = 10
 * 지름 = 20
 * 
 * 선택 = 3
 * h = 7
 * w = 8
 * 넓이 = 56
 * 
 * 선택 = 4
 * 프로그램을 종료합니다.
 * */

class MyPoint {
	private int x;
	private int y;
	private BufferedReader in;
	
	public MyPoint() throws IOException {
		in  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
	}
	
	public void display() {
		System.out.println("점(x, y) = (" + x + ", " + y + ")");
	}
}

class MyCircle {
	private int r;
	private BufferedReader in;
	
	public MyCircle() throws IOException {
		in  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("r = ");
		r = Integer.parseInt(in.readLine());
	}
	
	public void display() {
		System.out.println("지름 = " + r*2);
	}
}

class MyRect{
	private int h;
	private int w;
	private BufferedReader in;
	
	public MyRect() throws IOException {
		in  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("h = ");
		h = Integer.parseInt(in.readLine());
		System.out.print("w = ");
		w = Integer.parseInt(in.readLine());
	}
	
	public void display() {
		System.out.println("넓이 = " + h*w);
	}
}

public class Exam_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		int select = 0;
		boolean isStop = false;
		
		do {
			System.out.print("도형(1.점 2.원 3.사각형 4.종료)\n선택 = ");
			select = Integer.parseInt(in.readLine());
			
			switch(select) {
				case 1:
					MyPoint mp = new MyPoint();
					mp.display();
					break;
				case 2:
					MyCircle mc = new MyCircle();
					mc.display();
					break;
				case 3:
					MyRect mr = new MyRect();
					mr.display();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					isStop = true;
					break;
				default:
					System.out.println("선택이 올바르지 않습니다.");
					break;
			}
			System.out.println();
		} while(!isStop);
	}
}
