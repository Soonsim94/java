package com.yedam.java.ch0701_2;

public class HankookTire extends Tire{
	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명"+
			(maxRotation-accRotation ) + "회");
			return true;
		}else {
			System.out.println("###" + location + "HankookTire펑크 ###");
			return false;
		}
	}

}
