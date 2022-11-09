package com.yedam.java.ch0502_02;

public class ArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // int[]의 배열(복수의 의미)
		// 2차원 배열의 크기
		// 값으로 가지고 있는 int배열
		// 첫번째 변수 사용
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "] :");
				System.out.println(mathScore[j]);

			}
		}
		
		System.out.println("========================================");
		
		// 두번째 : 변수 사용x
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print("\t mathScores["+i+"][" + j + "] :");
				System.out.println(mathScores[i][j]);

			}
		}
		
		int[][] scoreList = {
								{ 86, 65 },
								{ 58, 95, 73 }
		
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			//배열의 길이보다는 i를 불러주어 동적으로 읽어지게 하는것이 좋다.
			for(int j=0; j< scoreList[i].length; j++) {
				System.out.println(scoreList[i][j]+ " ");
			}
			System.out.println();
		}
		
		int[][] englishScore = new int[2][]; //<- 다차원배열의 필수값
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.println("englishScore["+i+"]["+j+"]");
				System.out.println(englishScore[i][j]);
			}
		}
		
		//
		
		String[] strArray = new String[3];
		//스트링은 변수가 값x / 
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		//객체를 비교할땐 등호연산자 사용x 
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2]));
		//실질적인 값을 비교할때는 equals를 쓴다. 
		
		System.out.println();
		
		// for문으로 배열 복사 
		int[] oldIntAry = { 1, 2, 3};// old 의 값  3
		int[] newIntAry = new int[5];// new 의 값 5
		for(int i=0; i < oldIntAry.length ; i++) { // 배열을 복사할때는 작은쪽의 크기에 맞춰준다. 
			newIntAry[i] = oldIntAry[i];
			
		}
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);  //기존의 값은 복사 -> 남아있는 공간은 디폴드값으로 들고있음. 
											   // 1 2 3 0 0 > old
											   // 1 2 3 4 5 > new
		}
		
		//System.arraycopy()
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		//배열복사시 사용하는 메소드가 존재.
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
			
		}
		
		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		//int index = -1;
		for(int score : scores) {
			System.out.println(score);
			sum += score;
			//System.out.println("인덱스: " + ++index);
		}
		System.out.println("점수 총합 : " +sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합: " + avg);
		
		
		
		
 	}
}
