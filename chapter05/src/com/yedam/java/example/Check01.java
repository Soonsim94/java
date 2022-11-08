package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총 합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };

		int sum = 0; // 배열으 ㅣ총합 변수

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("총 합은 : " + sum);
		double avg = sum / (double) array.length;
		System.out.printf("평균 : %.2f\n", avg);

		// 문제2) 배열의 최대값과 최소값을 구하세요.

		int max = array[0]; // =[array.length-1]이렇게 넣어도됨.
		int min = array[0];
		// 임의로 값을 넣지말기.

		for (int i = 0; i < array.length; i++) {
			// 최대값
			if (max < array[i]) { // 기존의 맥스값을
				max = array[i]; // 새로운 맥스값으로 덮어쓴다.
			}
			// 최소값
			if (min > array[i]) {
				min = array[i];
			}

		}
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);

		// 문제3 문제2구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			// 최대값
			if (max == array[i]) {
				maxIndex = i;
			}
			if (min == array[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값 :" + max + "는 " + (maxIndex + 1) + "번째입니다.");

		System.out.println("최소값 :" + min + "는 " + (minIndex + 1) + "번째입니다.");
	
	
	}
}
