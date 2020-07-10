package thread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;

public class ClockFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockFrame frame = new ClockFrame();
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
	public ClockFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		clockL = new JLabel("            2020 10 20 ");
		clockL.setToolTipText("스레드 시계");
		clockL.setForeground(Color.RED);
		clockL.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		clockL.setHorizontalAlignment(SwingConstants.LEFT);
		clockL.setIcon(new ImageIcon("C:\\Users\\stu03\\Desktop\\w.png"));
		clockL.setLabelFor(this);
		contentPane.add(clockL, BorderLayout.CENTER);

		isPlay=true;
		clockThread = new ClockThread();
		clockThread.start();
	
		
	}//생성자 끝
	private boolean isPlay;
	private ClockThread clockThread;
	private JLabel clockL;
	/********************ClockThread[member inner class]******************/
	public class ClockThread extends Thread {
		@Override	
		public void run() {
				while(isPlay) { 
					
					try {
						Date now = new Date();
						String timeStr = now.toLocaleString();
						clockL.setText(timeStr);
						Thread.sleep(1000);
					} catch (InterruptedException e) {		
						e.printStackTrace();
					}
					
				}
			
		}
	}
	
	/***********************************************************************/

}
