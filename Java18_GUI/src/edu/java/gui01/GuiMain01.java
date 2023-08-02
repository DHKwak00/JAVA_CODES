package edu.java.gui01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class GuiMain01 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // Runnable : 쓰레드
			public void run() {
				try {
					GuiMain01 window = new GuiMain01(); // 메인에서 이 프레임을 쓰레드로 돌리는 중
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
	public GuiMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼
		
		JLabel northlbl = new JLabel("North");
		frame.getContentPane().add(northlbl, BorderLayout.NORTH);
		
		JLabel westlbl = new JLabel("West");
		frame.getContentPane().add(westlbl, BorderLayout.WEST);
		
		JLabel centerlbl = new JLabel("Center");
		frame.getContentPane().add(centerlbl, BorderLayout.CENTER);
		
		JLabel eastlbl = new JLabel("East");
		frame.getContentPane().add(eastlbl, BorderLayout.EAST);
		
		JLabel southlbl = new JLabel("South");
		frame.getContentPane().add(southlbl, BorderLayout.SOUTH);
	}

}
