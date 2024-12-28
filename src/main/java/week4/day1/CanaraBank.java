package week4.day1;

public abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment type is case on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment type is UPI payment");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment type is card Payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment type is internet Banking");
		
	}
	
	public abstract void recordPaymentDetails();

}
