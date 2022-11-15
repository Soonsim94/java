package com.yedam.chapter13.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList : " + (endTime-startTime) + "ns");
		//시간이 더 오래걸림. 옮길게 많아져서 
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		//1개씩만 넣을위치에만 넣어주고 연결시키면끝이라 빠름.
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime-startTime)+ "ns");
	}
	
	
}
