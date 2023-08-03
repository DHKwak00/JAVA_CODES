package edu.java.gui09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;

public class GuiMain09 {

	private JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain09 window = new GuiMain09();
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
	public GuiMain09() {
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
		
		final JCheckBox chckbxMusic = new JCheckBox("음악");
		chckbxMusic.setFont(new Font("Gulim", Font.PLAIN, 12));
		chckbxMusic.setBounds(8, 6, 100, 23);
		frame.getContentPane().add(chckbxMusic);
		
		final JCheckBox chckbxMovie = new JCheckBox("영화");
		chckbxMovie.setFont(new Font("Gulim", Font.PLAIN, 12));
		chckbxMovie.setBounds(112, 6, 100, 23);
		frame.getContentPane().add(chckbxMovie);
		
		final JCheckBox chckbxReading = new JCheckBox("독서");
		chckbxReading.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxReading.isSelected()) { // 독서 체크박스를 선택하면
					textArea.setEnabled(false);
				}else {
					textArea.setEnabled(true);
				}
			}
		});
		chckbxReading.setFont(new Font("Gulim", Font.PLAIN, 12));
		chckbxReading.setBounds(216, 6, 100, 23);
		frame.getContentPane().add(chckbxReading);
		
		JButton btnOutput = new JButton("출력");
		btnOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = "음악 : " + chckbxMusic.isSelected() + "\n"
						+ "영화 : " + chckbxMovie.isSelected() + "\n"
						+ "독서 : " + chckbxReading.isSelected() + "\n";
				textArea.setText(result);
			}
		});
		btnOutput.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnOutput.setBounds(324, 6, 98, 23);
		frame.getContentPane().add(btnOutput);
		
		textArea = new JTextArea();
		textArea.setBounds(18, 35, 414, 216);
		frame.getContentPane().add(textArea);
	}
}
