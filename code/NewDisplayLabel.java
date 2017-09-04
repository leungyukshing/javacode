import javax.swing.*;

public class NewDisplayLabel extends JApplet {
	public NewDisplayLabel()
	{
		add(new JLabel("Great!", JLabel.CENTER));
	}

	public static void main(String[] args)
	{
		// Create a frame
		JFrame frame = new JFrame("Applet is in the frame");

		// Create an instance of the applet
		DisplayLabel applet = new DisplayLabel();

		// Add the aplet to the frame
		frame.add(applet);

		// Display the frame
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}