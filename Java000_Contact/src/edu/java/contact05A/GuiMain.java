package edu.java.contact05A;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import edu.java.contact01.Contact;

public class GuiMain {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtIndex;
	private JTextArea txtAreaInfo;
	private JTextArea txtAreaLog;
	
	private static ContactDAO dao;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain window = new GuiMain();
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
	public GuiMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연락처 프로그램 Version 0.5");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 28));
		lblNewLabel.setBounds(0, 0, 434, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("이름");
		lblName.setFont(new Font("굴림", Font.PLAIN, 30));
		lblName.setBounds(0, 40, 120, 40);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setFont(new Font("굴림", Font.PLAIN, 30));
		lblPhone.setBounds(0, 80, 120, 40);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setFont(new Font("굴림", Font.PLAIN, 30));
		lblEmail.setBounds(0, 120, 120, 40);
		frame.getContentPane().add(lblEmail);
		
		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtName.setText("");
			}
		});
		txtName.setBounds(125, 45, 180, 30);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPhone.setText("");
			}
		});
		txtPhone.setColumns(10);
		txtPhone.setBounds(125, 85, 180, 30);
		frame.getContentPane().add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setColumns(10);
		txtEmail.setBounds(125, 125, 180, 30);
		frame.getContentPane().add(txtEmail);
		
		JButton btnInsert = new JButton("등록"); // 메소드화 하자 
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				dao = ContactDAOImple.getInstance(); // 싱글톤 사용 어디서 하니까 main 메서드에서 선언해도 좋음
				
				String name = txtName.getText();
				String phone = txtPhone.getText();
				String email = txtEmail.getText();
				
				ContactDTO dto = new ContactDTO(name, phone, email);
				
				
				int result = dao.insert(dto);
				int size = ((ContactDAOImple) dao).getSize();
				
				if(result == 1) {
					txtAreaLog.setText("등록된 연락처 개수 : " + size + "\n");
					txtAreaLog.append("연락처 정보 등록 완료");
				}
			}
		});
		btnInsert.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnInsert.setBounds(10, 170, 80, 35);
		frame.getContentPane().add(btnInsert);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = ContactDAOImple.getInstance();
				int size = ((ContactDAOImple) dao).getSize();
				int index = Integer.parseInt(txtIndex.getText());
				if(index >= 0 && index < size) {
					ContactDTO dto = dao.select(index);
					txtAreaInfo.setText("--- 연락처 " + index + " ---" + "\n");
					txtAreaInfo.append(dto.toString() + "\n");
				}
				
				
			}
		});
		btnSearch.setBounds(102, 170, 80, 35);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = ContactDAOImple.getInstance();
				int size = ((ContactDAOImple) dao).getSize();
				int index = Integer.parseInt(txtIndex.getText());
				
				String phone = txtPhone.getText();
				String email = txtEmail.getText();
				
				if(index >= 0 && index < size) {
					ContactDTO dto = new ContactDTO("", phone, email);
					int result = dao.update(index, dto);
					if(result == 1) {
						txtAreaLog.setText("연락처 수정 완료!");		
					}
				}
				
				
			}
		});
		btnUpdate.setBounds(10, 215, 80, 35);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = ContactDAOImple.getInstance();
				int size = ((ContactDAOImple) dao).getSize();
				int index = Integer.parseInt(txtIndex.getText());
				
				if(index >= 0 && index < size) {
					int result = dao.delete(index);
					if(result == 1) {
						txtAreaLog.setText("연락처 삭제 완료!");		
					}
				}
			}
		});
		btnDelete.setBounds(102, 215, 80, 35);
		frame.getContentPane().add(btnDelete);
		
		JButton btnSeachAll = new JButton("전체검색");
		btnSeachAll.setFont(new Font("굴림", Font.PLAIN, 11));
		btnSeachAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = ContactDAOImple.getInstance();
				ArrayList<ContactDTO> list = dao.select();
				int size = ((ContactDAOImple) dao).getSize();
//				txtAreaInfo.setText("");
				
				for(int i = 0; i < size; i++) {
					txtAreaInfo.append("--- 연락처 " + i + " ---" + "\n");
					txtAreaInfo.append(list.get(i) + "\n");
					
					String[] contactList = new String[4];
					contactList[0] = Integer.toString(i);
					contactList[1] = list.get(i).getName();
					contactList[2] = list.get(i).getPhone();
					contactList[3] = list.get(i).getEmail();
					
					
					model.addRow(contactList);
				}
				
				
			}
		});
		btnSeachAll.setBounds(194, 215, 80, 35);
		frame.getContentPane().add(btnSeachAll);
		
		txtIndex = new JTextField();
		txtIndex.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtIndex.setText(""); 
			}
		});
		
		txtIndex.setText("번호입력");
		txtIndex.setBounds(194, 170, 80, 35);
		frame.getContentPane().add(txtIndex);
		txtIndex.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 260, 295, 135);
		frame.getContentPane().add(scrollPane);
		
		txtAreaInfo = new JTextArea();
		scrollPane.setViewportView(txtAreaInfo);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 405, 295, 70);
		frame.getContentPane().add(scrollPane_1);
		
		txtAreaLog = new JTextArea();
		scrollPane_1.setViewportView(txtAreaLog);
		
		
		String header[] = {"No.", "이름", "전화번호", "이메일"};
		String contents[][]={};
		
		model = new DefaultTableModel(contents, header);
		table = new JTable(model);
		table.setModel(model);
		table.setFillsViewportHeight(true); // pane 전체를 테이블로 쓰기 (값이 적어도 테이블 다 사용)
		JScrollPane scrollList = new JScrollPane(table);
		
		scrollList.setBounds(315, 260, 257, 215);
		frame.getContentPane().add(scrollList);
		
//		scrollList.setViewportView(table);
		
	}
}
