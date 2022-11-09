package com.yedam.java.ch0604;

public class Computer { //배열을 만들어서 호출
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //값만 넘겨주면 알아서 호출
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
		}
		return sum;
	}
}
