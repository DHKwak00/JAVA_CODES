package edu.java.inherit02;

public class InheritMain02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		Person p2 = new Person("구트");
		
		System.out.println("=====================");
		BusinessPerson p3 = new BusinessPerson();
		
		System.out.println("=====================");
		BusinessPerson p4 = new BusinessPerson("구글");

	} // end main()

} // end InheritMain02
