package com.itwill01.member_method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		int result= calculator.add(23,34); 
		System.out.println(result);
		
		result = calculator.subtract(23,34);
		System.out.println(result);
		
		result = calculator.multiple(23,34);
		System.out.println(result);
		
		result = calculator.div(45435,34);
		System.out.println(result);
		
     }
		
		/*
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		*/
		
		



	
}


