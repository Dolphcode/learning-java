package Chapter12.Rectangle;

import java.awt.*;
import javax.swing.*;

public class RectWindow extends JPanel {
	
	public static void main(String[] args) {
		
		RectWindow bw = new RectWindow();
		bw.go();
		
	}
	
	// A listener is one that listens for events
	public void go() {
		JFrame frame = new JFrame(); // Make a new frame
		frame.setTitle("Art"); // Set the title for fun
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		Rectangle myArt = new Rectangle();
		frame.getContentPane().add(myArt);
		frame.setVisible(true);
	}
}
