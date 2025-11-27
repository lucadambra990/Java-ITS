package PrimoEsercizio;

public class Primitivi {

	public static void main(String[] args) {
		int a = 0;
		
		System.out.println(a);
		
		double x = 2.5;
		
		System.out.println(x);
		
		int n = 1000;
		byte numero = (byte) n; // casting
		System.out.println(numero);
		System.out.println(n);
		
		char lettera = 'a';
		boolean flag = true;
		System.out.println(lettera);
		System.out.println(flag);
		
		int n1 = 10;
		int n2 = 4;
		
		// double div = n1/n2;
		// stampa 2.0 perchè essendo due tipi uguali (int) 
		// l'operazione sarà intera. Nelle operazioni tra due tipi,
		// se sono uguali il tipo di ritorno e lo stesso,
		// altrimenti prende il tipo più preciso-
		// per risolvere possiamo castare a double uno dei due dati:
		double div2 = (double)n1/n2;
		System.out.println(div2);

	}

}
