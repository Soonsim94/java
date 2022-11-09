package com.yedam.java.ch0604;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//// 내부메소드 호출
	double avg(int x, int y){
		int sum = plus(x, y);
		double result = sum / 2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : " + result);
	} //메소드는 각각의 단위가 최소로 되어야한다. 
	  //ex)공학용계산기 : 기초를 만들어 이를 기반으로 메소드를 분리시켜 재사용을 한다.
	  //공통되는 개념은 하나의 메소드로 모으고, 필요한 여러개의 메소드를 호출시켜 조합. 
	
	void println(String message) {
		System.out.println(message);
	}
	
	//사각형의 넓이 구하기. 
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
	
}
