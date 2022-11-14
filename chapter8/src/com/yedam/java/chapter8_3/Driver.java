package com.yedam.java.chapter8_3;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) { //너는 버스가 맞느냐? 
			Bus bus = (Bus) vehicle; //강제타입변환.
			bus.checkFare(); //체크페어 내용실행. 
		}
		vehicle.run();  //어떤변수가 들어오는지에 따라 다양하게 변한다. 매개변수의 다형성.
		
		
	}
}
