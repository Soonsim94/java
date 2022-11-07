package com.yedam.java.ch0402;

public class ConditinalStatmentExample {

	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력 //for문만 증감식이 따로 있음.
		for (int i = 1; i <= 10; i++) {
			// 시작 //표현될식,받을수있는 값//증감
			System.out.println(i);
		}
		// 초기화식,조건식 증감식 생략가능.
		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		System.out.println("x:" + x);

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i;
		}
		System.out.println("1~100까지의 합계 :" + sum);

		// float 타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
			// 1.0에 근접한 값을 가지고있으며, 값은 정확히 떨어지지 않음.
			// int로 만든다음에 사용.

		}

		// 구구단 2~9단까지 출력

		for (int i = 2; i <= 9; i++) { /// 바깥for문
			// i = 0; 동작하는게 2 for문
			System.out.println("***" + i + "단 ***");
			for (int j = 0; j <= 9; j++) { // 중첩 for문 //i는 중첩문을 제어할수있다.
				// i=0, j=0;
				// j =1;
				System.out.println(i + "x" + j + "=" + (i * j));
			}

		}

		// While문 조건식만 요구.

		// 1 ~ 10까지 출력. //변수는 무조건 바깥에 선언.
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++; // 증감식은 출력후 진행!
			// 증감식의 위치에 따라 변수값이 달라진다.
		}

		// 1부터 100까지 출력, 1부터 100까지 합을 출력.
		sum = 0;
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count;

			count++; // 증감식은 마지막에
			// count의 실제값은 101
		}
		System.out.println("1~" + (count - 1) + "까지 합 :" + sum);

		// 횟수가 불분명한 경우 while문을 돌리게된다.
		// 주사위 두개를 굴립니다. 합이 3이 되는 경우 계속 굴리는 경우.

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		} // false 라 실행되지 x

		do {
			System.out.println("do ~ while 반복문이" + index + "번 실행됩니다.");
		} while (index != 1); // 문법적으로 do가 붙으며 반드시 한번은 실행하게 되어 실행o.

		// break로 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;

		}

		// 이중 for문에서 break문 사용
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			boolean result = false;
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					result = true;
					break; // if문이 실제로 동작되는 for문은 안쪽.
				}
			}
			System.out.println("1) 안쪽 for문 종료 ");

		}
		System.out.println("2) 바깥쪽 for문 종료 ");

		System.out.println("----------------------------------");

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {

			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;

				}
			}
			System.out.println("1) 안쪽 for문 종료 ");

		}
		System.out.println("2) 바깥쪽 for문 종료 ");

		//짝수가아닌경우를 골라내서 출력(continue) / 짝수인 애를 배제시키느냐(break)
		// continue를 사용한 for문.
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) continue;
			//i를 2를 이용해서 나머지를 구했을때 0이면, 짝수인애는 내보내라. 
		}
		System.out.println(count);
				

		
		
	}

}
