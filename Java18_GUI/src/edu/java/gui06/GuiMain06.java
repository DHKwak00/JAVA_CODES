package edu.java.gui06;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain06 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain06 window = new GuiMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JRadioButton rdbtnMale = new JRadioButton("남자");
		
			
		rdbtnMale.setSelected(true);
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Gulim", Font.PLAIN, 12));
		rdbtnMale.setBounds(8, 6, 121, 23);
		frame.getContentPane().add(rdbtnMale);
		
		final JRadioButton rdbtnFemale = new JRadioButton("여자");
		
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Gulim", Font.PLAIN, 12));
		rdbtnFemale.setBounds(150, 6, 121, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		textArea = new JTextArea();
		textArea.setBounds(8, 72, 414, 179);
		frame.getContentPane().add(textArea);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMale.isSelected()) { // .isSelected() 안에 이미 true 값이 있어서 '== true' 필요 없음
					textArea.setText("성별은 " + rdbtnMale.getText());
				} else /* if(rdbtnFemale.isSelected() == true) */{
					textArea.setText("성별은 " + rdbtnFemale.getText());
				}
			}
		});
		btnCheck.setBounds(8, 39, 97, 23);
		frame.getContentPane().add(btnCheck);
	}
}
