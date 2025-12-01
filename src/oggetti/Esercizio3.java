package oggetti;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sq = new Scanner(System.in);
		
		for (int i = 0; i < array.length/2; i++) {
			System.out.println("Inserisci un numero: ");
			array[i] = sq.nextInt();
			array[array.length/2+i] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Gli elementi dell'array sono: " + array[i]);
		}
		sq.close();
	}

}
