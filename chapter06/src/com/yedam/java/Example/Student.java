package com.yedam.java.Example;

public class Student {
	
	//1) 각 필드를 저장 할 수 있는 getter, setter 작성.
	//2) 모든 정보를 출력할 수 있는 메소드 하나 작성.
	//3) School 클래스 만들고 main을 작성해서 학생의 정보를 넣는 프로그램.
	//4) 학생 수를 입력 받고, 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램 만들기.
	//5) 모든 학생의 정보를 출력.
	 
	
	//필드
	private String sName;
	private String sNo;
	private int kor;
	private int math;
	private int eng;
	
	//메소드
	public void getInfo() {
		System.out.println("==학생 정보 출력==");
		System.out.println("학생수: " + sName);
		System.out.println("학번: " + sNo);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
	
	}
	  
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//생성자
	
	
	
}
