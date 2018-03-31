package com.javaPractice2;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		MyThreadDisplay t1 = new MyThreadDisplay(d1, "Kapil");
		MyThreadDisplay t2 = new MyThreadDisplay(d2, "Atrayee");
		t1.start();
		t2.start();
	}

}
