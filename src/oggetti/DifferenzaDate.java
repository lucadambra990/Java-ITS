package oggetti;

import java.util.Date;
import java.util.Scanner;

public class DifferenzaDate {

	public static void main(String[] args) {
		Scanner dt = new Scanner(System.in);
		Date d = new Date();
		Date uscita = new Date();
		
		int new_ora = 0;
		int new_min = 0;
		System.out.println("Inserisci le ore: ");
			int oreU = dt.nextInt();
		System.out.println("Inserisci i minuti: ");
			int minU = dt.nextInt();
		
		if(oreU>=0 && oreU<=24 && minU>=0 && minU<=60) {
			new_ora = oreU - d.getHours();
			new_min = minU - d.getMinutes();
			if (new_min < 0) {
				new_min +=60;
				new_ora --;
			}
		}else {
			System.out.println("Errore");
		}
		
		uscita.setHours(22);
		uscita.setMinutes(00);
		
		long ora = (uscita.getHours() - d.getHours())-1;
		long min = 60 - d.getMinutes();
		
		System.out.println("Mancano " + ora + " ore e " + min + " minuti alla fine della lezione");
		System.out.println("Mancano " + new_ora + " ore e " + new_min + " minuti alla fine della lezione");
		
		dt.close();

	}

}
