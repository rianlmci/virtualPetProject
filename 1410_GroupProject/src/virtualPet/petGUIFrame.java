package virtualPet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class petGUIFrame extends JFrame {

	private JPanel windowOne = new JPanel();
	private JPanel windowTwo = new JPanel();
	private JPanel windowThree = new JPanel();
	private JPanel containerPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					petGUIFrame frame = new petGUIFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public petGUIFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		containerPane = new JPanel();
		containerPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(containerPane);
		containerPane.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				containerPane.remove(windowOne);
				containerPane.add(windowTwo);
				containerPane.revalidate();
			}
		});
		
		containerPane.add(windowOne, "name_2422151721339200");
		windowOne.add(btnNewButton, "name_2422484644423900");
		
	}

}
