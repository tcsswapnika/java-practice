package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age=10;
	public StaticBlockDemo() {
		System.out.println("in constructor..");
	}
	static {
		System.out.println("this is static block"+ age);
	}
	public static void main(String[]args) {
//		StaticBlockDemo blockdemo = new StaticBlockDemo();
//		new StaticBlockDemo();
	}

}
