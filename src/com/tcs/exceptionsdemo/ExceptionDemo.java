package com.tcs.exceptionsdemo;

public class ExceptionDemo {
	public static void main(String[] args) throws MyCheckedException {
		demo2();

		// demo1();
	}

	private static void demo2() {
		try {
			throw new MyCheckedException();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void demo1() {
		try {
			System.out.println((1 / 0));
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("division by zero is not allowed");
			// TODO: handle exception
		}
	}

}
