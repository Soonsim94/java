package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		// 한줄주석! 2022년 11월 03일
		/* 여러줄 
		 * 주석! */
		
		int value1 = 15;
		
		if(value1 > 10 ) {
			int value2;
			value2 = value1 - 10;
		}
		
		int result = value1 + value2 + 5;
		
		System.out.println(value1 +"," + value2 + "," + result);
		
		/***/
		
		int v1 = 0;
		if(v1 == 0) {
			v1 = 1;
		int v2 = 0;
		if(v2 == 0) {
			v2 = 2;
			int v3 = v1 +v2;
			System.out.println(v1 + "+" + v2 + "+" + v3);
		}
		System.out.println(v1 + "+" + v2 + "+" + v3);
	}
	System.out.println(v1 + "+" + v2 + "+" + v3);
	//위치에 따라 사용할수 있는 범위가 달라짐. 중괄호범위 추측가능해야함.
	
	}
}
	

