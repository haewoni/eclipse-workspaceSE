package wb.basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ChildFrame extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildFrame frame = new ChildFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChildFrame() {
		setTitle("상속에 의한 프레임 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("확인");
		btn1.setBounds(24, 132, 97, 37);
		contentPane.add(btn1);
		
		btn2 = new JButton(" ");
		btn2.setBounds(155, 132, 97, 37);
		contentPane.add(btn2);
	}
}
