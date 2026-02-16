package thread;

public class Corridori implements Runnable {
	
	private String nome;
	static int p = 1;
	
	public Corridori(String nome) {
		super();
		this.nome = nome;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(nome + " ha completato la tappa " + i);
			try {
				Thread.sleep((long) (Math.random()*601) + 200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(nome + " è arrivato in posizione " + p);
		p++;
		
	}


	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
}
