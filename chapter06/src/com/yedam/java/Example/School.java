package com.yedam.java.Example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Student[] Std = null;
		
		System.out.println("학생 수>");
		int sCount = Integer.parseInt(sc.nextLine());
		Student[] Std = new Student[sCount];
		
		for(int i=0; i<Std.length; i++) {
			
			
			Student total = new Student();
			
			
			//1. 학생수 입력.
			System.out.println("학생 이름>");
			String sName = sc.nextLine();
			total.setsName(sName);
			
			//2. 학번 입력.
			System.out.println("학번 입력>");
			String sNo = sc.nextLine();
			total.setsNo(sNo);
			
			//3. 국어 성적 입력.
			System.out.println("국어 입력>");
			int korScore = Integer.parseInt(sc.nextLine());
			total.setKor(korScore);
			
			//4. 수학 성적 입력.
			System.out.println("수학 입력>");
			int mathScore = Integer.parseInt(sc.nextLine());
			total.setMath(mathScore);
			
			//5. 영어 성적 입력.
			System.out.println("영어 입력>");
			int engScore = Integer.parseInt(sc.nextLine());
			total.setEng(engScore);
			
			Std[i] = total;
			
		}	
		
		//for(int i=0; i<Std.length; i++) {
			Std[i].getInfo();
			
		//게터로 저장한 데이터 가져오는 방법.	
		//for(int i = 0; i<Std.length; i++) {
			//System.out.println("학생 이름 >" + Std[i].getsName());
			//System.out.println("학생 이름 >" + Std[i].getsNo());
		}
		


	}
