package com.yedam.java.ch01;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car(); // 생성자를 호출하는곳.
		System.out.println("최대 스피드 : " + car1.maxSpeed);
		System.out.println("색깔 : " + car1.color);
		car1.run();

		System.out.println();

		Car car2 = new Car();
		System.out.println("최대 스피드 : " + car2.maxSpeed);
		System.out.println("색깔 : " + car2.color);
		car2.run();

		System.out.println(); 
		
		//new연산자는 = 새로운 클래스를 만들어냄. 
		// 똑같은 클래스를 기반으로 만들어졌으나, 서로 다른 객체(존재)
		if (car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		} else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		} //동일한 클래스에서 메소드를 통해 나온 객체(힙의 인스턴스)는 개별적인 존재.
		  //인스턴스가 만들어지고나서는 독립적인 존재로 사용가능. ex)부모님에게서 태어난 나. 태어난후부터는 많은 과정을 통해 변화.
		  
	}

}
