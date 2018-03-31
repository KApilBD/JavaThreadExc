package com.javaPractice2;

public class MyThreadYield extends Thread{
	
	public void run(){
		
		for (int i=0; i<=50; i++)
		System.out.println("IN Side Child Thread-------------");
		Thread.yield();
	}

}
