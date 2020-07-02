package com.itwill.review;

public class BService {
	private int member1;
	private int member2;
	private int member3;
	private int member4;

	public void a() {
		System.err.println("a()메소드 호출");
		}
	
     public int b() {
    	 System.err.println("public int b() 메소드 실행 후 int 반환" );
    	 int i =9090;
    	 return i;
     }
     public String c(String name) {
    	 System.out.println("public int c(String name) 메소드 실행 후 String 반환");
    	 String msg = name+"님 안녕하세요";
    	 return msg;
      }
     
     public Student d(Student st) {
    	 st.tot=st.kor+st.math+st.eng;
    	 return st;
     }
}
