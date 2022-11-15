package com.yedam.chapter13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// 인덱스에 들어갈 객체타입 지정 -><String>
		// List<E> list2 = new ArrayList<>();
		// E는 element 넣을수있는 객체가 뚜렷하지않지만, 어떤 객체든 다 허용해준다는 뜻.

		// 객체 저장 / 동적으로 관리할수 있어 좋음.
		// = 배열 list[0] = "java"; 10개의 사이즈 5개가 아닌 사이즈에 맞게 동적으로 관리가능.
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DateBase");
		list.add("iBATIS");

		// 배열 list.length()
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();

		// skill = list[2]
		String skill = list.get(2);
		System.out.println("2: " + skill + "\n");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
}
