package com.yedam.java.chapter8;

public class RemoteExample {
	public static void main(String[] args) {

		// TV를 객체로 해서 만듦. **하나의 객체로 다양한 기능을 만드는 방법**(코드효율적,보기편함)
		RemoteControl rc = new Television();
		
		// 하나의 객체를 대입함으로 오버라이딩한 내용을 쓸수있음.
		// 상속받은 아이만 가지고 다양하게 활용해서 사용할수 있음.
		// RemoteControl이라는 인터페이스를 자기자신이 객체가 되지않기에 구현클래스new Television()를 가지고 rc가 생성이
		// 된다.

		//rc = new Audio(); // 하나의 객체로 변경.생성아님.

		rc.turnOn(); // 원하는 걸로 갈아끼우면서 원하는 기능을 실행할수있음. tv를 오디오로 갈아끼움.
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.search("google.com");
		//search.search("google.com");
		//쓰고싶은 기능이 있으면 하나 더 만들어야함.
		
		

		//쓰기,읽기,리스트 조회 기능시 주로 사용.
		
		//Television tv = new Television(); // **객체를 여러개 만드는 방법.** 

		//tv.turnOn();
		//tv.setVolume(11);
		
		
		
	}
}
