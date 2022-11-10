package com.yedam.java.ch01;

public class Person {
	
	
	final String nation = "korea"; 
	final String ssn; //final연산자는 고정시킴. 변경x
	String name; //이름을 언제든 바꿀수있게 final을 넣지않음.
	
	public Person(String ssn, String name) {
		this.ssn = ssn;  //한번 정의된 값은 수정x
		this.name = name; 
		
	}
	
}
