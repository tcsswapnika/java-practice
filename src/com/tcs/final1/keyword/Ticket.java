package com.tcs.final1.keyword;

public class Ticket { // immutable
	private final String movie = "Sholay";
	private float price;

	public final void sell() { // cannot be overridden

	}

	public final void sell(float price) {

	}

}

class IllegalTicket extends Ticket {
//	public final void sell() {
//
//	}
}
