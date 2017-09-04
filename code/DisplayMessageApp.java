import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class DisplayMessageApp extends JApplet {
	private String message = "A default message";
	private int x = 20;
	private int y = 20;

	// Determine whether it is an application
	private boolean isStandalone = false;
	// Initialize the applet
	public void init()
	{
		if(!isStandalone)
		{
			// Get parameter values from the HTML file
			String message = getParameter("MESSAGE");
			int x = Integer.parseInt(getParameter("X"));
			int y = Integer.parseInt(getParameter("Y"));
		}

		// Create a message panel
		MessagePanel messagePanel = new MessagePanel(message);
		messagePanel.setFont(new Font("SansSerif", Font.BOLD, 20));
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);

		// Add the message panel to the applet
		add(messagePanel);
	}

	public static void main(String[] args)
	{
		// Create a frame
		JFrame frame = new JFrame("DisplayMessageApp");


		// Create an instance of the applet
		DisplayMessageApp applet = new DisplayMessageApp();

		// It runs an an application
		applet.isStandalone = true;

		// Get parameters from the command line
		applet.getCommandLineParameters(args);

		// Add the applet instance to the frame
		frame.add(applet, BorderLayout.CENTER);

		// Invoke applet's init method
		applet.init();
		applet.start();

		// Display the frame
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// Get command-line parameters
	private void getCommandLineParameters(String[] args)
	{
		// Check usage and get x, y and messsage
		if(args.length != 3)
		{
			System.out.println("Usage: java DisplayMessageApp x y message");
			System.exit(0);
		}
		else
		{
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			message = args[2];
		}
	}
}