package com.tcs.errordemo;

public class ErrorDemo {
	public static void main(String[]args) {
		new ErrorDemo().infiniteMethod();
	}
	
	private void infiniteMethod() {
		infiniteMethod();
	}

}
