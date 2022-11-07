package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// 배열을 선언 -> 모든 타입을 값으로 가질 수 있음. 
		
		//클래스 테스트
//		User user = new User();
//		user.name = "홍길동"; //값을 개별적으로 주어야함. 
//		user.age = 25 ;
//		user.height = 175.7;
		
		int[] intAry = null;
		//System.out.println("intAry[0] : " + intAry[0]);
		
		// 값을 초기화하면서 배열을 생성. 
		int[] scores = { 83, 90, 87 }; //배열로 선언했지만 객체처럼 보이는 이유 
		
		System.out.println("scroes[0]: " + scores[0]);
		System.out.println("scroes[1]: " + scores[1]);
		System.out.println("scroes[2]: " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		
		//주의사항
		int[] scoreList;
		scoreList = new int[] {83, 90, 87}; //변수를 사용하고 나서 후에 사용하고 있음.
	}			
}
