package oggetti;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		int[] array = new int[4];
		Scanner sq = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Inserisci un numero: ");
			array[i] = sq.nextInt();
		}
		int s=0;
		int sp=0; 
		int sd=0;
		double m=1;
		for (int i=0;i<array.length;i++) {
			s=s+array[i];
			if (array[i]%2==0) {
				sp = sp + array[i];
			}else {
				sd = sd + array[i];
			}
		}
		m=s/array.length;
		System.out.println("La somma di tutti gli elementi è "+ s);
		System.out.println("La somma degli elemnti pati è " + sp);
		System.out.println("La somma degli elementi dispari è " + sd);
		System.out.println("La media di tutti gli elementi è " + m);
		sq.close();
	}

}
