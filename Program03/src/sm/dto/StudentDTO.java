package sm.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentDTO {
	private int studentNum;
	private String studentName;
	private int studentClass;
	private String studentBirth;
	private int studentAge;
	private ScoreDTO score;
	
	public StudentDTO(String studentName, int studentClass, String studentBirth) {
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(String studentBirth) {
		this.studentBirth = studentBirth;
	}
	
	
	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public ScoreDTO getScore() {
		return score;
	}

	public void setScore(ScoreDTO score) {
		this.score = score;
	}

	public String calStudentAge() {
		// 나이 계산해서 생성
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate dateTime = LocalDate.parse(studentBirth, dtf);
		int studentAge = date.compareTo(dateTime);
		return String.valueOf(studentAge);
	}
	
	
}
