package com.yedam.java.ch1101_3;

import java.io.UnsupportedEncodingException;

public class Example {
	public static void main(String[] args) {

		// 1)문자열 뒤집기 - 입력되는 문자열을 뒤집어서 출력
		// ex) input : abc output : cba

//		String str = "abc";
//		
//		String reverse = "";
//		for(int i=str.length() -1; i>=0; i--) {
//			reverse = reverse + str.charAt(i);
//		}
//		
//		System.out.println(reverse);
		
		String str = "abc";
		char ch;
		for(int i=str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		
		
		// 2)문자열 개수 세기 - 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기.
		// ex) input : 1a2v4b , output : 숫자3개, 영어3개
		
		
		
				byte[] bytes2 = null;
				String str2 = "1a2v4b";
				bytes2 = str2.getBytes();
				int num = 0;
				int eng = 0;
				
				for(int i=0; i<bytes2.length; i++) {
					if(bytes2[i]>=48 && bytes2[i]<=57) {
						num++;
					}
					if(bytes2[i]>=97 && bytes2[i]<=122) {
						eng++;
					}
					
				}System.out.println("숫자"+num+"개"+"영어"+eng+"개");
				
				
		
		// 3)입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성.
		// -조건- 
		//금년 기준으로 100년이 넘어간 경우는 제외한다. 또한 생일은 신경쓰지 않는다.
		//(221114 -> 1922년 11월 14일 x, 2022년 11월 14일 o)
		//ex) input : 000510, output : 21살
		
				
		

	}
}
