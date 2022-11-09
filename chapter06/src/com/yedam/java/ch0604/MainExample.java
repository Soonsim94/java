package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		//매개변수가 2개 선언된 상황이면 반드시 두개가 필요.
		//해당 매개변수의 타입에 맞춰 수를 넣어줘야함.
		int sumRes = myCalc.plus(5,6); //반환타입에 맞춰 변수선언. 
		//변수에 담는게 필수는 아니라 오류는 안남. 
		System.out.println("sum : " + sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide: " + diviRes); 
		
		//
		
		//변수 선언하고 '따로' 분리해서 값을 넘겨주는 방식.
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 : " + intResult1);
		
		//변수 선언하고 '동시에' 분리해서 값을 넘겨주는 방식.
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("intReslt2 : " + intResult2);
		
		
		int intResult3 = myCom.sum2(1,2,3);
		System.out.println("intReslt3 : " + intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5);
		System.out.println("intReslt4 : " + intResult4);
		
		//
		myCalc.execute();
		
		//정사각형 구하기
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20); //똑같은 값처럼 보여도 넘겨주는 값에따라 값이 달라짐.
	
		System.out.println("정사각형의 넓이 : " +result1);
		System.out.println("정사각형의 넓이 : " +result2);
	}
}
