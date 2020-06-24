/*
반복문

     stmt1;
     
     while(조건문){
		 //조건문--> 논리형데이타를 반환하는 식,논리형변수,논리형리터럴 
		stmt2;
	 }
	 
	 stmt3;
     
	 흐름  stmt1 -->조건식의 데이타가 true인동안 stmt2를 반복실행		--> stmt3
		   stmt1 -->조건식의 데이타가 false가되면 stmt2를 실행하지않음	--> stmt3
*/
public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		System.out.println("1.-------논리형리터럴-------");
		int k=0;
		while(true) {
			System.out.println("stmt2:"+k);
			k++;
			if(k==10) {
				break;//반복루프블록(while,for)를 빠져나간다.
				//return;//메인블록을 빠져나감(프로그램종료)
			}
		}
		
		System.out.println("2.--------논리형변수---------");
		boolean condition=true;
		int i=0;
		while (condition) {
			System.out.println("stmt3:"+i);
			i++;
			if(i == 10) {
				condition=false;
			}
		}
		System.out.println("3.---------비교연산---------");
		int j = 0;
		while(j < 10) {
			System.out.println("stmt4:"+j);
			j++;
		}
		
		
	}//end main

}//end class








