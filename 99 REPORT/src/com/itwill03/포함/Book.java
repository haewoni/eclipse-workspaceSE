package com.itwill03.포함;

public class Book {

	/*
	 * 책번호 책제목 책분류 책설명
	 */
	private int no;
	private String title, group, description;
	private Book book;
	
	/*
	 * 생성자
	 */

	public Book() {
	}
	
	public Book(int no,String title,String group,String description) {
		this.no=no;
		this.title=title;
		this.group=group;
		this.description=description;

	}
	public void print( ) {
		System.out.println(no+"\t"+ title+"\t"+group+"\t"+description);
	}
	
	
	
	

}
