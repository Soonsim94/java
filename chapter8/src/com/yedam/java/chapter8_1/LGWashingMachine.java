package com.yedam.java.chapter8_1;

public class LGWashingMachine implements WashingMachine {

	@Override
	public void startBtn() {
		System.out.println("세탁기가 빨래를 시작해요.");

	}

	@Override
	public void pauseBtn() {
		System.out.println("세탁기가 빨래를 일시중지해요.");

	}

	@Override
	public void stoptBtn() {
		System.out.println("세탁기가 빨래를 중지해요.");

	}

	@Override
	public int changeSpeed(int speed) {
		switch (speed) {
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;

	}
}
