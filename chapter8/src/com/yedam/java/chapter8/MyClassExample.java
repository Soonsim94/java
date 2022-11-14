package com.yedam.java.chapter8;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)-----");

		//RemoteConrol rc = new Television(); 첫번째rc의미 
		MyClass mc = new MyClass();
		mc.rc.turnOn();
		// mc(객체)아래엔 .rc를 찾고 안에 turnOn의 메소드를 찾아 쓸수있다.
		mc.rc.turnOff();
		
		
		System.out.println("2)-----");
		//RemoteConrol rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc가 오디오타입으로 바뀌고 아래 두가지 기능이 실행됨.
		//rc.turnOn
		//rc.setVolume
		
		
		System.out.println("3)-----");
		
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn()
		//rc.setVolume(5)
		
		
		System.out.println("4)-----");
		//RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		//rc.turnOn();
		//rc.turnOff();
		
	}
}
