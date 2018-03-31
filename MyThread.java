package com.javaPractice2;

public class MyThread extends Thread {
	

	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"<------");
		for(int i=0; i<= 10; i++)
		System.out.println("inside Run Method of MyThread");
	}

	public void start(MyThread t) {super.start();
	System.out.println("inside Start Method of MyThread");

	}

}
