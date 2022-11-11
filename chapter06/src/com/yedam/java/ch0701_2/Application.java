package com.yedam.java.ch0701_2;

public class Application {
	public static void main(String[] args) {
	 
		
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemTire = car.run();
		
			switch(problemTire) {
			
			case 0:
				System.out.println("4짝이 다 멀쩡합니다. ");
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				//frontLeftTire -> Tire
				//frontLeftTire 펑크 
				//자식클래스인 한국타이어로 교체 원츄 
				//한국타이어 교체 ( 마침 규격에 맞는 한국타이어 있어서) -> 부모클래스에서 오버라이딩한 내용을 바꿔 끼우게 되는것이다.
				//자동타입변환으로 인해 가능한 타이어 교체.
				
				//HankookTire = new HankookTire("앞왼쪽",15);
				//car.frontLeftTire   //위의 두줄이 = 아래의 한줄
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRigthtTire = new HankookTire("앞왼쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 KumhoTire 교체");
				car.backLeftTire = new HankookTire("앞왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new HankookTire("앞왼쪽",17);
				break;

			}
			System.out.println("=================================");
		}
	}

}
