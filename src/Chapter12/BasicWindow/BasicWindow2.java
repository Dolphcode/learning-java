package Chapter12.BasicWindow;

import java.awt.event.*;
import javax.swing.*;

// To make a GUI we'll be using JFrame
public class BasicWindow2 implements ActionListener{
	
	JButton button;
	
	public static void main(String[] args) {
		
		BasicWindow2 bw = new BasicWindow2();
		bw.go();
		
	}
	
	// A listener is one that listens for events
	public void go() {
		JFrame frame = new JFrame(); // Make a new frame
		frame.setTitle("Clickty click"); // Set the title for fun
		button = new JButton("click me"); // Add a new button
		
		button.addActionListener(this); // We need to add this class to the list of listeners of the button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(button);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	// This is the event handling method that executes some code when some event happens
	// The button calls this and inputs an ActionEvent but we don't need it for now
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked");
	}
	
}
