package edu.java.gui02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiMain02 {

	private JFrame frame;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain02 window = new GuiMain02();
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
	public GuiMain02() {
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
		
		final JLabel lblOutput = new JLabel("오늘은 수요일입니다.");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setForeground(new Color(128, 128, 255));
		lblOutput.setBounds(12, 10, 410, 50);
		frame.getContentPane().add(lblOutput);
		
		txtInput = new JTextField();
		txtInput.setHorizontalAlignment(SwingConstants.CENTER);
		txtInput.setFont(new Font("굴림", Font.PLAIN, 18));
		txtInput.setBounds(12, 68, 410, 63);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JButton btnInput = new JButton("입력");
		btnInput.addMouseListener(new MouseAdapter() { // 익명클래스
			@Override
			public void mouseClicked(MouseEvent e) {
				// 버트을 클릭했을 때 해야할 기능을 구현/
				// 입력된 텍스트의 값을 레이블에 적용시켰다.
				// JTextFiled에 입력된 내용을 읽어서 JLabel에 적용
				String msg = txtInput.getText();
				lblOutput.setText(msg);
			}
		});
		btnInput.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnInput.setBounds(12, 143, 410, 63);
		frame.getContentPane().add(btnInput);
		System.out.println("메소드 호출 끝");
	}
}
