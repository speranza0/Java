import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 다차원배열의 동적할당
 * 
 * */
public class Exam_08 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] apt = new int[2][];
		int room = 0;
		
		for(int i = 0; i < apt.length; i++) {
			System.out.print((i+1) + " 층 방의 갯수 = ");
			room = Integer.parseInt(in.readLine());
			
			apt[i] = new int[room];
		}
		
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				System.out.println("apt[" + i + "][" + j + "] = " + apt[i][j]);
			}
		}
	}
}
