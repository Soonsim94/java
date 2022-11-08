package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// 배열을 선언 -> 모든 타입을 값으로 가질 수 있음.

		// 클래스 테스트
//		User user = new User();
//		user.name = "홍길동"; //값을 개별적으로 주어야함. 
//		user.age = 25 ;
//		user.height = 175.7;

		int[] intAry = null;
		// System.out.println("intAry[0] : " + intAry[0]);

		// 값을 초기화하면서 배열을 생성.
		int[] scores = { 83, 90, 87 };
		// 배열로 선언했지만 객체처럼 보이는 이유
		// 왼쪽부터 순차적으로 0부터 순번이 주어짐.

		System.out.println("scroes[0]: " + scores[0]);
		System.out.println("scroes[1]: " + scores[1]);
		System.out.println("scroes[2]: " + scores[2]);
		// index의 특성으로 인해 for문과 많이 쓰임.

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}

		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);

		// 주의사항
		int[] scoreList;
		scoreList = new int[] { 83, 90, 87 }; // 변수를 사용하고 나서 후에 사용하고 있음.
		// scoreList = {83, 90, 87}; <- 이렇게는 값을 주지 못함. 객체를 생성하지 못하기 때문에.
		// 모든 클래스는 'new' 라는 생성자를 호출해야함.

//		sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum = sum + scoreList[i];
//		}
//		System.out.println("총합 : " + sum);
//
//		sum = add(new int[] { 83, 90, 87 });
//		
//		int add(int[] numList) {
//			for(int i=0; i<numList.length; i++) {
//				sum += numList[i];
//			}
//			return sum;

		// new 연산자로 배열 생성
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("array[" + i + "] : " + array[i]);

		}

		String[] strAry = new String[4];
		for (int i = 0; i < strAry.length; i++) {
			strAry[i] = String.valueOf(i);
		}
		for(int i=0; i<strAry.length; i++) {
			System.out.println("strAry["+i+"] "+strAry[i]);
		}
		
		sum = add2(new int[] {83, 90, 87});
		System.out.println("총합: "+sum);
	}
	
	static int add2(int[] numList) {
		int sum =0;
		for(int i=0; i<numList.length; i++) {
			sum+=numList[i];
		}
		return sum;
	}
}
