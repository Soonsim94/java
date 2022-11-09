package com.yedam.java.ch0603;

public class MainExample {
	public static void main(String[] args) {

		Car myCar = new Car("모닝", "하늘색");
		System.out.println("제조회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		
		Car newCar = new Car();
		//이미 생성자가 있을경우, 새로운 생성자를 만들수 없음. 
		// 자바가 기본 생성자를 만들어주는 경우는 : 클래스 어디에도 생성자가 없을때! 하나라도 있으면 자바가 만들어주지 않음. 
		//두개를 만들고 싶다면, 생성자를 추가해야함.
		System.out.println("제조회사 : " + newCar.company);
		System.out.println("모델명 : " + newCar.model);
		System.out.println("색깔 : " + newCar.color);
		
		Car subCar = new Car("아이오닉","하얀색");
		System.out.println("제조회사:" + subCar.company);
		System.out.println("모델명:" + subCar.model);
		System.out.println("색깔:" + subCar.color);
	}
}