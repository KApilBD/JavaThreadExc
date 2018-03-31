package com.javaPractice2;

public class MyThreadDisplay extends Thread {

	Display d;
	String name;

	public MyThreadDisplay(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
