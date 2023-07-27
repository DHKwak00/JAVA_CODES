package edu.java.collection02;

import java.util.ArrayList;

class Student {
	// 멤버 변수
	private int stuNo;
	private String name;
	
	public Student() {}

	public Student(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + "]";
	}
	
	
	
	
	
} // end Student

public class ListMain02 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("test");
		
		// Student 타입을 지정한 ArrayList
		ArrayList<Student> list3 = new ArrayList<>();
		
		list3.add(new Student(1, "Kim"));
		// 같은 방법
		Student stu1 = new Student(2, "Park");
		list3.add(stu1);
		
		for(int i=0; i<list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		

	} // end main()

} // end ListMain02
