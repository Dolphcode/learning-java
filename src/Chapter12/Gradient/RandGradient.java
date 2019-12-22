package Chapter12.Gradient;

import java.awt.*;
import javax.swing.*;

public class RandGradient extends JPanel{
	
	private static final long serialVersionUID = -7813844514486950712L;

	public void paintComponent(Graphics g) {
		// Graphics can be cast to Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color startColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		
		// Set paint is a method of Graphics2D
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
	}
}
