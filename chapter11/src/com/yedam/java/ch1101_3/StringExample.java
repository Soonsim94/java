package com.yedam.java.ch1101_3;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1"; //100번지
	// String c = "1"; //100번지
	// String b = new String("1"); //200번지

	// 바이트 -> 문자열

	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 String 객체로 생성.
		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes, 6, 4); // 6번째부터 4개만 가져와라.
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) - 특정 문자 위치를 반환

		String ssn = "123456-1876541";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교//

		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소를 비교//

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}

		// 값을 비교

		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}

		// 바이트 배열로 변환

		byte[] bytes2 = null;
		String str = "안녕하세요"; // 힌글은 하나에 3byte
		bytes2 = str.getBytes();

		System.out.println(bytes2.length);

		String str3 = new String(bytes2);
		System.out.println("byte2 -> String" + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length :" + bytes3.length);
			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 - > string " + str4);
			// 문자열을 바이트배열로 바꾸어 한글자씩 잘라주는것.

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기//

		String subject = "자바 프로그래밍";
		// 문자열이 시작되는곳을 반환시켜줌.
		int index = subject.indexOf("프로그래밍");

		System.out.println(index);

		index = subject.indexOf("a");

		System.out.println(index);

		// 문자열의 문자 개수 얻기//

		System.out.println(subject.length());

		// 문자열 위치 변경//

		String oldStr = "자바 프로그래밍";
		// 앞의 단어를 뒤의 단어로 대체하겠다.
		String newStr = oldStr.replace("자바", "java");
		// java 프로그래밍 "자바 프로그래밍" 문자는 그대로 있고, 새로운 문자로 대체된것.
		System.out.println(newStr);

		// oldStr = "자바"; //100번지
		// oldSter += "프로그래밍"; //200번지
		// oldStr += "재밌다"; //300번지
		// 수정이 되는것이 아니라 다른 메모리에 할당이 되는것.

		// Stringbuilder 또는 buffer(임시저장소)

		// 문자열을 합칠경우//

		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();

		sb2.append(false);

		sb.append("자바"); // 500번지
		sb.append("프로그래밍"); // 500번지
		sb.append(123); // 500번지

		System.out.println(sb);

		// 대소문자 바꾸기//

		String strVal = "dskdjsadkjskdljasdjadlsa";
		String strVal2 = "FJDHFJKDSHFJSKHFJSKFKJFHK";

		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());

		// trim() 공백제거 //

		String strTrim = " 자바 ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());

		// 문자열 자르기//

		// substring()
		// substring(index,end)
		// index부터 end까지 자르세요.
		// substring(index)
		// index부터 끝까지 자르세요.

		String ssn2 = "880815-1234567";

		String firstNum = ssn2.substring(0, 6);
		String secondNum = ssn2.substring(7);

		System.out.println(firstNum);
		System.out.println(secondNum);

		// split()
		String strSplit = "1-1-1-1-1-1-4-5-6-7-8";

		String[] strAry = strSplit.split("-");

		// 향상된 for문
		for (String temp : strAry) {
			System.out.println(temp);
			
		}
		
		//문자열 변환//
		
		//숫자나, 소수, 불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
	}

}
