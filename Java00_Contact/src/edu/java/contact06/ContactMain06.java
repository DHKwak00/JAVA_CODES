package edu.java.contact06;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import org.graalvm.compiler.java.GraphBuilderPhase.Instance;

import javax.swing.JTable;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContactMain06 {

	private JFrame frame;
	private JTextField txtName, txtPhone, txtEmail, txtIndex;
	private JTextArea txtAreaInfo, txtAreaLog;

	private static ContactDAO dao;
	
	/* 스윙 테이블을 사용하기 위한 멤버 변수 선언 */  
	private JTable table;
	private String[] colNames = {"No", "이름", "전화번호", "이메일"}; // 테이블 헤더에 들어갈 이름들
	private Object[] records = new Object[colNames.length]; // 테이블 데이터를 저장할 배열 객체
	private DefaultTableModel tableModel; // 테이블 형태를 만들 모델 변수
	
	public static void main(String[] args) {
		dao = ContactDAOImple.getInstance();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06();
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
	public ContactMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font lblFont = new Font("굴림", Font.PLAIN, 44);
		int lblWidth = 176;
		int lblHeight = 55;
		JLabel lblNewLabel = new JLabel("연락처 프로그램 Version 0.6");
		lblNewLabel.setFont(lblFont);
		lblNewLabel.setBounds(12, 10, 746, 66);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblName = new JLabel("이름");
		lblName.setFont(lblFont);
		lblName.setBounds(12, 86, lblWidth, lblHeight);
		frame.getContentPane().add(lblName);

		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setFont(lblFont);
		lblPhone.setBounds(12, 151, lblWidth, lblHeight);
		frame.getContentPane().add(lblPhone);

		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setFont(lblFont);
		lblEmail.setBounds(12, 216, lblWidth, lblHeight);
		frame.getContentPane().add(lblEmail);

		Font txtFont = new Font("굴림", Font.PLAIN, 34);
		int txtWidth = 286;
		int txtHeight = 55;
		txtName = new JTextField();
		txtName.setFont(txtFont);
		txtName.setBounds(200, 86, txtWidth, txtHeight);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtPhone = new JTextField();
		txtPhone.setFont(txtFont);
		txtPhone.setBounds(200, 151, txtWidth, txtHeight);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setFont(txtFont);
		txtEmail.setBounds(200, 216, txtWidth, txtHeight);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		Font btnFont = new Font("굴림", Font.PLAIN, 24);

		JButton btnInsert = new JButton("등록");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();
			}

		});
		btnInsert.setFont(btnFont);
		btnInsert.setBounds(12, 281, 110, 46);
		frame.getContentPane().add(btnInsert);

		JButton btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectContactByIndex();
			}
		});

		btnSearch.setFont(btnFont);
		btnSearch.setBounds(256, 281, 110, 46);
		frame.getContentPane().add(btnSearch);

		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});

		btnUpdate.setFont(btnFont);
		btnUpdate.setBounds(12, 337, 110, 46);
		frame.getContentPane().add(btnUpdate);

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});

		btnDelete.setFont(btnFont);
		btnDelete.setBounds(134, 337, 110, 46);
		frame.getContentPane().add(btnDelete);

		JButton btnAllSearch = new JButton("전체검색");
		btnAllSearch.addActionListener((e) -> {
			selectAllContact();
			selectAllContactTable();
		});
		btnAllSearch.setFont(btnFont);
		btnAllSearch.setBounds(256, 337, 190, 46);
		frame.getContentPane().add(btnAllSearch);

		txtIndex = new JTextField();
		txtIndex.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtIndex.setText("");
			}
		});
		txtIndex.setText("번호입력");
		txtIndex.setFont(new Font("굴림", Font.PLAIN, 17));
		txtIndex.setBounds(134, 281, 108, 46);
		frame.getContentPane().add(txtIndex);
		txtIndex.setColumns(5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 393, 480, 95);
		frame.getContentPane().add(scrollPane);

		txtAreaInfo = new JTextArea();
		txtAreaInfo.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane.setViewportView(txtAreaInfo);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 498, 480, 95);
		frame.getContentPane().add(scrollPane_1);

		txtAreaLog = new JTextArea();
		txtAreaLog.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane_1.setViewportView(txtAreaLog);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(504, 281, 254, 312);
		frame.getContentPane().add(scrollPane_2);
		
		// 테이블 초기화
		tableModel = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		}; // 각 cell 변경 불가능 
		
		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("안녕?");
			}
		});
		table.setFont(new Font("굴림", Font.PLAIN, 15));
		
		scrollPane_2.setViewportView(table);
		
	} // end initialize()
	
	private void selectAllContactTable() {
		ArrayList<ContactDTO> list = dao.select();
		tableModel.setRowCount(0);
		for(int i = 0; i < list.size(); i++) {
//			records[0] = i;
			records[0] = list.get(i); // 로 바꿔야함 이유? 인덱스 번호 당겨지기 방지
			records[1] = list.get(i).getName();
			records[2] = list.get(i).getPhone();
			records[3] = list.get(i).getEmail();
			tableModel.addRow(records);			
		}
		
	} // end selectAllContactTable()

	private void insertContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		
		if(name.isBlank() || phone.isBlank() || email.isBlank()) {
			txtAreaLog.setText("모든 데이터를 입력하세요!");
			return;
		}
		
		ContactDTO dto = new ContactDTO(0, name, phone, email); // seq로 어짜피 숫자가 매겨지니 dto값 타입만 맞춰줘도 무관
		
		int result = dao.insert(dto);
		int size = dao.select().size();
		if(result == 1) {
			txtAreaLog.setText("연락처 등록 완료\n" + "등록된 연락처 개수 : " + size + "\n");
		}
	} // end insertContact()
	
	private void selectAllContact() {
		int size = ((ContactDAOImple) dao).getSize();
		ArrayList<ContactDTO> list = dao.select();
		StringBuffer buffer = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			buffer.append("연락처[" + i + "] \n" 
					+ list.get(i) + "\n");
		}
		txtAreaInfo.setText(buffer.toString());
		long endTime = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (endTime - startTime ));
		
	} // end selectAllContact()
	
	private void selectContactByIndex() {
		int contactId = Integer.parseInt(txtIndex.getText());
		int size = ((ContactDAOImple) dao).getSize();
		
		if(contactId >= 0 && contactId < size) {
			ContactDTO dto = dao.select(contactId);
			txtAreaInfo.setText(dto.toString());
		} else {
			txtAreaLog.setText("해당 인덱스에 연락처가 없습니다.");
		}
		
	} // end selectContactByIndex()

	private void updateContact() {
		int contactId = Integer.parseInt(txtIndex.getText());
		
		int size = ((ContactDAOImple) dao).getSize();
		
		if(contactId >= 0 && contactId < size) {
			String name = txtName.getText();
			String phone = txtPhone.getText();
			String email = txtEmail.getText();
			
			if(name.isBlank() || phone.isBlank() || email.isBlank()) {
				txtAreaLog.setText("모든 데이터를 입력하세요!");
				return;
			}
			
			ContactDTO dto = new ContactDTO(contactId, name, phone, email);
			
			int result = dao.update(contactId, dto);
			if(result == 1) {
				txtAreaLog.setText("연락처 수정 완료!");
			}
		} else {
			txtAreaLog.setText("해당 인덱스에 연락처가 없습니다.");
		}
		
	} // end updateContact()

	private void deleteContact() {
		int index = Integer.parseInt(txtIndex.getText());
		
		int size = ((ContactDAOImple) dao).getSize();
		
		if(index >= 0 && index < size) {			
			int result = dao.delete(index);
			txtAreaLog.setText("연락처 삭제 완료!");

		} else {
			txtAreaLog.setText("해당 인덱스에 연락처가 없습니다.");
		}
	} // deleteContact()	
	
	

} // end ContactMain05
















