package edu.java.inherit06;

public class Car {
	// 멤버 변수
	private int fuel;

	// 생성자
	public Car() {
		super();
	}

	public Car(int fuel) {
		super();
		this.fuel = fuel;
	}

	// getter&setter
	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + "]";
	}
	
	public void display() {
		System.out.println("남은 연료 : " + fuel);
	}
}
