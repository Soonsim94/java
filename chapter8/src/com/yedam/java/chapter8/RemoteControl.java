package com.yedam.java.chapter8;

public interface RemoteControl {
	
	//상수
	//public static final PI = 3.14;
	//추상메소드
	//public void method1();
	
	//기본 설계도 
	//대규모 프로젝트 -> 번역 
	//A : 영어 -> 한글 ( 메소드 : 번역 ) 
	//B : 영어 -> 일본어 ( 메소드 : method1())
	//C : 영어 -> 중국어 ( 메소드 : method2())
	//같은 이름이지만, 다른내용으로 기능을 만들수 있다. 
	
	//프로젝트 완료 
	//똑같은 메소드 이름으로 구현 
	
	//public static final int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드 
	//public abstract void turnOn();
	public void turnOn(); // public abstract (생략되어있음.) void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	//기본적으로 이렇게 구현하라고 알려주는것. 
	//상속받는아이를 구현객체, 객체를 만들때 만드는 자식클래스
	
	//인터페이스는 자기자신이 객체가 될수없어 객체를 가져와 쓴다.
	
	
}
