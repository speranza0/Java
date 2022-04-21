package grade;

public class Student {
	// 멤버필드(클래스 변수)
	private int idx;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	
	// 생성자 메서드
	public Student() {}
	
	public Student(int idx, String name, int kor, int eng, int math) {
		this.idx = idx;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum / 3.0f; 
	}

	// 멤버 메서드
	// getter, setter
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
}
