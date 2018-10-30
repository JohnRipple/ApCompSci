package org.legendtitans.hotel.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Payment.
 */
public class Payment {
	
	/** The payment amount. */
	private double paymentAmount;
	
	/** The payment type. */
	private int paymentType;
	
	/**
	 * Instantiates a new payment.
	 *
	 * @param pa the pa
	 * @param pt the pt
	 */
	public Payment(double pa, int pt) {
		paymentAmount = pa;
		paymentType = pt;
	}

	/**
	 * Gets the payment amount.
	 *
	 * @return the payment amount
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * Sets the payment amount.
	 *
	 * @param pa the new payment amount
	 */
	public void setPaymentAmount(double pa) {
		paymentAmount = pa;
	}

	/**
	 * Gets the payment type.
	 *
	 * @return the payment type
	 */
	public int getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the payment type.
	 *
	 * @param pt the new payment type
	 */
	public void setPaymentType(int pt) {
		paymentType = pt;
	}
}
