package Chapter12.Image;

import javax.swing.*;

public class BunnyWindow {
	
	public static void main(String[] args) {
		BunnyWindow bw = new BunnyWindow();
		bw.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setTitle("Bunnyzilla");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 600);
		Bunnyzilla bunny = new Bunnyzilla();
		frame.getContentPane().add(bunny);
		frame.setVisible(true);
	}
	
}
