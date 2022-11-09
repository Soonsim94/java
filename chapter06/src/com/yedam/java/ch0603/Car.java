package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	// 생성자, 메소드안에서만 정상작동.

	// 생성자
	//public Car(String model, String color) {
		// this: 이 클래스로 생성되는 인스턴스를 갖는다. 모델이라는 값.(힙 인스턴스)
		// 인스턴스를 생성하고 새로운 인스턴스를 대체.
		// 클래스를 기반으로 생성된 인스턴스가 가진 값을 변경.
		// this가 붙으면 해당인스턴스가 가지고있는 필드입니다라는 뜻.
		//this.model = model;
		//this.color = color;
		// 생성자 오버로딩 상태
	

	// 첫줄에 this()필드가 채워져야 호출이 된다.
	// this - 필드
	// this() - 생성자
	// 두번째 생성자 생성.(임의로)
	public Car() {

	}
	// 세번째 생성자 생성.(임의로)
	public Car(String model) {
		// this.model = model;
		this(model, "은색", 250);
	}
	
	// 네번째 생성자 생성.(임의로)
	// this는 반드시 첫줄에만 호출이 가능.
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		// System.out.println("인스턴스를 생성했습니다."); //아무런 인스턴스가 없는 경우에는 필드를 호출할수 없음.
		// this(model, color, 250);//첫번째줄에 필드가 있어야함. 채워져야 호출이 도니ㅣ께
	}

	// 다섯번째 생성자 생성.(임의로)
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
