package fredelucy;

public class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " sta per eseguire il prelievo" );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " ha prelevato");

		}
		else
			System.out.println("somma non disponibile");
	}
}
