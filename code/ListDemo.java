import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame {
	final int NUMBER_OF_FLAGS = 7;

	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway"};

	// The list for selecting countries
	private JList jlist = new JList(flagTitles);

	// Declare an ImageIcon array for the national flags of 7 countries
	private ImageIcon[] imageIcons =
	{
		new ImageIcon("ca.jpg"),
		new ImageIcon("china.jpg"),
		new ImageIcon("denmark.jpg"),
		new ImageIcon("fr.jpg"),
		new ImageIcon("germany.jpg"),
		new ImageIcon("india.jpg"),
		new ImageIcon("norway.jpg")
	};

	private JLabel[] jlblImageViewer = new JLabel[NUMBER_OF_FLAGS];

	public static void main(String[] args)
	{
		ListDemo frame = new ListDemo();
		frame.setTitle("ListDemo");
		frame.setSize(650, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public ListDemo()
	{
		//System.out.println(jlist.getSelectionMode());
		// Create a panel to hold 7 labels
		JPanel p = new JPanel(new GridLayout(3, 3, 5, 5));

		for(int i = 0; i < NUMBER_OF_FLAGS; i++)
		{
			p.add(jlblImageViewer[i] = new JLabel());
			jlblImageViewer[i].setHorizontalAlignment(SwingConstants.CENTER);
		}

		// Add p and the list to the frame
		add(p, BorderLayout.CENTER);
		add(new JScrollPane(jlist), BorderLayout.WEST);

		// Register listeners
		jlist.addListSelectionListener(new ListSelectionListener()
		{
			public void valueChanged(ListSelectionEvent e)
			{
				// Get selected indices
				int[] indices = jlist.getSelectedIndices();

				int i;

				//System.out.println(indices.length);
				// Set icons in the labels
				for(i = 0; i < indices.length; i++)
				{
					jlblImageViewer[i].setIcon(imageIcons[indices[i]]);
				}

				// Remove icons from the rest of the labels
				for(; i < NUMBER_OF_FLAGS; i++)
				{
					jlblImageViewer[i].setIcon(null);
				}
			}
		});
	}
}