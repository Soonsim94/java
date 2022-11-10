package com.yedam.java.ch0605;

public class Singleton {

	// 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법.
	// private static Singleton singleton = new Singleton(); //단 하나의 객체.
	private static Singleton singleton = null;

	// 아무도 접근하지 못하는//
	private Singleton() {

	}

	public static Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
		}else {
			return singleton;
		
		}

	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}

	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}
}
