
public class LogicalOperator {
	public static void main(String[] args) {
		/*
                      논리연산자
           - 형태: ||(Logical OR), && (Logical AND)
           - 좌우측의 항이 논리형데이터
           - 결과도 논리형 데이터
            ex> true || false, false && false
          
          Logical OR(논리합) ||
           - false || false --> false
           
           Logical AND(논리곱) $$
            - true && true --> true
		 */
		
		boolean a1 = false;
		boolean a2 = false;
		boolean a3 = true;
		boolean a4 = true;
				
		boolean result;
		result = a1 || a2;
		System.out.println(result);
		result = a3 && a4;
		System.out.println(result);
		
		int kor=90;
		int math=78;
		
		boolean isValidKor = (kor>=0) && (kor<=100) ;
		System.out.println(isValidKor);
		boolean isValidMath = (math>=0) && (math<=100);
		System.out.println(isValidMath);
		
		boolean isValidAll = isValidKor && isValidMath;
		System.out.println(isValidAll);
		
		int eng=90;
		int spain=56;
		int chn=90;
		
		boolean pass=false;
		
		pass = (eng>=90) || (spain>=90) || (chn>=90);
		System.out.println(pass);
		
		/*
		 Quiz: 윤년여부판단
		       1. 4의 배수면 윤년
		       2. 100의 배수는 윤년이 아님
		       3. 400의 배수는 윤년
		 */
		
		boolean isLeapYear=false;
		int year= 2020;
		isLeapYear= (year%4==0) && (year%100>=0) || (year%400==0);
		
		
		
		System.out.println(year+"의 윤년 여부:"+isLeapYear);
		
	  


	}

}
