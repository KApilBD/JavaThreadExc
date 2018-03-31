package com.javaPractice2;

public class MyThreadOne extends Thread{
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"<------");
		Thread.currentThread().setPriority(2);
		
		for(int i=0; i<= 10; i++)
		System.out.println("inside Run Method of MyThread");
	}

}
