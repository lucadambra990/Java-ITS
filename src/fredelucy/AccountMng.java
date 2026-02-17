package fredelucy;

public class AccountMng extends Thread {

	private Account cc;
	
	public AccountMng(String nome, Account cc) {
		super(nome);
		this.cc = cc;
	}

	@Override
	public void run() {
	
		for(int i = 0; i < 5; i++) {
			cc.withdraw(200);
			System.out.println(">>>> Saldo attuale : " +  cc.getBalance());
		}
	}
}
