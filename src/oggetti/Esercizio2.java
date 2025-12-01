package oggetti;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		int[] array = new int[3];
		int[] array1 = new int[3];
		Scanner sq = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci un numero: ");
			array[i] = sq.nextInt();
		}
		
		for (int i = array1.length-1,j=0; i >= 0 && j < array.length; i--,j++) {
			array1[i] = array[j];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Gli elementi del primo array sono: " + array[i]);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Gli elementi del primo array sono: " + array1[i]);
		}
		sq.close();
	}

}
