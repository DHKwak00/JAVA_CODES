package edu.java.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 곽동훈_HW5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름>");
		String name = sc.next();
		System.out.println("수학>");
		int math = sc.nextInt();
		System.out.println("영어>");
		int eng = sc.nextInt();
		
		// 데이터 저장
		OutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream("student.txt");
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			List<Student> list = new ArrayList<>();
			
			Student stu1 = new Student(name, math, eng);
			list.add(stu1);
			oout.writeObject(list);
			
			Student stu2 = new Student(name, math, eng);
			list.add(stu2);
			oout.writeObject(list);
			
			Student stu3 = new Student(name, math, eng);
			list.add(stu3);
			oout.writeObject(list);
			
			Student stu4 = new Student(name, math, eng);
			list.add(stu4);
			oout.writeObject(list);
			
			Student stu5 = new Student(name, math, eng);
			list.add(stu5);
			oout.writeObject(list);
			
			System.out.println("저장 완료");

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
		
		// 출력
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("student.txt");
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			ArrayList<Student> list = (ArrayList<Student>) oin.readObject();
			for(Student s : list) {
				System.out.println(s);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	} // end main()

} // end 곽동훈_HW5
