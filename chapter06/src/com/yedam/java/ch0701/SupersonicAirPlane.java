package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) { // 부모 메소드 호출. /자식 클래스 내부 > 부모클래스 메소드 호출
			// 부모클래스에서 내용 바꿔주면 자동으로 두 클래스의 내용이 바뀜.
			System.out.println("초음속 비행 모드입니다.");
		} else {
			super.fly();
		}
	}
	
	public void test() {
		super.fly();
	}

}
