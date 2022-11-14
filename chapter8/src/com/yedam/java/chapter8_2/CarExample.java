package com.yedam.java.chapter8_2;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run(); //넥센타이어재정의된 내용 출력
		
		System.out.println("#############");
		
		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();
		//앞바퀴 첫번째,두번째 미쉐린으로 교체 
		
		myCar.run();
		//뒷바퀴 세번째, 네번째 넥센 그대로 
		
	}
}
