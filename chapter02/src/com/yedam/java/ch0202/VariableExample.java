package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		//byte var4 = 128;   //127 넘으면 오류남. 오류 : 인트가 바이트 타입으로 변환할수 없다. 
		//byte var5 = 100.0; //정수만 가능해서 오류남. 오류 : 타입이 맞지않다. 
		System.out.println(var1);
		//System.out.println(var5); 
		
		long var6 = 100000000000000L; //정수는 무조건 int / 명령어실행 > 값부터 인지 > 오류 : int가 아닌데 값이 잘못되었다 (int값 오류 먼저 실행하여서 변수 long까지 인식못함)
		long var7 = 1000000000; //int를 벗어나는 값에 한해서만 L을 붙임.
								//short는 허용범위가 짧아서 사용잘하지않음. 
		
		//char 타입
		char v1 = 65; //문자는 '' 구분해야함. 유니코드로 인식. 
		char v2 = '가'; //문자는 한글자만 담을 수 있음. 
		int v3 = v1; // 또다른 정수타입으 ㅣ값을 옮길수 있음.
		System.out.println(v1); //ln이 줄바꿈 
		System.out.println(v2);
		System.out.println(v3);
		
		// String 
		String name = "홍길동";   //객체임에도 값을 줄수있는 형태로 사용가능. 독특한 클래스.
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3)); 
		
		// char VS String
		char v4 = 'A';  // 공백도 인지를 하지만, ''로 사용해야함. 무조건 한글자만 입력가능. 
		String v5 = "A"; // ""로만 사용해야함. ''로 하면 오류. 공백,특수문자 입력가능. 
		
		String str1 = "누군가 \"안녕\"하면서 인사했다."; // 내부의 값으로 ""를 사용하고 싶다면 \ 사용하기.
		
		
		// float
		float num1 = 3.14F;  //float을 인지하려면 F를 붙여야함. 
		double num2 = 3.14; //  double은 그냥 들어감. 
		
		//똑같은 값을 주었을때 차이. 
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		//리터럴은 같으나, float이 들어가면서 값이 근접값으로 변함. 
		//정확하게 사용하려면 double을 사용하는것이 좋음. 
		System.out.println(varF);   
		System.out.println(varD);
		
		// boolean
		
		boolean stop = (1 > 2);   //표현식(1>2)을 근거로 참,거짓을 판단. 
		if(stop) {
			System.out.println("중지");
		}else {
			System.out.println("시작");
		}	
	}
	
}
