
public class Payment {
	private String paymentType;
	private String paymentAmount;
	public Payment(String pt, String pa) {
		paymentType = pt;
		paymentAmount = pa;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

}
