package com.yedam.java.ch01;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone();
		
		

		
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + " 입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name + " 입니다.");
		
		iphone14Pro.call();
		iphone14Pro.hangup();
		
		System.out.println();
		
		SmartPhone zflip4 = new SmartPhone();
		System.out.println("객체생성했을때 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name);
		
		zflip4.name = "zfilp4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangup();
		
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
		
		//com.yedam.java.ch0604.SmartPhone '@5aaa6d82' <- 객체가 담긴 주소(메모리) 
		//배열도 참조타입. 공간을 할당할때 주는것이 new연산자. 
		
		
	}
}
