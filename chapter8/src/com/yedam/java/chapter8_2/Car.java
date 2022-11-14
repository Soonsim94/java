package com.yedam.java.chapter8_2;

public class Car {

	
	Tire frontLeftTire = new NaxonTire();
	Tire frontRightTire = new NaxonTire();
	Tire backLeftTire = new NaxonTire();
	Tire backRightTire = new NaxonTire();


	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
}
