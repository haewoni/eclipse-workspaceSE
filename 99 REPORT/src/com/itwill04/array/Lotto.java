package com.itwill04.array;
/*
 * 로또 번호 6개(1set)를 가지고 있는 객체
 */

public class Lotto {
	private int[] noArray;
	public Lotto() {
		noArray= new int[6];
		this.gerenateNumber();		
	}
	private void gerenateNumber() {
		for (int i = 0; i < noArray.length; i++)
			noArray[i] = (int)(Math.random()*45)+1;
		}
	
	public void print() {
		for (int i = 0; i < noArray.length; i++) {
			System.out.print(noArray[i]+"");
		}
		System.out.println();
		
	}

}
