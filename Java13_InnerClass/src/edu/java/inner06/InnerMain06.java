package edu.java.inner06;

interface personInterface{
	public abstract void showInfo();
	
	public abstract void hello();
} // end personInterface

class Person{
	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// 메소드
	public PersonInterface setAge(int age) {
		
		// 지역 클래스
		class PersonWithAge imeplenmts PersonInterface{
			private 
			
		
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
		personInterface instance = p.setAge(24);
		instance.showInfo();
		instance.hello();
		

	} // end main()

} // end InnerMain06
