package com.yedam.java.ch01;

public class Game {
	
	// 필드
	// 객체(인스턴스화)가 된다. = 인스턴스 필드. 
	String gameName = "마인크래프트";
	//인스턴스를 만들지않고 사용할수 있게 해주는것이 static
	//static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;

	// 생성자 : Game 이라는 클래스의 이름을 가진 생성자를 꼭!만들어주야함.
	public Game() {

	}

	public Game(String id) { // String id 매개변수. 타입에 따라 같은이름이라도 서로 다른 객체로 인식.
		this.id = id; // id라는 필드에 데이터를 넣음.
	}

	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}

	// 메소드 / 인스턴스 메소드 
	void getInfo() {
		System.out.println("GameName : " + gameName);
		System.out.println("id : " + id);
		System.out.println("password : " + passWd);
	}
}
