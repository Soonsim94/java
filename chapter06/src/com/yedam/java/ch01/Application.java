package com.yedam.java.ch01;

public class Application {
	
	//필드
	int staticTest = 0;
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.staticTest =2;
		
		Shoes shoes  = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
	//------------------------------------------//	
		System.out.println(Shoes.totalCount);
		//인스턴트화 하면 static에 일반필드, 메소드 사용가능.
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.word);
		//인스턴트안만들고 사용가능.
		System.out.println(ConstantNo.earthRound);
		

	}
}
