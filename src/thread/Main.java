package thread;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//		Counter c1 = new Counter("LUCA",20);
//		c1.start();
//		Counter c2 = new Counter("Buongiorno",20);
//		c2.start();
		
		CountDown cd = new CountDown(20, "Capodanno");
		Thread t = new Thread(cd, cd.getNome());
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fine lavoro del main");

	}

}
