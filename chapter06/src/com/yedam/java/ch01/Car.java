package com.yedam.java.ch01;
//하나의 필드에는 하나의 클래스를 가진다. 
public class Car {
		//필드 : 속성
		int maxSpeed = 100;
		String color= "red";
		
		//생성자 / 생성자는 클래스와 이름이 같다, 리턴값 존재x 
		public Car() {
				System.out.println("자동차가 출하되었습니다.");
		}
		
		//메소드 : 동작 / 본인의 이름이 존재, 리턴값이 필요. (리턴값 필수적은아님)
		public void run() {
			System.out.println("자동차가 동작 중 입니다.");
		}
		
		
}
