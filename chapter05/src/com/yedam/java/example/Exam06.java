package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true; // switch문을 쓰기위해 반드시 필요 boolean타입
		Scanner sc = new Scanner(System.in);

		// scores의 선언되는 범위가 메인, 메인이 while을 품고있기때문에 살아남음.
		int[] scores = null;
		int studentNum = 0;

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료|");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			// int[] scores = null; /한번 반복될때마다 새롭게 생성되기 떄문에 안에 선언되는 변수의 수가 null이면 초기화된다.

			switch (selectNo) {
			case 1:
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4: // 분석 = 최고값과 평균을 구한다는 의미
				int sum = 0;
				int max = scores[0];
				for (int i = 0; i < scores.length; i++) {
					// 최고점수
					if (max < scores[i]) {
						max = scores[i];
					}

					// 총합
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : " + ((double) sum / scores.length));
				// (double)넣어주어야 정확한 값이 나옴. 소수점이하까지 넣고싶다고 하면 꼭 기입.

				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
				
			}

		}
	}
}
