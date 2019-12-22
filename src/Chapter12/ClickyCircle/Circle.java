package Chapter12.ClickyCircle;

import java.awt.*;
import javax.swing.*;

public class Circle extends JPanel{

	private static final long serialVersionUID = 6192686769679528986L;
	private static int r = (int) (Math.random() * 255);
	private static int gr = (int) (Math.random() * 255);
	private static int b = (int) (Math.random() * 255);
	
	public static void randomizeColors() {
		r = (int) (Math.random() * 255);
		gr = (int) (Math.random() * 255);
		b = (int) (Math.random() * 255);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		Color randomColor = new Color(r, gr, b);
		randomizeColors();
		Color randomColor2 = new Color(r, gr, b);
		
		GradientPaint gradient = new GradientPaint(70, 70, randomColor, 150, 150, randomColor2);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
	}
	
}
