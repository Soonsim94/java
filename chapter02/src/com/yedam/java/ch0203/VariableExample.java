package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		/* 자동 타입 변환 */
		byte byteValue = 10;
		//char charValue = byteValue; // 범위가 좁음. 
		int intValue = byteValue;
		System.out.println("intValue:" + intValue );

		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue );
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	
		// 강제 타입 변환
		intValue = 44032;
		charValue = (char) intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(longValue);
		
		doubleValue = 3.14;    //실수->정수로 변환하면 소수점은 버릴수밖에 없음. 
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
		// 정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		//byte result2 = x + y;  //자바는 실행전 문법적으로 문제가 있는지 확인하기때문에 
								//x,y값이 어떤지 모름. 그래서 오류.
		int result2 = x + y;
		byte result3 = (byte)(x + y);  //위의 문법 쓰는방법.
		System.out.println(result2 + "," + result3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드:" + intResult); //A는 65로 인식, 유니코드도 숫자로 인식됨. 
		System.out.println("출력문자:" + (char)intResult); //A다음 문자 출력. 
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long longResult = value1 + value2 + value3;
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 = intV1 + doubleV1;  
		
		int intVar1 = 10;
		//int resultVar1 = intVar1/4; // 결과값 : 2 /정수라 소수점 사라짐. 
		double resultVar1 = intVar1/4.0; // 결과값 : 2.0 / 5는 사라짐.
		//소수점으로 나와야한다면 처음부터 실수값으로. 
		System.out.println("10/4 결과:" + resultVar1); //더블 -> 인트로 바뀌면 소수점이하 사라짐.
		
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1/y1; //나누기 할 때에 정수,실수로 인한 실수가 많이생김. 
		//정수 > 실수로 나오는 경우 
		System.out.println("1/2 결과 : " + result1);
		
		// 문자열 결합 
		
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";  //앞의 두수를 먼저 계산, 8은 문자. 숫자 12에 문자8을 붙임.
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;  //숫자10 문자 2,8
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8; //문자 10, 숫자 2,8(앞에 문자라 숫자를 문자열로 결합)
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8); //문자 10, 숫자 10 / ()괄호적용시 숫자계산 먼저적용.
		System.out.println(str4);
		
		// 기본타입 <-> String 
		
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		// 컴파일시 오류나지않으나, 실행시 오류남. 
		// 오류 : 숫자타입이 아닌데 진행시 나는 오류.
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23;
		System.out.println(strV4);
		
		
	}
}
