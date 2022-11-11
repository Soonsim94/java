package com.yedam.java.ch0701_2;

public class Application2 {
	public static void main(String[] args) {

		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire KTire = new KumhoTire("left", 20);
		
		
		//상속 > 오버라이딩 > 결과
		// 하나의 타입으로 다양한 결과가 나오는것 -> 다형성
		
		// Tire 객체에 자식 객체인 hTire
		// tire -> 한국 타이어를 사용하고 있다.
		Tire tire = hTire; 
		System.out.println(tire.roll());
		//한국타이어 타이어에 대입 한국타이어 출력 		
		tire = KTire;
		System.out.println(tire.roll());
		//금호타이어 타이어에 대입 금호타이어 출력 
		tire = hTire;
		System.out.println(tire.roll());
		
	}
}
