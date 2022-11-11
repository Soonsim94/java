package com.yedam.java.hw1111;

public class Movie extends Culture {

	String genre;

	public Movie(String title, int dreNum, int actNum, String genre) {
		super(title, dreNum, actNum);
		this.genre = genre;
		
	}

	@Override
	public void getInformation() {
		System.out.println("제목 :" + title);
		System.out.println("참여 감독수 :" + dreNum);
		System.out.println("참여 배우수 :" + actNum);
		System.out.println("관객수 :" + audNum);
		System.out.println("총점 :" + score);
		System.out.println("평점 :" + getGrade());
		
	}
}
