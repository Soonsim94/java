package com.yedam.java.ch01;

public class ConstantNo {

	//필드
	static final double PI = 3.14;  //굳이 인스턴스를 만들지 않고도 지정된 값을 줄수 있음. final
	static final int earthRound = 46250;
	static final int lightSpeed = 127000;
	//두개의 합성어 필드는 = 대문자, 가운데 카멜언어
	
	String words = "This is Java";
	char word = 'Y';
	//생성자
	
	// static 메소드
	// static 멤버에 사용 범위(scope)
	static void getCircle(int radius) {
		//원 넓이 구하기. pi * r* r
		System.out.println("원 넓이 : " + 
		(PI*radius*radius));
	}
	
	//메소드에 static 필드 호출.
	public void allDate() {
		double result = PI + earthRound + lightSpeed;
		System.out.println(result);
		getCircle(1);
		
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
		//String getWord = words + String.valueOf(word);//word -> 힙 영역에 있는 애들(기본,참조타입)은 static영역 접근할수 없음.
														
	}
}
