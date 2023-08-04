package edu.java.contact05A;

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
	
	// 1. TODO : data 폴더가 있는지 검사하고, 없으면 생성하는 함수 (File 8번)
	private void initDataDir() { // init : 초기화
		System.out.println("initDataDir()");// 로그 남기기 (각 매소드에 찍어주기)
		dataDir = new File(DATA_DIR);
		System.out.println("폴더 경로 : " + dataDir.getPath());
		
		if(!dataDir.exists()) { // 폴더가 없으면 (exists로 폴더 있는지 없는지 확인)
			System.out.println("폴더가 없습나다");
			if(dataDir.mkdirs()) {
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("폴더 생성 실패");
			}
		}else { // 폴더가 없으면
			System.out.println("폴더가 이미 존재 합니다.");
		}
	} // end initDataDir()
	
	// 2. TODO : 데이터 파일이 존재하는지 검사하고,
	// 없는 경우 - 새로운 데이터 파일 생성
	// 3-2. 있는 경우 - 기존 데이터 파일에서 데이터를 읽어서 ArrayList에 적용 ***** 못함 복습시 체크
	private void initDataFile() {
		System.out.println("initDataFile()");
		String filePath = DATA_DIR + File.separator + DATA_FILE; // <== 왜?
		dataFile = new File(filePath);
		
		if(!dataFile.exists()) {
			System.out.println("파일이 없습니다");
			
			try {
				if(dataFile.createNewFile()) {
					System.out.println("파일 생성 성공");
				}else {
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("파일이 이미 존재 합니다.");
			System.out.println("데이터 크기 : " + dataFile.length());
			if(dataFile.length() !=0) {
				readDataFromFile(); // ****** 데이터가 없는 경우 어떻게 알 수 있나?
			}
		}
	} // end initDataFile() --- 에러? 생길것 / 
	
	// 4. TODO : 멤버 변수 list 객체를 data\contact.data 파일에 저장(쓰기) (File 6번)
	private void writeDataToFile(){
		System.out.println("writeDataToFile()");
		
		OutputStream out = null;
		BufferedOutputStream bout = null; // 위아래 속도 차를 줄이기 위한 것
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream(dataFile);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(list);
			
			System.out.println("데이터 저장 완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end writeDataToFile()
	
	// 3. TODO : data\contact.data 파일에서 ArrayList 객체를 읽어와 (과제 5번, File 7번)
	// 멤버 변수 list에 저장(읽기)
	private void readDataFromFile() {
		System.out.println("readDataFromFile()");
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream(dataFile); // 왜 위에는 선언에 null 값인데?
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			list = (ArrayList<ContactDTO>) oin.readObject();
			System.out.println("데이터 읽기 완료");
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end readDataFromFile()
	
	public int getSize() {
		return list.size();
	}

	@Override
	public int insert(ContactDTO dto) {
		list.add(dto);
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
		writeDataToFile();
		return 1;
	}

	@Override
	public int delete(int index) {
		list.remove(index);
		writeDataToFile();
		return 1;
	}
	
	

} // end ContactDAOImple



