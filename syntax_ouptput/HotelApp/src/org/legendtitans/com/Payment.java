package org.legendtitans.com;

public class Payment {
	private PaymentType paymentType;
	private double paymentAmount;
	public Payment(PaymentType pt, double pa) {
		paymentType = pt;
		paymentAmount = pa;
	}
	
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
