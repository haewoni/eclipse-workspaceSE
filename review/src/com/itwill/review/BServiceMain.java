package com.itwill.review;

public class BServiceMain {

	public static void main(String[] args) {
		BService bService = new BService();
		bService.a();
		int ri = bService.b();
		 System.err.println("public int b() 메소드 실행 후 int 반환 받은 데이터:"+ri);
		 String msg = bService.c("김경호");
		 System.err.println("public int c() 메소드 실행 후 int 반환 받은 데이터:"+msg);
		 msg = bService.c("김수미");
		 System.out.println(">>>"+msg);
		 Student st = new Student();
		 st.no=1;
		 st.name="ONE";
		 st.kor=89;
		 st.eng=78;
		 st.math=90;
		 System.out.println("인자객체:"+st);
		 Student recvSt = bService.d(st);
		 System.out.println("반환객체:"+recvSt+"-->"+recvSt.tot );
	}
	
	

}
