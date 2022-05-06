package sm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import sm.dto.ScoreDTO;
import sm.dto.StudentDTO;
import sm.service.Service;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Service service = new Service();
		
		while(true) {
			System.out.println("====< 학생정보관리 프로그램 >====");
			System.out.println("1. 학생정보 관리");
			System.out.println("2. 성적정보 관리");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 = ");
			int mainMenu = Integer.parseInt(in.readLine());
			
			switch(mainMenu) {
			case 1:
				System.out.println("====< 학생정보 관리 >====");
				System.out.println("1. 학생정보 입력");
				System.out.println("2. 학생정보 조회(전체 출력)");
				System.out.println("3. 학생정보 검색");
				System.out.println("4. 학생정보 변경");
				System.out.println("5. 학생정보 삭제");
				System.out.println("6. 첫화면으로");
				System.out.print("선택 = ");
				int searchMenu1 = Integer.parseInt(in.readLine());
				
				switch(searchMenu1) {
				case 1:
					System.out.println("====< 학생정보 입력 >====");
					System.out.print("이름 = ");
					String studentName = in.readLine();
					System.out.print("학년 = ");
					int studentClass = Integer.parseInt(in.readLine());
					
					String studentBirth;
					do {
						System.out.print("생년월일 = ");
						studentBirth = in.readLine();
					} while(Integer.parseInt(studentBirth) < 10000000 || Integer.parseInt(studentBirth) > 99999999);
					StudentDTO dto = service.createStudent(studentName, studentClass, studentBirth);
					
					System.out.println(studentName + "(" + dto.getStudentNum() + ") 학생 정보가 등록되었습니다.");
					break;
				case 2:
					List<StudentDTO> studentList = service.selectAll();
					System.out.println("====< 학생정보 조회 >====");
					System.out.println("학번\t이름\t학년\t생년월일\t나이");
					for(int i = 0; i < studentList.size(); i++) {
						System.out.print(studentList.get(i).getStudentNum() + "\t");
						System.out.print(studentList.get(i).getStudentName() + "\t");
						System.out.print(studentList.get(i).getStudentClass() + "\t");
						System.out.print(studentList.get(i).getStudentBirth() + "\t");
						System.out.println(studentList.get(i).getStudentAge());
					}
					break;
				case 3:
					System.out.println("====< 학생정보 검색 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int searchNum = Integer.parseInt(in.readLine());
					StudentDTO search = service.selectOneStudent(searchNum);
					
					try {
						if(search.getStudentNum() != searchNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.println("이름 = " + search.getStudentName());
							System.out.println("학년 = " + search.getStudentClass());
							System.out.println("생년월일 = " + search.getStudentBirth());
							System.out.println("나이 = " + search.getStudentAge());
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 4:
					System.out.println("====< 학생정보 변경 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int updateNum = Integer.parseInt(in.readLine());
					System.out.println();
					StudentDTO update = service.selectOneStudent(updateNum);
					
					try {
						if(update.getStudentNum() != updateNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.print("이름(" + update.getStudentName() + ") = ");
							String newName = in.readLine();
							System.out.print("학년(" + update.getStudentClass() + ") = ");
							int newClass = Integer.parseInt(in.readLine());
							System.out.print("생년월일(" + update.getStudentBirth() + ") = ");
							String newBirth = in.readLine();
							System.out.println();
							
							service.updateOneStudent(updateNum, newName, newClass, newBirth);
							System.out.println(newName + "(" + updateNum + ")" + "학생의 정보가 변경되었습니다.");
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 5:
					System.out.println("====< 학생정보 삭제 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int removeNum = Integer.parseInt(in.readLine());
					System.out.println();
					StudentDTO remove = service.selectOneStudent(removeNum);
					try {
						if(remove.getStudentNum() != removeNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.print(remove.getStudentName() + "(" + remove.getStudentNum() + ") 정보를 삭제하시겠습니까 (Y,N) =");
							String yesorno = in.readLine();
							if(yesorno.equals("Y")) {
								service.removeOneStudent(removeNum);
								System.out.println(remove.getStudentName() + "(" + remove.getStudentNum() + ") 학생 정보가 삭제되었습니다.");
							} else {
								System.out.println("삭제를 취소했습니다. 돌아갑니다.");
							}
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 6:
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("====< 성적정보 관리 >====");
				System.out.println("1. 성적정보 등록");
				System.out.println("2. 성적정보 검색");
				System.out.println("3. 성적정보 변경");
				System.out.println("4. 성적정보 삭제");
				System.out.println("5. 첫화면으로");
				System.out.print("선택 = ");
				int searchMenu2 = Integer.parseInt(in.readLine());
				
				switch(searchMenu2) {
				case 1:
					System.out.println("====< 성적정보 등록 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int scoreCreateNum = Integer.parseInt(in.readLine());
					StudentDTO searchStudent = service.selectOneStudent(scoreCreateNum);
					try {
						if(searchStudent.getStudentNum() != scoreCreateNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.println(searchStudent.getStudentName() + "(" + scoreCreateNum + ") 학생의 성적 입력");
							
							int kor = 0;
							do {
								System.out.print("국어 = ");
								kor = Integer.parseInt(in.readLine());
							} while(kor < 0 || kor > 100);
							
							int math = 0;
							do {
								System.out.print("수학 = ");
								math = Integer.parseInt(in.readLine());
							} while(math < 0 || math > 100);
							
							int eng = 0;
							do {
								System.out.print("영어 = ");
								eng = Integer.parseInt(in.readLine());
							} while(eng < 0 || eng > 100);
							ScoreDTO scoreCreate = service.createScore(searchStudent.getStudentNum(), searchStudent.getStudentName(), kor, math, eng);
							System.out.println(scoreCreate.getStudentName() + "(" + scoreCreate.getStudentNum() + ") 학생의 성적이 등록되었습니다.");							
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 2:
					System.out.println("====< 성적정보 검색 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int scoreSearchNum = Integer.parseInt(in.readLine());
					ScoreDTO search = service.selectScore(scoreSearchNum);
					
					try {
						if(search.getStudentNum() != scoreSearchNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.println(search.getStudentName() + "(" + scoreSearchNum + ") 학생의 성적");
							System.out.println("국어 = " + search.getKor());
							System.out.println("수학 = " + search.getMath());
							System.out.println("영어 = " + search.getEng());
							System.out.println("총점 = " + search.getSum());
							System.out.println("평균 = " + search.getAvg());						
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 3:
					System.out.println("====< 성적정보 변경 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int scoreUpdateNum = Integer.parseInt(in.readLine());
					System.out.println();
					ScoreDTO update = service.selectScore(scoreUpdateNum);
					try {
						if(update.getStudentNum() != scoreUpdateNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.println(update.getStudentName() + "(" + scoreUpdateNum + ") 학생의 성적");
							
							int newkor = 0;
							do {
								System.out.print("국어(" + update.getKor() + ") = ");
								newkor = Integer.parseInt(in.readLine());
							} while(newkor < 0 || newkor > 100);
							
							int newMath = 0;
							do {
								System.out.print("수학(" + update.getMath() + ") = ");
								newMath = Integer.parseInt(in.readLine());
							} while(newMath < 0 || newMath > 100);
							
							int newEng = 0;
							do {
								System.out.print("영어(" + update.getEng() + ") = ");
								newEng = Integer.parseInt(in.readLine());
							} while(newEng < 0 || newEng > 100);
							System.out.println();
							
							service.updateScore(update.getStudentNum(), update.getStudentName(), newkor, newMath, newEng);
							System.out.println(update.getStudentName() + "(" + scoreUpdateNum + ")" + "학생의 정보가 변경되었습니다.");
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					
					break;
				case 4:
					System.out.println("====< 성적정보 삭제 >====");
					System.out.println("학번을 입력하세요.");
					System.out.print("학번 = ");
					int removeScoreNum = Integer.parseInt(in.readLine());
					System.out.println();
					ScoreDTO remove = service.selectScore(removeScoreNum);
					try {
						if(remove.getStudentNum() != removeScoreNum) {
							System.out.println("학번이 올바르지 않습니다.");
						} else {
							System.out.print(remove.getStudentName() + "(" + remove.getStudentNum() + ") 성적 정보를 삭제하시겠습니까 (Y,N) =");
							String yesorno = in.readLine();
							if(yesorno.equals("Y")) {
								service.removeScore(remove.getStudentNum(), remove.getStudentName());
								System.out.println(remove.getStudentName() + "(" + remove.getStudentNum() + ") 학생 성적 정보가 삭제되었습니다.");
							} else {
								System.out.println("삭제를 취소했습니다. 돌아갑니다.");
							}
						}
					} catch(NullPointerException e) {
						System.out.println("등록된 학번이 아닙니다.");
					}
					break;
				case 5:
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}
}
