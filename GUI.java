package endProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	static JFrame frame = new JFrame("Calender");

	public static void createAndDisplay() {
		frame.setSize(1400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JPanel monday = new JPanel();
		monday.setBounds(0, 0, 200, 500);
		monday.setLayout(new BoxLayout(monday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(1).equals(LocalDate.now().toString())) {
			monday.setBackground(Color.orange);
		}

		JPanel tuesday = new JPanel();
		tuesday.setBounds(200, 0, 200, 500);
		tuesday.setLayout(new BoxLayout(tuesday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(2).equals(LocalDate.now().toString())) {
			tuesday.setBackground(Color.orange);
		}

		JPanel wednesday = new JPanel();
		wednesday.setBounds(400, 0, 200, 500);
		wednesday.setLayout(new BoxLayout(wednesday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(3).equals(LocalDate.now().toString())) {
			wednesday.setBackground(Color.orange);
		}

		JPanel thursday = new JPanel();
		thursday.setBounds(600, 0, 200, 500);
		thursday.setLayout(new BoxLayout(thursday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(4).equals(LocalDate.now().toString())) {
			thursday.setBackground(Color.orange);
		}

		JPanel friday = new JPanel();
		friday.setBounds(800, 0, 200, 500);
		friday.setLayout(new BoxLayout(friday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(5).equals(LocalDate.now().toString())) {
			friday.setBackground(Color.orange);
		}

		JPanel saturday = new JPanel();
		saturday.setBounds(1000, 0, 200, 500);
		saturday.setLayout(new BoxLayout(saturday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(6).equals(LocalDate.now().toString())) {
			saturday.setBackground(Color.orange);
		}

		JPanel sunday = new JPanel();
		sunday.setBounds(1200, 0, 200, 500);
		sunday.setLayout(new BoxLayout(sunday, BoxLayout.PAGE_AXIS));

		if (Date.getTime(7).equals(LocalDate.now().toString())) {
			sunday.setBackground(Color.orange);
		}

		addGroupOfComponents(1, "Monday", monday);
		addGroupOfComponents(2, "Tuesday", tuesday);
		addGroupOfComponents(3, "Wednesday", wednesday);
		addGroupOfComponents(4, "Thursday", thursday);
		addGroupOfComponents(5, "Friday", friday);
		addGroupOfComponents(6, "Saturday", saturday);
		addGroupOfComponents(7, "Sunday", sunday);

		frame.add(monday);
		frame.add(tuesday);
		frame.add(wednesday);
		frame.add(thursday);
		frame.add(friday);
		frame.add(saturday);
		frame.add(sunday);

		frame.setVisible(true);
	}

	private static void addGroupOfComponents(int x, String text, JPanel container) {

		JLabel label = new JLabel(Date.getTime(x));
		JLabel label2 = new JLabel(text);

		JButton button = new JButton("Add Events");
		JTextField tf = new JTextField("", 100);

		tf.setPreferredSize(new Dimension(0, 50));
		tf.setMaximumSize(tf.getPreferredSize());

		addButtonListener(button, label, label2, tf, container);

		container.add(label);
		container.add(label2);
		container.add(Box.createVerticalStrut(10));
		container.add(tf);
		container.add(button);

	}

	private static void addButtonListener(JButton button, JLabel label, JLabel label2, JTextField tf,
			JPanel container) {

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel label3 = new JLabel();
				label3.setText(tf.getText());

				container.add(label3);
				frame.setVisible(true);
			}

		};
		button.addActionListener(listener);
	}
}
