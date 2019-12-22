package Chapter12.Gradient;

import javax.swing.JFrame;

public class RandGradWindow {

	public static void main(String[] args) {
		RandGradWindow rgw = new RandGradWindow();
		rgw.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setTitle("Random Gradient Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		RandGradient rg = new RandGradient();
		frame.getContentPane().add(rg);
		frame.setVisible(true);
	}
	
}
