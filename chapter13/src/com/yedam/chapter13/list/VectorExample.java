package com.yedam.chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();

		// new연산자,생성자를 이용해 바로 데이터를 넣는방법
		list.add(new Board("제목1", "내용1", "글쓴이1"));

		// 인스턴스를 만들어 데이터를 넣는방법.
		Board board = new Board("제목2", "내용2", "글쓴이2");
		list.add(board);

		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		list.remove(2);
		list.remove(3);

		//객체를 임시로 보관하는 temp안에서 for문으로 돌아가며 출력.향상된 for문으로 데이터뽑기
		for (Board temp : list) {
			System.out.println(temp.subject + temp.content + temp.writer);
		}
		System.out.println("======================================");
		//일반 for문으로 데이터 뽑기.
		for (int i = 0; i < list.size(); i++) {
			Board board2 = list.get(i);
			System.out.println(board2.subject + board2.content + board2.writer);
		}
		
		
		
	}
}
