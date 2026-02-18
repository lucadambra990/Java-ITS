package esercizioadapter;

public class mainPayment {

	public static void main(String[] args) {
		
		PaymentSystem ps = new PaymentSystem();
		
		AdattatorePayment ap = new AdattatorePayment(ps);
		
		AdattatorePayment2 ap2 = new AdattatorePayment2();
		
		ap.pay(0.50);
		
		ap2.pay(0.75);
		
	}

}
