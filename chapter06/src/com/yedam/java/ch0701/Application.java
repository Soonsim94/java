package com.yedam.java.ch0701;

//자식클래스를 인스턴스화 하여 
public class Application {
	public static void main(String[] args) {
		
//		
//		Child_1 child = new Child_1();
//		
//		//자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//		
//		//부모 클래스 고유 필드
//		System.out.println(child.firstName + child.lastName);
//	
//		//부모 ->  여러명의 자식 가질수 있음 ㅇ. 
//		//자식 -> 여러명의 부모 섬길수 없음 x.
//		// 하나의 부모 : 같은 필드에 무엇을 적용할지 모르니 하나만 상속가능.
//		//private로 설정한 부모필든느 상속이 안된다.
//		
//		//부모 클래스 필드 사용
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰","화이트",10);
//		
//		System.out.println("모델 :" + dmb.model);
//		System.out.println("색상 :" + dmb.color);
//		
//		//자식 클래스 필드 사용
//		System.out.println("채널 :" + dmb.channel);
//		
//		//부모 클래스 메소드 사용 
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
//		dmb.powerOff();
//		
//		//자식 클래스 메소드 사용 
//		dmb.turnOnDmb();
//		
//		Member member = new Member("고길동","123123-456456",1);
//		
//		//부모객체의 필드 사용
//		System.out.println("name: " + member.name);
//		System.out.println("ssn: " + member.ssn);
//
//		//자식객체의 필드 사용
//		System.out.println("memberNo: " + member.stdNo);
//		
		
//		Child cd = new Child();
//		
//		cd.method1();
//		cd.method2();
//		cd.method3();
//		
		
		Compute com = new Compute();
		
		double result = com.areaCircle(10);
		System.out.println("result: " + result);
		
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
		Child chd = new Child();
		//Parent parent = new Child(); -> 자동타입변환
		//부모 클래스에 있는 필드, 메소드를 사용하되 
		//만약 자식클래스에 오버라이딩이 되어있는 메소드가 존재한다면, 
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드
		Parent parent = chd;
		
		parent.method1();
		parent.method2();
		//parent.method3();
		
		
		
		
	}
}
