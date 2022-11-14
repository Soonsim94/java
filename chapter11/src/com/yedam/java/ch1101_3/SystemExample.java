package com.yedam.java.ch1101_3;

public class SystemExample {
	public static void main(String[] args) {
		// System.exit()
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.exit(0);
//				// 바로 프로그램 종료 시킴. //쓰지않는것을 추천
//			}
//		}
		// System.out.println("프로그램 종료");

		// 현재 시각 읽기

		// 시간을 체크하는 시작점.
		long time1 = System.nanoTime(); // 스탑워치

		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += 1;
		}

		// 시간 읽는것을 그만하겠다.
		long time2 = System.nanoTime(); // 10초

		System.out.println("sum: " + sum);
		System.out.println("계산 시간 : " + (time2 - time1) + "나노초가 소요됨.");
		//                           시간이 얼마나 소요되었나 알수있음.(time2 - time1)

		long time3 = System.currentTimeMillis(); // 중복되지않은 데이터를 가져올때 쓰는방법. currentTimeMillis
		System.out.println(time3);
		
	}
}
