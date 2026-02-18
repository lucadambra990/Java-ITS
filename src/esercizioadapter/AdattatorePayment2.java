package esercizioadapter;

public class AdattatorePayment2 extends PaymentSystem implements PaymentProcessor{
	

	@Override
	public void pay(double amount) {
		int price = (int)(amount * 100);
		this.makePayment(price);
		
	}

		
}
