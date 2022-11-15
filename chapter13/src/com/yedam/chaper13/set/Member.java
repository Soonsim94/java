package com.yedam.chaper13.set;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		//name = String 
		//age를 더해줌으로 name의 해쉬코드와 같은 객체인지 확인.
		//Member member = new Member("yedam",1);
		//Member member2 = new Member("yedam",1);
		//Member member3 = new Member("yedam",4);
		//같게 만들기 위해 해쉬코드를 재정의/ 데이터가 같으면 같은 객체로 치겠다. 
		//"yedam" -> 2
		// age -> 1
		// 2 + 1 = 3
		
		//"yedam" -> 2
		// age -> 4
		// 최종 hashcode() = 2 + 4
		//동등 객체인지 아닌지 확인.
		return name.hashCode() + age; 
		
		
	}

}
