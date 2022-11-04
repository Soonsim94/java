package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자 
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		//  -- >  + / ++ > -
		
		byte b = 100;
		//byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result3:" + result3);
		// 변수에 노란줄은 선언은 되었으나, 사용은 안한상태. 
		
		// 증감연산자 
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("----------------------------------");
		
		x++; // 11
		++x; // 12
		System.out.println("x="+ x);
		
		System.out.println("----------------------------------");
		y--; 
		System.out.println("y = " + y);
		--y;
		System.out.println("y = " + y);
		z = x++; //대입연산자(=)는 제일 마지막에 실행 
		// 다른연산이 실행된 후에 
		System.out.println("----------------------------------");
		System.out.println("z = " +z);  //12
		System.out.println("x = " +x);  //13
		
		System.out.println("----------------------------------");
		z = ++x;
		System.out.println("z = " +z);  //14
		System.out.println("x = " +x);  //14
		//앞에 있는 애는 먼저 1 더하고 시작. 
		
		System.out.println("----------------------------------");
		z = ++x + y++;
		// 1) ++x 
		// 3) y++ <- 문제 
		// 2) x + y => 15 + 8 
		// 4) = => z = (x + y)
		System.out.println("z = " +z);  //23
		System.out.println("x = " +x);  //15
		System.out.println("y = " +y);  //9
		
		/***/
		x = 5;
		y = 5;
		
		System.out.println("----------------------------------");
		z = x++ + --y; // +먼저 처리
		
		//1) --y => 4
		//2) x + y => 5 + 4 => 9
		//3) x++ => 6
		//4) z = x + y = > z = 9
		System.out.println("z = " + z); //9   
		System.out.println("x = " + x); //6
		System.out.println("y = " + y); //4
		
		System.out.println("----------------------------------");
		z = --x + y++; 
		//1) --x => 5
		//2) x+y => 5 + 4 = 9
		//3) y++ =>5
		//4) z = x+y => z = 9
		System.out.println("z = " + z); //9
		System.out.println("x = " + x); //5
		System.out.println("y = " + y); //5
		
		// 논리 부정 연산자 
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {    // 내가 가지고 있는 값이 false 인데, 참으로 만들어야할 경우, 강제로 참으로 만들기위해 논리부정연산자 사용. 
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업 중 입니다.");
		}
		
		//토글은 하나의 버튼을 가지고 온/오프 하듯이 왔다가다 하는 연산자. 
		
		// 산술 연산자 
		int v1 = 5;
		int v2 =2;
		int result;
		
		result = v1 + v2;
		System.out.println("result:" + result);
		
		result = v1 - v2;
		System.out.println("result:" + result);
		
		result = v1 * v2;
		System.out.println("result:" + result);
		
		result = v1 / v2;
		System.out.println("result:" + result);
		
		result = v1 % v2;
		System.out.println("result:" + result);
		
		// 비교 연산자
		
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2 );    
		//작거나 크거나가 앞에 와야함 (자바인식기준)
		System.out.println(">= : " + bResult); // 크거나 같거나 , 트루
		bResult = (num1 == num2 );
		System.out.println("== : " + bResult); // 같다 , 트루
		bResult = ( num1 != num2 );
		System.out.println("!= : " + bResult); // 같지아니하다 , 펄즈
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		System.out.println("문자비교 :" + (char1 > char2));
		
		int  v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double: " + (v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double :" + (v5 == v6));
		System.out.println("float VS float :" + (v5 ==(float)v6));
		//정밀도가 다름. float의 0.1 / double의 0.1이 다르게 인지가 됨. 
		// 비교시 반드시 타입을 맞춰주어야 한다. 
		
		
		// 논리 연산자 
		int charCode = 'A';
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자. 
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자");
		}
		//&, && 크게 차이는 없지만 주로 &&을 사용함. 역할 자체는 같음.  
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자. 
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자"); 
		}
		
		//유니코드 중 48보다 크고, 57보다 작으면 숫자 0~9
		if((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0) | (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		if((numValue % 2 == 0) || (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		// 복합 대입 연산자 
		int resultA = 0;
		resultA += 10; // resultA = resultA +10 
		System.out.println("+=: " + resultA);
		resultA -= 5; // resultA = resultA -5
		System.out.println("-=: "  + resultA);
		resultA *= 3; // resultA = resultA *3
		System.out.println("*=: "  + resultA);
		resultA /= 5; // resultA = resultA /5
		System.out.println("/=: "  + resultA);
		resultA %= 3; // resultA = resultA %3
		System.out.println("%=: "  + resultA);
		
		
		//삼항연산자 : 간단한 if문으로, 값을 선택할때! 값을 반환하는 조건문. 
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B' ;
		System.out.printf("성적은 %d이고 등급은 %s입니다. \n", score,grade);
		                    //정수.      //문자그대로 출력.
		//유니코드 출력c , s 문자형으로 사용 가능.
		
		int age = 17;
		String message = (age >= 20)? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이며, %s입니다.\n", age, message);
		
		
		
		
		
		
	}	
	

}
