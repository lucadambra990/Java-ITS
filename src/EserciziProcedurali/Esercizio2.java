package EserciziProcedurali;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci il primo numero n");
			int n = s.nextInt();
		System.out.println("Inserisci il secondo numero k");
			int k = s.nextInt();
			double sm = 0;
			for(int i=1;i<=n;i++) {
				// sommatoria
				sm = sm + k*(k*i);
			}
		System.out.println("La sommatoria di k è " + sm);
		s.close();
	}

}
