import javax.swing.*;
import java.awt.*;

public class SixFlags extends JFrame {
	public SixFlags()
	{
		Image image1 = new ImageIcon("flag1.jpg").getImage();
		Image image2 = new ImageIcon("flag2.jpg").getImage();
		Image image3 = new ImageIcon("flag3.jpg").getImage();
		Image image4 = new ImageIcon("flag4.jpg").getImage();
		Image image5 = new ImageIcon("flag5.jpg").getImage();
		Image image6 = new ImageIcon("flag6.jpg").getImage();

		setLayout(new GridLayout(2, 0, 5, 5));
		add(new ImageViewer(image1));
		add(new ImageViewer(image2));
		add(new ImageViewer(image3));
		add(new ImageViewer(image4));
		add(new ImageViewer(image5));
		add(new ImageViewer(image6));
	}

	public static void main(String[] args)
	{
		SixFlags frame = new SixFlags();
		frame.setTitle("SixFlags");
		frame.setSize(400, 320);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}