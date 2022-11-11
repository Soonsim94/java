package com.yedam.java.ch0701_2;

public class Application3 {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			//왼쪽: 내가 쓸 객체 instanceof 오른쪽: 내가 비교할 타입
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child 변환 성공");
	}
	
	public static void main(String[] args) {
	
		Parent parentA = new Child();
		method1(parentA); //자동타입변환
		
		Parent parentB = new Parent();
		method2(parentB); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Driver driver = new Driver();
		
		
		//bus, taxi -> vehicle 부모클래스
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		
		driver.drive(bus);
		
		driver.drive(taxi);
		
//----------------------------------------------------------------//
		
		
		Animal animal = null;   //animal 클래스 //cat,dog 객체 
		
		animal = new Cat();
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		
		//동물이라는 큰 클래스 지정 
		// 고양이, 강아지에 공통적인 기능 메서드를 넣어준다.
		// 그것을 상속받아 각각 짖는소리로 변환시켜 나옴. 이것이 오버라이딩. 
		// 하나의 객체로 다양한 객체를 만들어 사용하는것. 이것이 다형성.

		
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "child";
		//parent.method3();
		
		//Casting 
		//부모타입안의 객체를 강제로 자식객체로 변경 
		Child child = (Child)parent;
	
		child.field2 = "parent";
		child.method3();
		
		child.field2 = "parent";
	}
}



