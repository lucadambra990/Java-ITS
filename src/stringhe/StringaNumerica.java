package stringhe;

import java.util.Scanner;

public class StringaNumerica {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String stringa = s.nextLine();
        boolean risposta = true;
        for (int i = 0; i < stringa.length(); i++) {
        	if(!Character.isDigit(stringa.charAt(i))) {
        		risposta=false;
        		break;
        	}
        		
		}
        if(risposta) {
        	System.out.println("Testo numerico");
        }else {
        	System.out.println("Testo NON numerico");
        }


	}

}
