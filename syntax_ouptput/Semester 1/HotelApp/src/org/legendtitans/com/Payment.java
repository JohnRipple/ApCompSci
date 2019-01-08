package org.legendtitans.com;

public class Payment {
	private double paymentAmount;
	private int paymentType;
	public Payment(double pa, int t) {
		paymentAmount = pa;
		paymentType = t;
	}
	
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int type) {
		this.paymentType = type;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
