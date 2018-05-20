package com.infotech.payment.impl;

import com.infotech.payment.Payment;

//CreditCard Payment implementation of Payment interface
public class CreditCardPayment implements Payment {
	// method implementation according to credit card payment functionality
	public void payment(double amount) {
		System.out.println("CreditCard Payment of amount " + amount);
	}
}