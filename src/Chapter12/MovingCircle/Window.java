package Chapter12.MovingCircle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	int x = 30;
	int y = 30;
	String direction = "R";
	Circle circ = new Circle();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window wind = new Window();
		wind.go();
		
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click the change the circle's color!");
		button.addActionListener(new buttonListener());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(BorderLayout.CENTER, circ);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(360, 400);
		frame.setVisible(true);
		frame.setResizable(false);
		
		while (true){
			if (checkDirection(x, y) != "NC") {
				direction = checkDirection(x, y);
			}
			
			if(direction == "L") {
				x--;
			} else if (direction == "R") {
				x++;
			} else if (direction == "U") {
				y--;
			} else {
				y++;
			}
			circ.repaint();
			try {
				Thread.sleep(10);
			} catch(Exception ex) {}
		}
	}
	
	public static String checkDirection(int x, int y) {
		if (x == 270 && y == 270) {
			return "L";
		} else if (x == 30 && y == 30) {
			return "R";
		} else if (x == 270 && y == 30) {
			return "D";
		} else if (x == 30 && y == 270) {
			return "U";
		} else {
			return "NC";
		}
	}
	
	class Circle extends JPanel{
		private static final long serialVersionUID = -6346913963422686594L;
		
		int r = (int) (Math.random() * 255);
		int gr = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		
		public void randomizeColor() {
			r = (int) (Math.random() * 255);
			gr = (int) (Math.random() * 255);
			b = (int) (Math.random() * 255);
		}
		
		public void paintComponent(Graphics g) {
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(new Color(r, gr, b));
			g.fillOval(x, y, 50, 50);
		}
	}
	
	class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			circ.randomizeColor();
			circ.repaint();
		}
		
	}
}
