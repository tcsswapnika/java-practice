package com.tcs.threads;

public class Manager {
	public static void main(String[] args) {
		Worker worker1 = new Worker();
		Thread t1 = new Thread(worker1);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().toString() + i);
		}

	}

}
