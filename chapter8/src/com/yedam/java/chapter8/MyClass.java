package com.yedam.java.chapter8;

public class MyClass {

	// 필드
	// 1)
	// public int a = 1;
	RemoteControl rc = new Television();

	// 생성자
	public MyClass() {

	}

	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
		// 하나의 선언문으로 다양한 객체만듬.
	}

	// 메소드

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	// 원하는 클래스를 넣어주어 넣어주는것에 따라 기능이 맞게 구현.
	// 아래으 ㅣ내용을 실행할수 o

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
