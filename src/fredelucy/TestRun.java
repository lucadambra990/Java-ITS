package fredelucy;

public class TestRun {

	public static void main (String [] args) {
		
		// creo i 2 thread che condividerano il conto 
		Account cc = new Account();

		Thread fred = new AccountMng("Fred",cc);
		Thread lucy = new AccountMng("Lucy",cc);
				
		fred.start();
		lucy.start();
	}
}
