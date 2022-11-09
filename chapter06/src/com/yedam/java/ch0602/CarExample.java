package com.yedam.java.ch0602;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); 
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		//모든 자바프로젝트의 부모는 object 자손 class 
		//값을 주지 않을경우 타입에 따라 디폴드값으로 지정.
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		Car newCar = new Car();//값을 주지 않아 디폴드값.
		System.out.println("새로운 차의 현재속도 : " + newCar.speed);
		
		String str = new String("Con");
	}
}
