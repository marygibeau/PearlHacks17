package jpain;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingContainerDemo implements ActionListener {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JTextField msglabel;
	private JButton nbutton;

	private JLabel headerLabel2;
	private JLabel statusLabel2;
	private JPanel controlPanel2;
	private JTextField msglabel2;
	private JButton nbutton2;

	public SwingContainerDemo() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingContainerDemo swingContainerDemo = new SwingContainerDemo();
		swingContainerDemo.showJPanelDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Pick me up");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		msglabel = new JTextField("", 10);
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		nbutton = new JButton("Done!");
		nbutton.addActionListener(this);

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.add(nbutton);
		mainFrame.setVisible(true);
	}

	private void showJPanelDemo() {
		headerLabel.setText("What is your name?");
		JPanel npanel = new JPanel();
		npanel.setBackground(Color.magenta);
		npanel.setLayout(new FlowLayout());
		npanel.add(msglabel);
		controlPanel.add(npanel);
		mainFrame.setVisible(true);
		// }

		headerLabel2 = new JLabel("", JLabel.CENTER);
		statusLabel2 = new JLabel("", JLabel.CENTER);
		statusLabel2.setSize(350, 100);
		msglabel2 = new JTextField("", 10);
		controlPanel2 = new JPanel();
		controlPanel2.setLayout(new FlowLayout());
		nbutton2 = new JButton("Done!");

		mainFrame.add(headerLabel2);
		mainFrame.add(controlPanel2);
		mainFrame.add(statusLabel2);
		mainFrame.add(nbutton2);
		mainFrame.setVisible(true);

		//
		// private void showJPanelDemo2() {
		// headerLabel2.setText("What is your name?");
		// JPanel npanel2 = new JPanel();
		// npanel2.setBackground(Color.magenta);
		// npanel2.setLayout(new FlowLayout());
		// npanel2.add(msglabel);
		// controlPanel2.add(npanel2);
		// mainFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("you did it");
	}

}

// }
