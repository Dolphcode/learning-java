package Chapter12.ClickyCircleUltimate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window implements ActionListener{
	
	Circle circ = new Circle();
	JFrame frame = new JFrame();
	JButton button = new JButton("Clickity");
	
	public static void main(String[] args) {
		Window win = new Window();
		win.go();
	}
	
	public void go() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clickity Circles");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, circ);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		Circle.randomizeColors();
		frame.repaint();
	}
	
}
