package com.yedam.java.ch1101;
//equals를 활용한 객체동등비교
public class Member {

	
	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	

	public Member(String id) {
		this.id = id;

	}

	@Override
	public boolean equals(Object obj) {
		//Object obj = new Member("blue")
		//강제타입변환을 통해 member가 가지고있는것을 사용하기위해
		Member member = (Member) obj;
		//Member member = new Member("blue");
		
		if (id.equals(member.id)) {
			return true;
		}
		return false;

	}

	@Override
	public int hashCode() {
		//String a ="1"; //10번지
		//String b ="1"; //10번지
		return id.hashCode(); //"1"
		
	}
	

	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	} // sorce > to string 내가 가진 필드에 대한 정보를 표현할 수 있음. 
	
	
}
