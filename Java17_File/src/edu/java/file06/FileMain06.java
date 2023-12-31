package edu.java.file06;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.java.file04.MemberDTO;

// 프로그램 ===> ObjectOutputStream ===> BufferedOutputStream ===> FileOuputStream ===> 파일(HDD)
public class FileMain06 {

	public static void main(String[] args) {
		System.out.println("ArrayList<Member> 객체를 파일에 저장하는 코드");
		
		OutputStream out = null;
		BufferedOutputStream bout = null; // 위아래 속도 차를 줄이기 위한 것
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("temp/list.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			long startTime = System.currentTimeMillis();
			List<MemberDTO> list = new ArrayList<>();
			for(int i = 0; i < 5000000; i++) {
				String id = "member" + i;
				String pw = "pw" + i;
				MemberDTO m = new MemberDTO(i, id, pw);
				list.add(m); // 리스트로 해야 형변환 없이 쓰기 편함
			}
			
			oout.writeObject(list);
			long endTime = System.currentTimeMillis();
			System.out.println("복사 경과 시간 : " + (endTime - startTime));
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
		

	} // end main()

} // end FileMain06





