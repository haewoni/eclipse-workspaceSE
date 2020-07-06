package basic;
/*
 * GUI 프로그램의 방법
 * 1. 컨테이너 클래스 준비(JFrame) 상속
 * 2. 컨테이너 클래스 객체 생성
 * 3. 컨테이너 객체의 크기 설정
 * 4. 컴포넌트 생성(컨테이너의 멤버변수)
 * 5. 컨테이너에 컴포넌트 붙이기(add)
 * 6. 컨테이너 객체 보여주기
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChildJFrame extends JFrame {
	private JButton btn1;
	private JButton btn2;

	public ChildJFrame() {
		System.out.println(">>>" + Thread.currentThread().getName() + "스레드");

		this.setTitle("상속에 의한 JFrame준비");
		Container contentPane = this.getContentPane();
		contentPane.setBackground(new Color(125, 125, 0));
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setSize(300, 400);
		
		contentPane.setLayout(null);

		// 4. 컴포넌트 생성(컨테이너의 멤버변수)
		btn1 = new JButton("확인");
		btn2 = new JButton("취소");
		
		btn1.setBounds(40,40,80,40);
		btn2.setBounds(130, 40, 80, 40);
		//5. 컨테이너에 컴포넌트 붙이기(add)
		contentPane.add(btn1);
		contentPane.add(btn2);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		ChildJFrame f = new ChildJFrame(); // 메인은 생성자만 호출
		/*
		 * 
		 * f.setTitle("상속에 의한 JFrame준비"); f.getContentPane().setBackground(new
		 * Color(125,125,0)); f.setSize(300, 400); f.setVisible(true);
		 */

	}

}
