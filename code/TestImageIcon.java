import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame {
	private ImageIcon icon1 = new ImageIcon("flag1.jpg");
	private ImageIcon icon2 = new ImageIcon("flag2.jpg");
	private ImageIcon icon3 = new ImageIcon("flag3.jpg");
	private ImageIcon icon4 = new ImageIcon("flag4.jpg");

	public TestImageIcon()
	{
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(icon1));
		add(new JLabel(icon2));
		add(new JLabel(icon3));
		add(new JLabel(icon4));
	}

	public static void main(String[] args) {
		TestImageIcon frame = new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}