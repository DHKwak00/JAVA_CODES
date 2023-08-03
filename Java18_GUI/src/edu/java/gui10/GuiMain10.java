package edu.java.gui10;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GuiMain10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain10 window = new GuiMain10();
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
	public GuiMain10() {
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
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFileChooser : 파일을 선택할 수 있는 팝업창
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(frame);
				if(result == JFileChooser.APPROVE_OPTION) { // 확인버튼 클릭시
					System.out.println("파일 선택");
					File selected = chooser.getSelectedFile();
					System.out.println(selected.getAbsolutePath());
					
				}else { // 취소 버튼 클릭시
					System.out.println("취소");
				}
			}
		});
		mnNewMenu.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// conformDialong : 
				// Yes(확인), No(아니오) - Cancel(취소) qjxmsdmf rkwsms ekdldjffhrm
				int result = 
						JOptionPane.showConfirmDialog(null, "종료 하시겠습니까?");
				// parentComponent : 부모 컴퍼넌트를 설정, 현재 컴퍼넌트가 추력될 위치 설정
				System.out.println("선택 결과 : " + result);
				if(result == JOptionPane.YES_OPTION) {
					// 프로그램 종료 : 
					// System.ce
				}
			}
		});
		mnNewMenu.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메세지와 ok버튼만 있는 다이얼로그 : MessageDialog
				JOptionPane.showMessageDialog(frame, "버전 1.0");
			}
		});
		mnHelp.add(mntmAbout);
	}
}
