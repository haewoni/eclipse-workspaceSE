package paint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	
	public PaintFrame() {
		setSize(300, 400);
		setVisible(true);
	}
	/*
	 * public void paint(Graphics g_
	 *   - Paints this component.
	 *   - This method is called when the contents of the component should be painted; 
	 *   - such as when the component is first being shown or is damaged and in need of repair. 
	 */
	
	@Override
	public void paint(Graphics g) {
		/*
		 *  Subclasses of Component that override this method need not call super.paint(g).
		 */
		super.paint(g);
		//System.out.println("paint thread:"+Thread.currentThread().getName());
		/*
		 * <<Graphics>>
		 *  -컴포넌트에 그릴 수 있는 펜 객체
		 */
		/*
		 * 1.문자
		 */
		g.drawString("안녕 페인트!!", 80, 50);
		/*
		 * 2. 라인, 사각형,원,
		 */
		g.setColor(Color.blue);
		g.drawLine(0, 80 , this.getWidth() , 80);
		g.drawRect(20, 90, 50, 50);
		g.setColor(Color.PINK);
		g.fillRect(20, 150, 50, 50);
		
		g.drawOval(20,210,50,50);
		g.setColor(Color.RED);
		g.fillOval(20,270,50,50);
		

	}
	
	
	
	
	

	public static void main(String[] args) {
		new PaintFrame();
		

	}

}
