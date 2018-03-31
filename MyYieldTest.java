package com.javaPractice2;

public class MyYieldTest  {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Starts:");
		
		MyThreadYield t = new MyThreadYield();
		
		t.start();
		
		for (int i=0; i<=10; i++)
		System.out.println("IN Side Main Thread>>>>>>>>>>>>>>>>>>");

		System.out.println("Main Thread Ends:");
	}

}
