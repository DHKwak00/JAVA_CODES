package edu.java.gui04;

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
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class GuiMain04 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain04 window = new GuiMain04();
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
	public GuiMain04() {
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
		
		Font lblFont = new Font("굴림", Font.BOLD | Font.ITALIC, 48);
		
		JLabel lblNum1= new JLabel("Number 1");
		lblNum1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 36));
		lblNum1.setBounds(12, 10, 200, 65);
		lblNum1.setOpaque(true);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Number 2");
		lblNum2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 36));
		lblNum2.setBounds(12, 85, 200, 65);
		lblNum2.setOpaque(true);
		frame.getContentPane().add(lblNum2);
		
		txt1 = new JTextField();
		txt1.setBounds(222, 10, 200, 65);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(222, 85, 200, 65);
		frame.getContentPane().add(txt2);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt1.getText();
				String num2 = txt2.getText();
				double total = Double.valueOf(num1) + Double.valueOf(num2);
				
				String msg = num1 + "+" + num2 + "=" + total + "\n";
				
				textArea.append(msg);
				System.out.println();
				
			}
		});
		btnPlus.setFont(lblFont);
		btnPlus.setBackground(UIManager.getColor("Button.background"));
		btnPlus.setBounds(12, 173, 85, 85);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt1.getText();
				String num2 = txt2.getText();
				double total = Double.valueOf(num1) - Double.valueOf(num2);
				
				String msg = num1 + "-" + num2 + "=" + total + "\n";
				
				textArea.append(msg);
				System.out.println();
				
			}
		});
		btnMinus.setFont(lblFont);
		btnMinus.setBounds(121, 173, 85, 85);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt1.getText();
				String num2 = txt2.getText();
				double total = Double.valueOf(num1) * Double.valueOf(num2);
				
				String msg = num1 + "*" + num2 + "=" + total + "\n";
				
				textArea.append(msg);
				System.out.println();
				
			}
		});
		btnMul.setFont(new Font("굴림", Font.BOLD, 36));
		btnMul.setBounds(228, 173, 85, 85);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt1.getText();
				String num2 = txt2.getText();
				double total = Double.valueOf(num1) / Double.valueOf(num2);
				
				String msg = num1 + "/" + num2 + "=" + total + "\n";
				
				textArea.append(msg);
				System.out.println();
				
			}
		});
		btnDiv.setFont(new Font("굴림", Font.PLAIN, 36));
		btnDiv.setBounds(337, 173, 85, 85);
		frame.getContentPane().add(btnDiv);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(12, 268, 410, 133);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
		scrollPane.setViewportView(textArea);
	}
}
