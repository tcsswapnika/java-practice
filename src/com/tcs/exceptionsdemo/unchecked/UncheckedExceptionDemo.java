package com.tcs.exceptionsdemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.work();

	}

}

class User {
	int age = 70;

	public void work() {
		if (age <= 18) {
			throw new MyUncheckedException("No Child Labour");
			// System.out.println("Unreachable code");
		} else if (age > 60) {
			throw new MyUncheckedException("Age should not be more than 60");
		}

	}
}
