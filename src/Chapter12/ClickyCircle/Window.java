package Chapter12.ClickyCircle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window{
	
	Circle circ = new Circle();
	JFrame frame = new JFrame();
	JButton changeForm = new JButton("Clickity");
	JButton attack = new JButton("Attack!");
	JLabel label = new JLabel("Fighting the Circle!");
	
	private static int circleHP = 20;
	
	public static void main(String[] args) {
		Window win = new Window();
		win.go();
	}
	
	public void go() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clickity Circles");
		
		changeForm.addActionListener(new ColorListener());
		attack.addActionListener(new LabelListener());
		
		frame.getContentPane().add(BorderLayout.SOUTH, changeForm);
		frame.getContentPane().add(BorderLayout.EAST, attack);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.CENTER, circ);
		
		frame.setSize(450, 300);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	// So we're going to use inner classes to have two ActionListeners that can access our instance variables
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Circle.randomizeColors();
			frame.repaint();
		}	
	}
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (circleHP == 0) {
				label.setText("You win! Boss Respawning");
				circleHP = 20;
			} else {
				label.setText("A Hit! HP: " + circleHP);
			}
			
			circleHP -= 5;
			frame.repaint();
		}	
	}
	

	
}
