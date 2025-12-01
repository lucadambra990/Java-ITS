package oggetti;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int[] array1 = new int[3];
		Scanner sq = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci un numero: ");
			array[i] = sq.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Gli elmenti del primo array sono: " + array[i]);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Gli elmenti del secondo array sono: " + array[i]);
		}
		
		sq.close();
	}

}
