package stringhe;

import java.util.Scanner;

public class ConversioneData {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci un data come stringa (GG/MM/AAAA): ");
		String Data = s.nextLine();
		
		
		String[] parti = Data.split("/");
		
		int giorno = Integer.parseInt(parti[0]);
		int mese = Integer.parseInt(parti[1]);
		int anno = Integer.parseInt(parti[2]);
		
		switch(mese) {
		case 1:
			System.out.println("Gennaio");
			break;
		case 2:
			System.out.println("Febbraio");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Aprile");
			break;
		case 5:
			System.out.println("Maggio");
			break;
		case 6:
			System.out.println("Giugno");
			break;
		case 7:
			System.out.println("Luglio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Settembre");
			break;
		case 10:
			System.out.println("Ottobre");
			break;
		case 11:
			System.out.println("Novembre");
			break;
		case 12:
			System.out.println("Dicembre");
			break;
		}
		
		System.out.println(giorno + mese + anno);
	}

}
