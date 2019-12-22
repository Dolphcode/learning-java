package Chapter12.RandCircle;

import javax.swing.JFrame;

public class RandCircleWindow {

	public static void main(String[] args) {
		RandCircleWindow rcw = new RandCircleWindow();
		rcw.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setTitle("Random Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		RandCircleDraw rcd = new RandCircleDraw();
		frame.getContentPane().add(rcd);
		frame.setVisible(true);
	}
	
}
