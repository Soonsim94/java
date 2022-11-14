package com.yedam.java.chapter8_1;

public class WashingExample {
	public static void main(String[] args) {

		washing(new LGWashingMachine()); //밑에 만든 메소드 호출
		//개발코드를 수정하지 않으면서 객체교환이 가능.

	}

	public static void washing(WashingMachine wm) { //wm = LGWashingMachine
		wm.startBtn();
		System.out.println("세탁기 속도는" + wm.changeSpeed(3));
		wm.stoptBtn();
	}
	
	// 추상 클래스 vs 인터페이스
	
	// 추상클래스(extends) -> 필드, 생성자, 메소드 (상수를 받아서 씀)
	// : 자식은 하나의 부모만 생길수 있음. 
	// 부모내용 상속받아 쓰면서 오버라이딩 용도.
	
	// 인터페이스(implement) -> 상수, 추상 메소드
	// : 하나의 클래스 즉 내가 만들어놓은 것 상속을 여러개 걸수있음. implement 뒤에 여러가지 상속 받을수 있음.
	// 생성자가 없음. 바로 구현클래스를 객체로 만들어 씀. 부모클래스를 객체화 메모리로 만들지않고 바로 쓸수있음. 
}
