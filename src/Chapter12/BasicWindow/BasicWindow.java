package Chapter12.BasicWindow;

import javax.swing.*;

// To make a GUI we'll be using JFrame
public class BasicWindow{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); // Make a new frame
		JButton button = new JButton("click me"); // Add a new button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(button);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
}
