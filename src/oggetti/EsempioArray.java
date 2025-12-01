package oggetti;

import java.util.Scanner;

public class EsempioArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		// array[2] = 111; valore dato manualmente 
		Scanner sq = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Inserisci un numero: ");
			array[i] = sq.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		char[] nome = {'n','e','r','e','s'};
		System.out.println(nome.length);
		//nome.lenght = 12; NON compila
		
		for (char c : nome) {
			System.out.print(c);
			// println stampa ogni carattere sempre a capo
			// print non crea nuove righe
		}
	}

}
