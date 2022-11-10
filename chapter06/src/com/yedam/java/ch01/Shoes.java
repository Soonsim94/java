package com.yedam.java.ch01;

public class Shoes {
	
	static int totalCount;
	int running;
	int slipper;
	int mule;
	
	void makeRunning() {
		running += 1;
	}
	void makeSlipper() {
		slipper += 1;
	}
	void makeMule() {
		mule += 1;
	}
	void getCount() { //몇켤레 만들었는지 확인할수있는 메소드.
		totalCount = running + slipper + mule;
	}
}
