package com.yedam.java.chapter8;

public class Television implements RemoteControl, Search {
	// 오버라이딩하라고 빨간 밑줄 뜸.

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) { // 볼륨이 0보다 작은 숫자가 들어오면
			this.volume = RemoteControl.MIN_VOLUME; // 무조건 볼륨은 0으로 유지시켜준다.
		} else {
			this.volume = volume;
		}

		System.out.println("현재 TV 볼륨 : " + this.volume);

	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

}
