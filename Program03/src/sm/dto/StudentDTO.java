package sm.dto;

public class StudentDTO {
	private int studentNum;
	private String studentName;
	private int studentClass;
	private int studentBirth;
	private ScoreDTO score;
	
	public StudentDTO() {
		
	}
	
	public StudentDTO(String studentName, int studentClass, int studentBirth) {
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentBirth = studentBirth;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return studentName;
	}

	public void setName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getBirth() {
		return studentBirth;
	}

	public void setBirth(int studentBirth) {
		this.studentBirth = studentBirth;
	}
	
	
	public ScoreDTO getScore() {
		return score;
	}

	public void setScore(ScoreDTO score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentNum=" + studentNum + ", studentName=" + studentName + ", studentClass="
				+ studentClass + ", studentBirth=" + studentBirth + "]";
	}
	
	
}
