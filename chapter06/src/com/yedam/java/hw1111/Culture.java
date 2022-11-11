package com.yedam.java.hw1111;

public abstract class Culture {

	public String title;
	public int dreNum;
	public int actNum;
	public int audNum = 0;
	public int score = 0;

	public Culture(String title, int dreNum, int actNum) {
		this.title = title;
		this.dreNum = dreNum;
		this.actNum = actNum;

	}

	public void setTotalScore(int score) {
		this.score += score;
		audNum++;
	}

	public String getGrade() {
		int avg = score / audNum;
		String avgScore = null;
		if (avg >= 50) {
			avgScore = ("★★★★★");
		} else if (avg >= 40) {
			avgScore = ("★★★★");
		} else if (avg >= 30) {
			avgScore = ("★★★");
		} else if (avg >= 20) {
			avgScore = ("★★");
		} else {
			avgScore = "★";

		}
		return avgScore;
	
	}
	
	public abstract void getInformation();

}
