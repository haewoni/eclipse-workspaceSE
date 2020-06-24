package com.itwill03.포함;

public class DvdMember {
	// 회원번호
	// 회원이름
	// 전화번호
	// 빌린dvd
	private int noDvdMember;
	private String nameDvdMember;
	private String mobileDvd;
	private Dvd dvd;
	

	// 생성자
    public DvdMember() {
    }
	public DvdMember(int noDvdMember, String nameDvdMember, String mobileDvd, Dvd dvd) {
		this.noDvdMember = noDvdMember;
		this.nameDvdMember = nameDvdMember;
		this.mobileDvd = mobileDvd;
		this.dvd = dvd;
	}
	
	//메소드
	public void print() {
		System.out.println(noDvdMember+"\t"+nameDvdMember+"\t"+mobileDvd+"\t"+dvd);
		this.dvd.print();
	}
	public int getNoDvdMember() {
		return noDvdMember;
	}
	public void setNoDvdMember(int noDvdMember) {
		this.noDvdMember = noDvdMember;
	}
	public String getNameDvdMember() {
		return nameDvdMember;
	}
	public void setNameDvdMember(String nameDvdMember) {
		this.nameDvdMember = nameDvdMember;
	}
	public String getMobileDvd() {
		return mobileDvd;
	}
	public void setMobileDvd(String mobileDvd) {
		this.mobileDvd = mobileDvd;
	}
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	} 
	
	//getter setter
	
    
	
	
		
	


}
