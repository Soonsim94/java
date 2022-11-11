package com.yedam.java.ch0701;

import com.yedam.java.ch0701_1. Parent;

public class Child_2 extends Parent{

	//필드
	
	//생성자
	
	//메소드
	
	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age);
	}
	//디폴트로 정의된 아이는 다른 패키지에서 사용할수 x
	//하지만 protected를 사용하면 부모필드 사용가능.
	//public을 써주면 사용가능해진다.  
	
	
}
