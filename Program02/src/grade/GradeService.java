package grade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
 * 비지니스 로직
 * 1. 메뉴를 관리하는 메서드
 * 2. 학생 등록
 * 3. 전체 성적 조회 
 * */
public class GradeService {
	// 멤버 필드
	// 객체 배열
	GradeRepository gradeRepository = new GradeRepository();
	List<Student> studentList;
	
	// 학생의 ID값 자동증가 하게끔(인덱스) = 학번
	// int studentIdx;
	
	// 입력을 위한 객체
	static BufferedReader in;
	
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// 생성자 메서드
	/*
	public GradeService() {
		studentList = new ArrayList<Student>();
		studentIdx = 0;
	}
	*/
	
	// 멤버 메서드
	// 메뉴를 관리하는 메서드
	public void showMenu() {
		System.out.println("==== Student System ====");
		System.out.println("1. 학생 등록");
		System.out.println("2. 전체 성적 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("========================");
	}
	
	// 학생 등록 메서드
	public void addStudent() throws IOException {
		System.out.println("\n==== 학생 등록 ====");
		System.out.print("이름 = ");
		String name = in.readLine();
		
		int kor = 0;
		do {
			System.out.print("국어 = ");
			kor = Integer.parseInt(in.readLine());
		} while(kor < 0 || kor > 100);
		
		int eng = 0;
		do {
			System.out.print("영어 = ");
			eng = Integer.parseInt(in.readLine());
		} while(eng < 0 || eng > 100);
		
		int math = 0;
		do {
			System.out.print("수학 = ");
			math = Integer.parseInt(in.readLine());
		} while(math < 0 || math > 100);
		
		// 입력받은 값들을 이용하여 객체를 생성
		Student student = new Student(name, kor, eng, math);
		
		// 객체를 객체배열에 담는다.
		// studentList.add(student);
		gradeRepository.createOne(student);
		// 인덱스 값을 증가시킨다.
		// studentIdx++;
		
		// 학생 등록 완료 메시지
		System.out.println(name + " 학생 성적이 등록되었습니다.");
	}
	
	// 전체 성적 조회
	public void showAllStudent() {
		System.out.println("\n==== 전체 성적 조회 ====");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
		List<Student> studentList = gradeRepository.selectAll();
		
		for(int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			System.out.print(student.getIdx() + "\t");
			System.out.print(student.getName() + "\t");
			System.out.print(student.getKor() + "\t");
			System.out.print(student.getEng() + "\t");
			System.out.print(student.getMath() + "\t");
			System.out.print(student.getSum() + "\t");
			System.out.printf("%.2f", student.getAvg());
			System.out.print("\n");
		}
	}
}
