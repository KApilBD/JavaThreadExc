package com.javaPractice2;

public class MyThreadMain {

	public static void main(String[] args) {

		System.out.println("Start of main Method----"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("Changed Priority of main Thread "+Thread.currentThread().getPriority());

		MyThread t = new MyThread();
		System.out.println(Thread.currentThread().getName()+"<=======");
		t.start();
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		t.setName("My First Thread");
		for(int i=0; i<=10;i++)
		System.out.println("End of main Method");
	}

}
