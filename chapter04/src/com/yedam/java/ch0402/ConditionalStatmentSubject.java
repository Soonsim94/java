package com.yedam.java.ch0402;

public class ConditionalStatmentSubject {
	public static void main(String[] args) {

		// 트리 반대
		// * / 1번째줄, 공백3개, 별1개 > 총 문자 4개
		// ** / 2 / 2 / 1 > 총 문자 4개
		// *** / 3 / 1 / 3 > 총 문자 4개
		// **** / 4 / 0 / 4 > 총 문자 4개

		for (int i = 1; i <= 4; i++) { // 라인을 표시
			for (int j = 1; j <= 4; j++) { // 라인의 출력되는 문자수가 4개
				if (j <= (4 - i)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				 }
				}
				System.out.println();
			}

			// 문제1 ) p.161 5번
			// for문을 이용해서 다음과 같이 *를 출력하는 코드.
			// *
			// **
			// ***
			// ****
			// *****
//			String tree = "";
//			for (int i = 1; i <= 5; i++) {
//				tree += "*";
//				System.out.println(tree);
//			}
//
//			for (int i = 1; i <= 5; i++) { // line
//				for (int j = 1; j <= i; j++) { // "*" 출력
//					System.out.print("*"); // 한줄로 띄워주기. print
//				}
//				System.out.println();
//
//			}

			// 문제2) for문을 이용해서 1부터 100까지의 정수 중에서
			// 2의 배수가 아닌 숫자의 갯수를 구하세요.

//			int count = 0; // 변수 외부에 선언.
//
//			for (int i = 1; i <= 100; i++) {
//				if (i % 2 == 0) // 짝수인값은
//					continue; // 건너뛰고
//				count++; // 홀수의 값을 출력해라.
//			}
//			System.out.println(count);

			// p.161 4번문제
			// 문제3) 책 161페이지 4번
			// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해 중
			// 첫번째로 구해지는 값을 (x,y) 형태로 출력
			// 단, x와 y는 10 이하의 자연수 입니다.

//		int x;
//		int y;
//		for(x=1; x<=10; x++) {
//			for(y=1; y<=10; y++) {
//				if

			// 1) 중첩 for문, 2) x,y 는 1부터 10까지 정수
			Outter: for (int x = 1; x <= 10; x++) {
				for (int y = 1; y <= 10; y++) {
					if (4 * x + 5 * y == 60) {
						System.out.println(x + "," + y);
						break Outter;
					}
				}
			}

			// 문제4) do ~ while문과 Math.random() 함수를 이용.
			// 1~ 10 의 정수 중 7이라는 수가 나올때까지 숫자를 출력.

			int num = 0;
			do {
				num = (int) (Math.random() * 10) + 1;
				System.out.println(num);
			} while (num != 7);

			// 문제5) 책 161 3번
			// while문과 Math.random()함수를 이용.
			// 1-6 2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력.
			// 숫자의 합이 5일 경우에 종료, 아닌 경우에 계속 던짐.
			// 최종으로 주사위를 몇번 던졌는지 횟수를 출력.
			// 숫자의 합이 5가 되는 조합은 (1,4) , (4,1),(2,3),(3,2)

//		int a = 0;
//		int b = 0;
//		count = 1;
//
//		while (a + b != 5) {
//			a = (int) (Math.random() * 6) + 1;
//			b = (int) (Math.random() * 6) + 1;
//			System.out.println(a + "," + b);
//			count++;
//		}
//		System.out.println(count - 1);

			// 교수님 풀이
			int total = 0;
			while (true) {
				int x = (int) (Math.random() * 6) + 1;
				int y = (int) (Math.random() * 6) + 1;
				// 내부에 선언하는 이유는 누적할 이유가 없어서.
				total++;
				System.out.printf("(%d, %d)\n", x, y);
				if (x + y == 5) {
					break;
				}
			}
			System.out.println("주사위를 던진 횟수는 총" + total + "번 입니다.");

		}

	}

