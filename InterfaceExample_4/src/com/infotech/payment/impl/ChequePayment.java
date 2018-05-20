package com.infotech.payment.impl;

import com.infotech.payment.Payment;

//Cheque Payment implementation of Payment interface
public class ChequePayment implements Payment {
	// method implementation according to cheque payment functionality
	public void payment(double amount) {
		System.out.println("Cheque Payment of amount " + amount);
	}
}
