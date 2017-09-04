import javax.swing.*;

public class GUIComponents {
	@SuppressWarnings("unchecked") public static void main(String[] args) {
		// Create a button with test OK
		JButton jbtOK = new JButton("OK");

		// Create a button with test Cancel
		JButton jbtCancel = new JButton("Cancel");

		// Create a label with text "Entet your name: "
		JLabel jlblName = new JLabel("Enter your name: ");

		// Create a text field with text "Type Name Here"
		JTextField jtfName = new JTextField("Type Name Here");

		// Create a check box with text bold
		JCheckBox jchkBold = new JCheckBox("Bold");

		// Create a check box with text italic
		JCheckBox jchkItalic = new JCheckBox("Italic");

		// Create a radio button with text red
		JRadioButton jrbRed = new JRadioButton("Red");

		// Create a radio button with text yellow
		JRadioButton jrbYellow = new JRadioButton("Yellow");

		// Create a combo box with several choices
		String[] ss = {"Freshman", "Sophomore", "Junior", "Senior"};
		JComboBox jcboColor = new JComboBox(ss);

		// Create a panel to group components
		JPanel panel = new JPanel();
		panel.add(jbtOK); // Add the OK button to the panel
		panel.add(jbtCancel); // Add the Cancel button to the panel
		panel.add(jlblName); // Add the label to the panel
		panel.add(jtfName); // Add the text field to the panel
		panel.add(jchkBold); // Add the check box to the panel
		panel.add(jchkItalic); // Add the check box to the panel
		panel.add(jrbRed); // Add the radio button to the panel
		panel.add(jrbYellow); // Add the radio button to the panel
		panel.add(jcboColor); // Add the combo box to the panel

		JFrame frame = new JFrame();
		frame.add(panel); // Add the panel to the frame
		frame.setTitle("Show GUI components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}