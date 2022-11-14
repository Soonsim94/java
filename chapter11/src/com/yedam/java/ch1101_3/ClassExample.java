package com.yedam.java.ch1101_3;

import com.yedam.java.ch1101_1.Key;

//class의 정보를 가져올때 쓰는것.
public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Key 클래스 객체 가져오기// 
		
		
		// 1탄 - 직접 클래스 객체 가져오기
		Class clazz = Key.class;
		//key클래스는 명확히 가져오는 방법.
		System.out.println(clazz);
		
		//2탄 - 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.java.ch1101_1.Key");
		System.out.println(clazz2);
		
		//3탄 - 객체로부터 클래스 객체 얻기
		Key key = new Key(1);
		
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		//데이터를 기준으로 경로를 찾아내는 구문. /key안의 폴더내 파일을 찾아줌.
		String photoPath = clazz.getResource("Ann.jpg").getPath();
		
		System.out.println(photoPath);
		
	}
}
