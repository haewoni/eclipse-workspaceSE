package com.itwill.review.상속;

public class 상속Main {

	public static void main(String[] args) {
		/*
		 * 상위로 casting 
		 */
		Parent[] pArray = {
				new ChildA(),
				new ChildA(),
				new ChildA(),
				new ChildB(),
				new ChildB(),
				new ChildB(),
				new ChildC(),
				new ChildC(),
				new ChildC(),
				new ChildC(),
				new ChildD(),
				new ChildD()
		};


		for (int i = 0; i < pArray.length; i++) {
			pArray[i].method1();
			pArray[i].method2();
		}
			
	}

}
