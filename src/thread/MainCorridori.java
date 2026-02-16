package thread;

public class MainCorridori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		Corridori cr = new Corridori("Marcell Jacobs");
		Corridori cr1 = new Corridori("Usain Bolt");
		Corridori cr2 = new Corridori("Alisson Santos");
		
		Thread t = new Thread(cr,cr.getNome());
		t.start();
		
		Thread t1 = new Thread(cr1,cr1.getNome());
		t1.start();
		
		Thread t2 = new Thread(cr2,cr2.getNome());
		t2.start();
	}

}
