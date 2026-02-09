package lambda;

import java.util.ArrayList;
import java.util.List;

public class GestoreMele {

	public static void main(String [] args) {
		// creo una lista di mele
		ArrayList<Mela> cassetta = new ArrayList<>();
		cassetta.add(new Mela("rossa", 100));
		cassetta.add(new Mela("verde", 150));
		cassetta.add(new Mela("rossa", 200));
		cassetta.add(new Mela("gialla", 120));
		cassetta.add(new Mela("gialla", 200));
		cassetta.add(new Mela("verde", 125));
		cassetta.add(new Mela("rossa", 115));
		
		// filtro per colore verde
		
		List<Mela> risultato= filtraPerColore(cassetta);
		System.out.println("Solo mele verdi");
		for (Mela mela : risultato) {
			System.out.println(mela);
		}
		// filtro per peso
		risultato= filtraPerColore(cassetta);
		System.out.println("Solo mele con peso > 150");
		for (Mela mela : risultato) {
			System.out.println(mela);
	}
		
		// risultato = filtraMele(cassetta, new CriterioColoreVerde());
		// espressione Lambda
		risultato = filtraMele(cassetta,mela -> mela.getColore().equals("verde"));
		for (Mela mela : risultato) {
			System.out.println("Risulato filtrato con funzione lambda per colore verde" + mela);
		}
		
		risultato = filtraMele(cassetta,mela -> mela.getColore().equals("gialla") && mela.getPeso() > 150);
		for (Mela mela : risultato) {
			System.out.println("Risultato filtrato per colore e peso con la funzione lambda" + mela);
		}
	}
	
	
	public static List<Mela> filtraPerColore(List<Mela> cassetta){
		ArrayList<Mela> listaFiltrata = new ArrayList<>();
		
		for (Mela mela : cassetta) {
			if(mela.getColore().equals("verde")) {
				listaFiltrata.add(mela);
			}
		}
		return listaFiltrata;
	}
	
	public static List<Mela> filtraPerPeso(List<Mela> cassetta){
		ArrayList<Mela> listaFiltrata = new ArrayList<>();
		
		for (Mela mela : cassetta) {
			if(mela.getPeso() > 150) {
				listaFiltrata.add(mela);
			}
		}
		return listaFiltrata;
	}
	
	public static List<Mela> filtraMele(List<Mela> cassetta, Criterio criterio){
		ArrayList<Mela> filtrata = new ArrayList<>();
		for (Mela mela : cassetta) {
			if(criterio.test(mela) == true) {
				filtrata.add(mela);
			}
		}
		return filtrata;
	}
}
