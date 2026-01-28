package azienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EsempioComparable {

	public static void main(String[] args) {

		// voglio ordinare una lista di impiegati per nome
		ArrayList<Impiegato> lista = new ArrayList<>();
		lista.add(new Impiegato("mario", 1500, new Date(120, 1, 1)));
		lista.add(new Impiegato("anna", 1700, new Date(115, 1, 1)));
		lista.add(new Impiegato("giulia", 1300, new Date(100, 1,1)));
		
		Collections.sort(lista);
		
		for (Impiegato impiegato : lista) {
			System.out.println(impiegato);
		}

		System.out.println();
		
		// adesso voglio ordinarla per salario
		Collections.sort(lista, new ComparatorImpSalario());
		
		for (Impiegato impiegato : lista) {
			System.out.println(impiegato);
		}
		
	}

} 

