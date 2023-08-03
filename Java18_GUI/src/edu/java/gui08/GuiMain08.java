package edu.java.gui08;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiMain08 {

	private JFrame frame;
	private final ImageIcon[] IMAGE_ICONS = {
		new ImageIcon("res/dog1.jpg"),
		new ImageIcon("res/dog2.jpg"),
		new ImageIcon("res/dog3.jpg"),
		new ImageIcon("res/dog4.jpg")
	};
	
	private int index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain08 window = new GuiMain08();
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
	public GuiMain08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblOutput = new JLabel(IMAGE_ICONS[index]);
//		lblOutput.setIcon(IMAGE_ICONS[index]); 이것도 가능
		lblOutput.setBounds(12, 10, 200, 200);
		frame.getContentPane().add(lblOutput);
		
		JButton btnPrev = new JButton("< 이전");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index--;
				if(index == -1) { // 마지막 인덱스보다 작은 경우
					index = IMAGE_ICONS.length -1;
				}
				System.out.println(index);
				lblOutput.setIcon(IMAGE_ICONS[index]);
				
			}
		});
		btnPrev.setFont(new Font("굴림", Font.BOLD, 42));
		btnPrev.setBounds(12, 220, 172, 131);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음 >");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index < IMAGE_ICONS.length - 1) { // 마지막 인덱스보다 작은 경우
					index++;
				}else { // .length 보다 넘어가는 상황
					index = 0;
				}
				
				System.out.println(index);
				lblOutput.setIcon(IMAGE_ICONS[index]);
			}
		});
		btnNext.setFont(new Font("굴림", Font.BOLD, 42));
		btnNext.setBounds(250, 220, 172, 131);
		frame.getContentPane().add(btnNext);
	}

}
