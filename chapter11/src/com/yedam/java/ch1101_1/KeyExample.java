package com.yedam.java.ch1101_1;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {

		// HashMap -> key , value 데이터를 저장.
		
		HashMap<Key, String> hashmap = new HashMap<>();

		
		//(new Key(1) -> 1 해쉬코드를 적용
		hashmap.put(new Key(1), "홍길동"); 
		// 열쇠 //데이터
		
		//*아래예시* 서로다른주소.
		//Key k1 = new Key(1);
		//Key k2 = new Key(1);
		
		//(new Key(1) -> 2    /해쉬코드가 2인 객체를 받으려니 못받아서 버리고 나옴.
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
		Key key = new Key(1);
		
		System.out.println(key.toString());
		
		
	}
}
