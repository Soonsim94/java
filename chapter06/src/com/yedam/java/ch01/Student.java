package com.yedam.java.ch01;
//학생의 정보를 넣을수 있는 클래스
public class Student {
	
	// 필드
	
	private String sName;
	private String sSchool;
	private int sNum;
	private int sYear;
	private int kor;
	private int eng;
	private int math;
	
	//생성자 모든 데이터를 입력
	public Student(String sSchool, String sName, int sNum, int sYear, int kor, int eng, int math) {
		this.sSchool = sSchool; 
		getInfo();
	}
	
	public String getsName() {
		return sName;
	}

	public String getsSchool() {
		return sSchool;
	}

	public int getsNum() {
		return sNum;
	}

	public int getsYear() {
		return sYear;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	void getInfo() {
		System.out.println("학생이름 : " + sName);
	}
}	
