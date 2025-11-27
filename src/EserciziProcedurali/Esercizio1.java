package EserciziProcedurali;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
			int n = s.nextInt();
		System.out.println("Inserisci il secondo numero: ");
			int k = s.nextInt();
			int ris = 1;
			for (int i = 0; i < k; i++) {
	            ris = ris * n;
	        }

	        System.out.println(n + " elevato alla " + k + " è: " + ris);
	    s.close();
	}

}
