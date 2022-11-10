package com.yedam.java.ch0605;

//import java.util.Scanner;
//
//public class main {
//	public static void main(String[] args) {
//	
//	//은행 고객 정보를 관리하는 클래스
//	//1) main 2) Customer 3) Bank
//	//1) main -> 생성자를 통한 고객의 정보를 저장, 출력 
//	//2) Bank -> 해당은행의 금리를 저장.
//	//   ( 현재 잔액 + ( 현재 잔액 * 금리 ))
//	//3) Customer -> 고객의 정보를 저장.
//	//이름, 은행명, 계좌, 잔액의 필드.
//	//getInfo() : 입력한 정보를 출력.
//	//withDraw() : 출금 할 때 정보를 출력.
//	
//	Scanner sc = new Scanner(System.in);
//	String confirm; //출금변수 지정.
////	
//	Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
////	
////	customer.getInfo();
////	
////	customer.withDraw();
////	System.out.println("출금 하시겠습니까? Y/N");
////	
////	confirm = sc.nextLine();
////	if(confirm.toLowerCase().equals("y")) {
////		
////		System.out.println("출금 완료");
////		
////	} else {
////		System.out.println("시스템 종료");
////	}
////	
//	Access access = new Access();
//	
//	//1) public
//	access.free = "public";
//	access.free();
//	//2) private
//	//access.privacy = "privacy";
//	//access.privacy();
//	//3)protected
//	access.parent = "parent";
//	//4)default
//	access.basic = "basic";
//							//singleton == new Singleton()
//	Singleton s1 = Singleton.getInstance();
//	Singleton s2 = Singleton.getInstance();
//	//Singleton s1 = new Singleton()
//	
//	System.out.println(s1);
//	System.out.println(s2);
//	
//	//singleton == new Singleton()
//	//getInstance() == singleton == new Singleton()
//	//getInstance() == new Singleton()
//	
//	Member mem = new Member();
//	
//	//1) mem의 인스턴스 필드에 접근 가능한지 확인.
//	//2) setter, getter로 데이터 입력 및 출력.
//	mem.setId("yedam");
//	mem.setTel("010-1234-1234");
//	mem.setAge(10);
//	
//	System.out.println("ID: " + mem.getId());
//	System.out.println("Tel: " + mem.getTel());
//	System.out.println("ID: " + mem.getAge);
//	
//}
//
//}
