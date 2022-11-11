package com.yedam.java.ch0701_2;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C(); 
		//c -> b 상속관계 
		//b -> a 상속관계
		//c -> b -> a 상속관계
		//손자 / 아빠/ 할버지 
		
		
		A a1 = b;
		A a2 = c;
	}

}
