package com.itwill03_포함;

public class Dvd {
	//번호
    //타이틀
	//쟝르
	private int noDvd;
	private String titleDvd;
	private String genreDvd;
	
	//생성자
	public Dvd() {
	}
	public Dvd(int noDvd, String titleDvd, String genreDvd) {
		this.noDvd = noDvd;
		this.titleDvd = titleDvd;
		this.genreDvd = genreDvd;
	}
	
	//메소드
	public void print() {
		System.out.println(noDvd+"\t"+titleDvd+"\t"+genreDvd);
	}
	
	
	
	
	
		
	

}




