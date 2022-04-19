import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 중첩 클래스 예시
 * JFrame => 자바의 스윙컴포넌트(자바 응용프로그램)
 * 
 * 웹개발에서 사용하지 않는다.
 * 중첩 클래스 예시로만 확인
 * 
 * 추후에 배울 상속에 대한 개념도 포함되어있음.
 * 
 * */

class MyFrame extends JFrame {
	// 멤버필드(클래스변수)
	JButton btn = new JButton("닫기");
	
	public MyFrame() {
		setTitle("자바프레임");
		setSize(300, 200);
		
		setLayout(new FlowLayout());
		btn.addActionListener(new ActionListener() { // 지역 중첩 클래스 + 익명중첩 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		add(btn);
		setResizable(false);
		setVisible(true);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
