package Chapter12.Image;

import java.awt.*;
import javax.swing.*;

public class Bunnyzilla extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image image = new ImageIcon("bunnyzilla.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
	
}
