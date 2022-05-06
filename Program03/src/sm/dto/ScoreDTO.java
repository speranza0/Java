package sm.dto;

public class ScoreDTO extends StudentDTO{
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private float avg;
	
	public ScoreDTO(int studentNum, String studentName, int kor, int math, int eng) {
		super(studentNum, studentName);
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = kor + math + eng;
		this.avg = sum / 3.00f;
	}
	
	public ScoreDTO(int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = kor + math + eng;
		this.avg = sum / 3.00f;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
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
