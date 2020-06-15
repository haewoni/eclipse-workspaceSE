
public class ArithmaticOperator {

	public static void main(String[] args) {
         int a=1;
         int b=2;
         char ca='A';
         char cz='Z';
          
         int result;
         /*
          1.산술연산
          
          */
         result = a+b;
         System.out.println("a+b="+result);
         result = a-b;
         System.out.println("a-b="+result);
         result = a*b;
         System.out.println("a*b="+result);
         result = a/b;
         System.out.println("a/b="+result);
         result = a%b;
         System.out.println("a%b="+result);
         int year=2020;
         result = year%4;
         System.out.println("year%4="+result);
         result = year%400;
         System.out.println("year%400="+result);
         
         System.out.println("---문자연산----");
         result=ca + 1;
         System.out.println("ca+1-->"+result);
         char cb = (char)result;
         System.out.println("cb -->"+cb);
         
         
         char hanFirst = '가';
         char hanLast='힣';
         int letterCount = hanLast-hanFirst+1;
         System.out.println("한글의글자수:"+letterCount);
         
         int c = 1;
         result = c << 1;
         System.out.println(result);
         result = c << 2;
         System.out.println(result);
         result = c << 3;
         System.out.println(result);
         
         int d=128;
         result = d >> 1;
         System.out.println(result);
         result = d >> 2;
         System.out.println(result);
         result = d >> 3;         
         System.out.println(result);
         result = d >> 4;
         System.out.println(result);
         
         /*
                      비트연산자
           - 형태: |, &, ~
           
           
          */
         
         int intmax1= 2147483647;
         int intmax2= 0B01111111111111111111111111111111;
         System.out.println(intmax1);
         System.out.println(intmax2);
         
         int result1 = ~intmax1;
         result1=result1+1;
         System.out.println(result1);
         int result2 = ~intmax1;
         result2=result2+1;
         System.out.println(result2);
         System.out.println(Integer.toBinaryString(result1));
        
         
         

         /*
          << name cannot be resolved to a variable >>
          name = "김경호";
          ---->변수 선언 안할시
          
          << Duplicate local variable number >>
          int number;
          int number = 90
          -----> 선언 두 번 한 것, 중복
          
          << string cannot be resolved to a type >>
          string message = "오늘은 날씨가 좋아요!!";
          -----> string 대문자
          
          << Syntax error, insert ";" to complete Local VariableDeclarationStatement >>
         int score
         System.out.println(score);
         -----> 문장 끝에 반드시 ; (세미콜론)
          
          
          */
         
         
         
        
         
         
	}

}
