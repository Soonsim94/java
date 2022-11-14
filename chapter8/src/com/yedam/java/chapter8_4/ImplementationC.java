package com.yedam.java.chapter8_4;

public class ImplementationC implements InterfaceC{
	//C가 상속한 A,B의 메소드 다 재정의 해줘야함. 

	@Override 
	public void methodA() {
		System.out.println("methodA 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");
		
	}

}
