package edu.java.inner06;

interface PersonInterface{
	public abstract void showInfo();
	
	public abstract void hello();
} // end personInterface

class Person{
	// 멤버 변
	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// 메소드
	public PersonInterface setAge(int age) {
		
		// 지역 클래스
		class PersonWithAge implements PersonInterface{
			private int age; // 지역 클래스의 멤버 변수
			
			public PersonWithAge (int age) {
				this.age = age;
			}

			@Override
			public void showInfo() {
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				
			}

			@Override
			public void hello() {
				System.out.println("안녕하세요!");
				
			}
			
		} // end PersonWithAge
		
		// 지역 클래스 객체(내용)을 모두 저장
		PersonWithAge instance = new PersonWithAge(age);
		
		// 지역 클래스 객체(내용)을 리턴
		return instance;
		
	} // end setAge()
	
} // end Person
public class InnerMain06 {

	public static void main(String[] args) {
		Person p = new Person("목쌤");
		PersonInterface instance = p.setAge(24);
		instance.showInfo();
		instance.hello();
		

	} // end main()

} // end InnerMain06
