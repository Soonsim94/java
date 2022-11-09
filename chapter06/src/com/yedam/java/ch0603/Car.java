package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	//생성자, 메소드안에서만 정상작동.

	// 생성자
	public Car(String model, String color) {
		this.model = model; // this: 이 클래스로 생성되는 인스턴스를 갖는다. 모델이라는 값.
		this.color = color;
		//인스턴스를 생성하고 새로운 인스턴스를 대체.
		//클래스를 기반으로 생성된 인스턴스가 가진 값을 변경.

	}
	
	public Car() {}
}
