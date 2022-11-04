package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value); //가진 값 그대로 출력
		System.out.printf("상품의 가격 : %6d원\n", value); //6 값을 주면 총 6자리로 표기하겠다.   
		System.out.printf("상품의 가격 : %-6d원\n", value); // 오른쪽에 빈자리는 - / -6번 오른쪽 빈자리를 두겠다란뜻.    
		System.out.printf("상품의 가격 : %06d원\n", value); // 왼쪽 빈자리는 06
	
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
	
		
		Scanner sc = new Scanner(System.in);  //ctrl+스페이스+o
		
//		String str = sc.next(); //키보드를 치는 그순간까지 한줄로 인식./ 무조건 단독으로 써야함. 이유는 기준이 다르다. 
		// 넥스트라인은 엔터까지 읽어들임. / 넥스트 인트, 넥스트더블은 엔터를 읽어들이지 않음. 
		// 넥스트 라인과 넥스트는 같이 쓰면 안됨. 
//		// 한줄에 입력값 여러개는 넥스트 / 각각은 넥스트라인 //
//		int x = sc.nextInt(); 
//		int y = sc.nextInt();
//		System.out.println("입력:" + (x+y)); //입력 메시지.
		
		
//		System.out.print("첫번째:" );
//		String x = sc.nextLine();
//		System.out.print("두번째:" );
//		String y = sc.nextLine();
//		int result = Integer.parseInt(x) + Integer.parseInt(y);
//		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열 : %s\n", inputData);
			if(inputData.equals("끝")) {
				break;
			}
		}
		System.out.println("종료");
	}
}

//git 관련 작업 추가 
