package com.yedam.java.Example;

import java.util.Scanner;

public class Application {

	// 배열
	int[] ary = new int[6];
	// 배열 진화
	// 클래스[] ary2 = new 클래스[6];
	// 2차원 배열과 같음.

//	//엔터 전까지 동작.엔터값빼고 데이터 값 다 가져감. 
//	sc.next();
//	//엔터기준으로 동작. 엔터값 읽음.
//	sc.nextLine();
//	

	public static void main(String[] args) {
		// 은행 고객 정보를 입력하는 프로그램

		Scanner sc = new Scanner(System.in);

		while (true) {

			// 회원 수를 입력받아서 배열의 크기 지정.
			System.out.println("회원의 수>");
			int count = Integer.parseInt(sc.nextLine());
			// 넣은 데이터를 가지고 배열의 크기를 넣어줌.
			Bank[] Bary = new Bank[count];
			// 배열안에 또 한번더 들어가서 데이터가 있음. = 2차원배열.

			// 배열 크기만큼 반복문을 실행.
			// 회원 정보를 객체에 담아서 저장함.
			for (int i = 0; i < Bary.length; i++) {

				// Bank bank = new Bank();
				// for문 위에 위치하면 덮어쓰기 덮어쓰기 하여 맨마지막 데이터만 남게된다.
				// for문 바로 아래 위치 서로다른 객체가 만들어지며 저장됨.

				// 빈 깡통과 같은 상태. (데이터 넣기 전)
				Bank bank = new Bank();

				// 1. 계좌 번호 입력.
				System.out.println("계좌 번호>");
				int account = Integer.parseInt(sc.nextLine());
				bank.setAccount(account);

				// 2. 은행 이름 입력.
				System.out.println("은행 입력>");
				String bName = sc.nextLine();
				bank.setBank(bName);

				// 3. 예금.
				System.out.println("금액 설정>");
				int money = Integer.parseInt(sc.nextLine());
				bank.setMoney(money);

				// 4. 고객 이름 입력.
				System.out.println("고객이름>");
				String name = sc.nextLine();
				bank.setName(name);
				// 한명의 정보가 아닌 여러명의 정보를 보기위해.
				// --------------------------------
				// bank 객체( 계좌번호, 은행이름, 예금, 고객이름) 꽉찬 깡통!

				// 데이터를 각방의 위치에 넣어주는 작업.
				Bary[i] = bank; // 아주 중요.
			}
			for (int i = 0; i < Bary.length; i++) {
				Bary[i].getInfo();
			}

		}
		

			
		}
	public void showMenu() {
		System.out.println("================================");
		
	}
}
