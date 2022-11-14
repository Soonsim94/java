package com.yedam.java.chapter8_3;
//매개변수의 다형성을 확인.
public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vhc = new Bus(); //구현객체 하나만듦.
	
		vhc.run();
		//vhc.checkFare(); //자동타입변환의 선택때문에 오류.
	
		//강제 타입 변환 /자식에 정의해놓은 기능 쓰고싶을때.
		Bus bus2 = (Bus) vhc;
		//        변환하고자하는 클래스이름(Bus)
		bus2.run();
		bus2.checkFare();
		
		//객체 타입 확인
		//instanceof(어떤애를 참조하고있는지 확인할때)
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
	}
}
