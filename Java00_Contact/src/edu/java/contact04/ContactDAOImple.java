package edu.java.contact04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


// DAO(Data Access Object) :
// - 데이터의 전송을 담당하는 역할
public class ContactDAOImple implements ContactDAO{
	
	// 싱글톤 디자인 패턴 적용 시작
	// 1. private static 자기 자신 타입의 변수 선언
	private static ContactDAOImple instance = null;
	
	// 2. private 생성자
	private ContactDAOImple() {
		initDataDir();
		initDataFile();
	}
	
	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드 구현
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
	private ArrayList<ContactDTO> list = new ArrayList<>();
	
	// 데이터를 저장할 폴더와 파일 이름 정의
	private static final String DATA_DIR = "data";
	private static final String DATA_FILE = "contact.data";
	
	
	// data 폴더의 contact.data 파일 관리할 File 객체 선언
	private File dataDir;
	private File dataFile;
	
	// TODO : data 폴더가 있는지 검사하고, 없으면 생성하는 함수
	private void initDataDir() {
		System.out.println("initDataDir()");// 로그 남기기 (각 매소드에 찍어주기)
		dataDir = new File(DATA_DIR);
		if(!dataDir.exists()) {
			System.out.println("폴더가 없습나다");
			if(dataDir.mkdirs()) {
				System.out.println("폴더 생성 완료");
			}
		}else {
			System.out.println("폴더가 이미 존재 합니다.");
		}
	} // end initDataDir()
	
	// TODO : 데이터 파일이 존재하는지 검사하고,
	// 없는 경우 - 새로운 데이터 파일 생성
	// 있는 경우 - 기존 데이터 파일에서 데이터를 읽어서 ArrayList에 적용
	private void initDataFile() {
		System.out.println("initDataFile()");
		dataFile = new File(DATA_FILE);
		if(!dataFile.exists()) {
			System.out.println("파일이 없습나다");
			try {
				if(dataFile.createNewFile()) {
					System.out.println("파일 생성 성공");
				}else {
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("파일이 이미 존재 합니다.");
			
		}
		
	} // end initDataFile() --- 에러? 생길것 / 
	
	// TODO : 멤버 변수 list 객체를 data\contact.data 파일에 저장(쓰기)
	private void writeDataToFile(){
		System.out.println("writeDataToFile()");
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream(DATA_FILE);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			ContactDTO dto = new ContactDTO();
			list.add(dto);
			oout.writeObject(list);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end writeDataToFile()
	
	// TODO : data\contact.data 파일에서 ArrayList 객체를 읽어와
	// 멤버 변수 list에 저장(읽기)
	private void readDataFromFile() {
		System.out.println("readDataFromFile()");
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream(DATA_FILE);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			while(true) {
				try {
					ContactDTO dto = (ContactDTO) oin.readObject();
					System.out.println(dto);					
				} catch (Exception e) {
					break;
				}
			}
			
			System.out.println("데이터 출력 완료");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end readDataFromFile()
	
	public int getSize() {
		return list.size();
	}

	@Override
	public int insert(ContactDTO dto) {
		
		writeDataToFile();
		return 1;
	}

	@Override
	public ArrayList<ContactDTO> select() {
		readDataFromFile();
		return list;
	}

	@Override
	public ContactDTO select(int index) {
		return list.get(index);
	}

	@Override
	public int update(int index, ContactDTO dto) {
		list.get(index).setPhone(dto.getPhone());
		list.get(index).setEmail(dto.getEmail());
		return 1;
	}

	@Override
	public int delete(int index) {
		list.remove(index);
		return 1;
	}
	
	

} // end ContactDAOImple



