package esercizioadapter;

public class AdattatorePayment implements PaymentProcessor{
	
	private PaymentSystem ps;
	

	public AdattatorePayment(PaymentSystem ps) {
		super();
		this.ps = ps;
	}
	


	public PaymentSystem getPs() {
		return ps;
	}



	public void setPs(PaymentSystem ps) {
		this.ps = ps;
	}



	@Override
	public void pay(double amount) {
		int price = (int)(amount * 100);
		ps.makePayment(price);
	}


}
