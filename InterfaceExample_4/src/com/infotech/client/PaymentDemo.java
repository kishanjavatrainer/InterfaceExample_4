package com.infotech.client;

import com.infotech.payment.Payment;
import com.infotech.payment.impl.CashPayment;
import com.infotech.payment.impl.ChequePayment;
import com.infotech.payment.impl.CreditCardPayment;

public class PaymentDemo {
	public static void main(String[] args) {
		// Payment interface reference holding the CashPayment object
		Payment payment = new CashPayment();
		payment.payment(134.67);
		
		// Payment interface reference holding the CreditCardPayment object
		payment = new CreditCardPayment();
		payment.payment(2347.89);
		
		// Payment interface reference holding the ChequePayment object
		payment = new ChequePayment();
		payment.payment(1567.45);
	}
}
