import java.awt.FontMetrics;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MessagePanel extends JPanel {
	// The mesage to be displayed
	private String message = "Welcome to Java";

	// The x-coordinate where the message is displayed
	private int xCoordinate = 20;

	// The y-coordinate where the message is displayed
	private int yCoordinate = 20;

	// Indicate whether the message is displayed in the center
	private boolean centered;

	// The interval for moving the message horizontally and vertically
	private int interval = 10;

	public MessagePanel() {}

	public MessagePanel(String message)
	{
		this.message = message;
	}

	public String getMessage() { return message; }

	public void setMessage(String message)
	{
		this.message = message;
		repaint();
	}

	public int getXCoordinate() { return xCoordinate; }

	public void setXCoordinate(int x)
	{
		this.xCoordinate = x;
		repaint();
	}

	public int getYCoordinate() { return yCoordinate; }

	public void setYCoordinate(int y)
	{
		this.yCoordinate = y;
		repaint();
	}

	public boolean isCentered() { return centered; }

	public void setCentered(boolean centered)
	{
		this.centered = centered;
		repaint();
	}

	public int getInterval() { return interval; }

	public void setinterval(int interval)
	{
		this.interval = interval;
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if(centered)
		{
			// Get font metrics for the current font
			FontMetrics fm = g.getFontMetrics();

			// Find the center location to display
			int stringWidth = fm.stringWidth(message);
			int stringAscent = fm.getAscent();
			// Get the position of the leftmost character in the baseline
			xCoordinate = getWidth() / 2 - stringWidth / 2;
			yCoordinate = getHeight() / 2 + stringAscent / 2;
		}

		g.drawString(message, xCoordinate, yCoordinate);
	}

	public void moveLeft()
	{
		xCoordinate -= interval;
		repaint();
	}

	public void moveRight()
	{
		xCoordinate += interval;
		repaint();
	}

	public void moveUp()
	{
		yCoordinate -= interval;
		repaint();
	}

	public void moveDown()
	{
		yCoordinate += interval;
		repaint();
	}

	public Dimension getPreferredSize()
	{
		return new Dimension(200, 30);
	}
}