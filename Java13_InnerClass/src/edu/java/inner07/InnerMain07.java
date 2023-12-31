package edu.java.inner07; // ************************** 중요 *************************

interface Hello{ // 인스턴스 생성 불가능 함
	public abstract void hello();
} // end Hello

class Person implements Hello {

	@Override
	public void hello() { // 이렇게 오버라이드 해서 해야 가능
		System.out.println("안녕?");
		
	}
	
} // end person

class Dog implements Hello {

	@Override
	public void hello() {
		System.out.println("멍멍?");
		
	}
	
} // end Dog

public class InnerMain07 {

	public static void main(String[] args) {
		Person p1 = new Person(); // 원래 형태1
		p1.hello();
		
		Hello p2 = new Person(); // 원래 형태2
		p2.hello();
		
		Hello dog = new Dog(); // 원래 형태3
		dog.hello();
		
		// 코드가 길다!
		Hello cat = new Hello() {
			@Override
			public void hello() {
				System.out.println("야옹~");
			}
		};
		cat.hello();
		
		// new Hello() {본체}
		// 본체 : Hello interface를 구현하는 클래스의 내용(객체)
		
		// * 익명 클래스를 사용하는 이유
		// - 인터페이스의 메소드가 한 개인 경우,
		//	 클래스 외부에서 선언하여 implements하지 않고 사용하기 위해
		// - 익명 클래스를 사용하면 클래스를 외부에서 생성할 필요가 없음
		// - 객체를 한 번 생성하고 더 이상 생성하지 않을 경우 사용
		
		
		

	} // end main()

} // end InnerMain07








