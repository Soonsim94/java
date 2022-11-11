package com.yedam.java.hw1111;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		
		Movie movie = new Movie("추격자", 7, 5, "액션");
		Prerformance preformance = new Prerformance("지킬앤하이드", 9, 10, "뮤지컬");
		
		movie.setTotalScore(50);
		preformance.setTotalScore(50);
		movie.getInformation();
		preformance.getInformation();
		
	}
}
