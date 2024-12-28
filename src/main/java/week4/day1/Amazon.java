package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void recordPaymentDetails() {
		System.out.println("Track the payment details in amazon portal");
		
	}
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}

}
