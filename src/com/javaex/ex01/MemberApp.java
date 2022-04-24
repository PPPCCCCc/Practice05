package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jws = new Member();
		jws.setName("정우성");
		jws.setId("jws");
		jws.setPoint(50000);
		
		Member yjs = new Member();
		yjs.setName("유재석");
		yjs.setId("yjs");
		yjs.setPoint(30000);
		
		Member lhr = new Member();
		lhr.setName("이효리");
		lhr.setId("lhr");
		lhr.setPoint(40000);
		
		jws.showinfo();
		yjs.showinfo();
		lhr.showinfo();
		
		
		
	}

}
