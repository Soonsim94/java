package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas; // 기존의 필드에 매개변수로 받은 값을 넣어줌.
	}

	// 가스 내의 잔량을 확인하는
	boolean isLeftGas() {
		if (this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 리턴이 있으면 종료. 그렇기에 if~else로 묶을 필요 x
		}

		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (this.isLeftGas()) { // while문ㅇ ㅣ도는동안 가스량을 체크 =this.gas>0 같은의미.
				System.out.println("달립니다. (gas 잔량 : " + this.gas + ")");
				this.gas--;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + this.gas + ")");
				return; // break반복문 멈춤, return은 해당 메소드 멈춤.
				// 메소드를 종료시키는 역할.
				// System.out.println("종료합니다."); ->실행x

			}
		}
	}
}
