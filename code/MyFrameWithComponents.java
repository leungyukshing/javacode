import javax.swing.*;

public class MyFrameWithComponents {
	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrameWithComponets");

		// Add a button into the frame
		JButton jbtOK = new JButton("OK");
		frame.add(jbtOK);

		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}