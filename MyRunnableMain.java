package com.javaPractice2;

public class MyRunnableMain {

	public static void main(String[] args) {
		System.out.println("Main Method Start---------------");
		MyRunnable m = new MyRunnable();
		Thread t = new Thread();
		Thread t1 = new Thread(m);

		t.start();// Case1: New thread will create and It will Call start method of class Thread. Which can
					//  lead to Tread Run() which have empty implementation
		t.run(); // Case2: No new thread will be created It will call thread class run(), Which is of no use
					// is it is empty implementation
		t1.start();// ******Case3: Thread will be created. It will call Thread class start method and
					// point invoke MyRunnable run()
		t1.run();// Case4:NO new thread will be created. it will execute MyRunnable run method as a normal
					// method of class MyRunnable
		// m.start();//Case5: java.lang.Error: Unresolved compilation problem:
		// The method start() is undefined for the type MyRunnable

		m.run();// Case6: NO New thread will be ceated.It will executed MyRunnable run method as a normal
				// class method
		for (int i = 0; i <= 10; i++)
			System.out.println("Main Method Ends---------------");

	}

}
