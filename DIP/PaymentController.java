public class PaymentController {

	private IPayMethod paymentMethod;
	
	public void setPaymentMethod(IPayMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		paymentMethod.pay();
	}
}
