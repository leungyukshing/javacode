import javax.swing.*;

public class TestButtonIcons extends JFrame {
	public static void main(String[] args)
	{
		// Create a frame and set its properties
		JFrame frame = new TestButtonIcons();
		frame.setTitle("ButtonIcons");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public TestButtonIcons()
	{
		ImageIcon icon1 = new ImageIcon("flag1.jpg");
		ImageIcon icon2 = new ImageIcon("flag2.jpg");
		ImageIcon icon3 = new ImageIcon("flag3.jpg");

		JButton jbt = new JButton("Click it", icon1);
		jbt.setPressedIcon(icon2);
		jbt.setRolloverIcon(icon3);

		// Alignments
		jbt.setHorizontalAlignment(SwingConstants.LEFT);
		jbt.setVerticalAlignment(SwingConstants.TOP);

		// Text Positions
		jbt.setHorizontalTextPosition(SwingConstants.CENTER);
		jbt.setVerticalTextPosition(SwingConstants.BOTTOM);

		add(jbt);
	}
}