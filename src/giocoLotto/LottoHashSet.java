package giocoLotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LottoHashSet {

	public static void main(String[] args) {
		HashSet<Integer> ruotaLotto = new HashSet<Integer>();
		HashSet<Integer> giocata = new HashSet<Integer>();
		Scanner numero = new Scanner(System.in);
		Scanner quanti = new Scanner(System.in);
		
		
		while(ruotaLotto.size() < 5) {
			int randomNum = (int) (Math.random() * 90) + 1;
			ruotaLotto.add(randomNum);
		}
		System.out.println(ruotaLotto);
		
		
		System.out.print("Inserisci quanti numeri vuoi giocare (minimo 1, massimo 5) : ");
		int num = quanti.nextInt();
		int j = 0;
		while(j<num) {
			System.out.print("Inserisci i numeri che vuoi giocare : ");
			int n = quanti.nextInt();
			if (giocata.add(n) == true) {
				j++;
			}
		}
		System.out.println("--------------------se tutt i numeri sono stati indovinati--------------------------");
		boolean tuttiIndovinati = ruotaLotto.containsAll(giocata);
		if (tuttiIndovinati == true) {
			System.out.println("Complimenti hai vinto 1000000 di euro, goditi il viaggetto!!");
		}else {
			System.out.println("Mi sa che ti tocca tornare a lavoro");
		}
		
		System.out.println("-----------------se solo alcuni numeri sono stati indovinati-----------------------------");
		int punti = 0;
		for (Integer nGiocato : giocata) {
			if(ruotaLotto.contains(nGiocato)) {
				punti ++;
			}
		}
		System.out.println("Hai fatto " + punti + " punti.");
		
		
		

	}

}
