package cartoleria;

public class Test {

	public static void main(String[] args) {
		
		Privato p = new Privato("Gennaro", 200);
		p.paga(10);
		System.out.println(p);
		
		Azienda a = new Azienda("its",1000);
		a.paga(100);
		System.out.println(a);

	}

}
