package edu.java.gui07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain07 {

	// 멤버 변수
	private JFrame frame; // 밑에서 new 하고 인스턴스로 써야
	private final String[] STRINGS = {
			"1. 강정묵", "2. 곽동훈", "3. 김빛찬", "4. 김성훈", "5. 김요한",
			"6. 김홍석", "7. 박진성", "8. 서해용", "9. 안성원", "10. 이동건",
			"11. 전황", "12. 조성하", "13. 조학용"
	};
	
	private int index = 0; // 메인에서 안써도 initialize에서 써서 굳이 static 안써도 된다.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain07 window = new GuiMain07();
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
	public GuiMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblOutput = new JLabel(STRINGS[index]);
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("굴림", Font.BOLD, 42));
		lblOutput.setBounds(12, 10, 410, 150);
		frame.getContentPane().add(lblOutput);
		
		JButton btnPrev = new JButton("< 이전");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index--;
				if(index == -1) { // 마지막 인덱스보다 작은 경우
					index = STRINGS.length -1;
				}
				System.out.println(index);
				lblOutput.setText(STRINGS[index]);
			}
		});
		btnPrev.setFont(new Font("굴림", Font.BOLD, 42));
		btnPrev.setBounds(12, 229, 172, 172);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음 >");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index < STRINGS.length - 1) { // 마지막 인덱스보다 작은 경우
					index++;
				}else { // .length 보다 넘어가는 상황
					index = 0;
				}
				
				System.out.println(index);
				lblOutput.setText(STRINGS[index]);
			}
		});
		btnNext.setFont(new Font("굴림", Font.BOLD, 42));
		btnNext.setBounds(250, 229, 172, 172);
		frame.getContentPane().add(btnNext);
		
	} // end initialize()
	
} // end GuiMain07
