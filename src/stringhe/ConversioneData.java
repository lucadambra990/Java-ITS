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
			System.out.println(giorno + " Gennaio " + anno);
			break;
		case 2:
			System.out.println(giorno + " Febbraio " + anno);
			break;
		case 3:
			System.out.println(giorno + " Marzo " + anno);
			break;
		case 4:
			System.out.println(giorno + " Aprile " + anno);
			break;
		case 5:
			System.out.println(giorno + " Maggio " + anno);
			break;
		case 6:
			System.out.println(giorno + " Giugno " + anno);
			break;
		case 7:
			System.out.println(giorno + " Luglio " + anno);
			break;
		case 8:
			System.out.println(giorno + " Agosto " + anno);
			break;
		case 9:
			System.out.println(giorno + " Settembre " + anno);
			break;
		case 10:
			System.out.println(giorno + " Ottobre " + anno);
			break;
		case 11:
			System.out.println(giorno + " Novembre " + anno);
			break;
		case 12:
			System.out.println(giorno + " Dicembre " + anno);
			break;
		}
		
	}

}
