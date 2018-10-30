package org.legendtitans.com;

public class Payment {
	private PaymentType paymentType;
	private String paymentAmount;
	private int type;
	public Payment(String pa, int t) {
		paymentAmount = pa;
		type = t;
	}
	
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
