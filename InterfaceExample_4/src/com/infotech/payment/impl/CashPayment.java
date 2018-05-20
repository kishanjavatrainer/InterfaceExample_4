package com.infotech.payment.impl;

import com.infotech.payment.Payment;

//Cash Payment implementation of Payment interface
public class CashPayment implements Payment {
	// method implementation according to cash payment functionality
	public void payment(double amount) {
		System.out.println("Cash Payment of amount " + amount);
	}
}
