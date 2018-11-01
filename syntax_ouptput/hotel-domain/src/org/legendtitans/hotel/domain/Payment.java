package org.legendtitans.hotel.domain;

public class Payment {
	private double paymentAmount;	
	private int paymentType;

	public Payment() {
		
	}
	public Payment(double pa, int pt) {
		paymentAmount = pa;
		paymentType = pt;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double pa) {
		paymentAmount = pa;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int pt) {
		paymentType = pt;
	}
}
