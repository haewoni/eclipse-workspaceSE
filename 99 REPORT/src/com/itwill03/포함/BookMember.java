package com.itwill03_포함;

public class BookMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린책
	private int noMember;
	private String name,mobile;
	private Book book;
	
	/*
	 * 생성자ㅣ
	 */
	public BookMember() {
		
	}

	public BookMember(int noMember, String mobile, String name, Book book) {
		super();
		this.noMember = noMember;
		this.mobile = mobile;
		this.name = name;
		this.book = book;
	}
	/*
	 * 메소드
	 */
	
	public void print() {
		System.out.println(noMember+"\t"+ mobile+"\t"+name);
		this.book.print();
	}
		
	/*
	 * getter, setter
	 */
		


	public int getNoMember() {
		return noMember;
	}

	public void setNoMember(int noMember) {
		this.noMember = noMember;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	






}
