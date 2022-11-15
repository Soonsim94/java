package com.yedam.chaper13.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		//동등객체를 비교후 넣어줌. 같은객체는 못들어감.
		
		set.add(new Member("홍길동",30)); //100번지
		set.add(new Member("홍길동",30)); //200번지
		
		System.out.println("총 객체 수 : " + set.size());
		
		
	}
}
