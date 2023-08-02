package edu.java.gui03;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuiMain03 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textOutput;
	private JTextArea textArea; // 주의 사항

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain03 window = new GuiMain03();
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
	public GuiMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int lblWidth = 245;
		int lblHeight = 56; // fpdlqmf shvdl
		Font lblFont = new Font("굴림", Font.BOLD, 48);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(12, 10, lblWidth, lblHeight);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(lblFont);
		lblName.setOpaque(true);
		lblName.setBackground(Color.PINK);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setBounds(12, 98, lblWidth, lblHeight);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(lblFont);
		lblPhone.setOpaque(true);
		lblPhone.setBackground(Color.ORANGE);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setBounds(12, 182, lblWidth, lblHeight);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(lblFont);
		lblEmail.setOpaque(true);
		lblEmail.setBackground(Color.BLUE);
		
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setBounds(269, 10, 268, 56);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(269, 102, 268, 52);
		frame.getContentPane().add(textPhone);
		textPhone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(276, 184, 261, 54);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnInfo = new JButton("정보 출력");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				String phone = textPhone.getText();
				String email = textEmail.getText();
				
				String msg = "이름 : " + name + "\n"
						+"전화번호 : " + phone + "\n"
						+"이메일 : " + email + "\n";
				textOutput.setText(msg);
				textArea.setText(msg); // 더
				textArea.append(msg);
			}
		});
		btnInfo.setFont(new Font("굴림", Font.PLAIN, 24));
		btnInfo.setBounds(12, 268, 560, 76);
		frame.getContentPane().add(btnInfo);
		
		textOutput = new JTextField();
		textOutput.setBounds(12, 328, 560, 70);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 408, 560, 303);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea(); // 어짶 인스턴스 생성 멤버변수로 만든다
		scrollPane.setViewportView(textArea);
		
	}
}
