package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import edu.java.file04.MemberDTO;

public class FileMain07 {

	public static void main(String[] args) {
		System.out.println("데이터 파일을 읽어서 ArrayList의 내용 출력");
		
		// 팁) 저장하는거 반대로 해라 
		
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("temp/list.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			ArrayList<MemberDTO> list = (ArrayList<MemberDTO>) oin.readObject();
			
			for(MemberDTO m : list) { // 꺼내기
				System.out.println(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end FileMain07
