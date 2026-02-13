package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaProdotti {

	public static void main(String[] args) {
		
		ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>();
		catalogo.add(new Prodotto(133, "latte", "alimentare", 100, true, 2.5, 0));
		catalogo.add(new Prodotto(134, "latte UHT", "alimentare", 0, false, 2.5, 0));
		catalogo.add(new Prodotto(113, "pomodori", "alimentare", 50, true, 1.5, 5));
		catalogo.add(new Prodotto(123, "libro", "media", 10, true, 10, 5));
		catalogo.add(new Prodotto(155, "maglietta", "abbigliamento", 20, true, 25, 10));
		catalogo.add(new Prodotto(184, "cd musicale", "media", 0, false, 12.5, 0));
		catalogo.add(new Prodotto(143, "smartphone", "elettronica", 80, true, 250, 10));
		catalogo.add(new Prodotto(144, "cuffie", "elettronica", 0, false, 250, 10));
		
		System.out.println("-------Il numero di cateforie--------");
		long countCategoria = 
				catalogo.stream()
				.map(p -> p.getCategoria())
				.distinct()
				.count();
		System.out.println("Il numero di categorie totali sono " + countCategoria);
		
		System.out.println("-------Le categorie ordinate in ordine alfabetico e senza doppioni--------");
		List<String> orderCategory =
				catalogo.stream()
				.map(p -> p.getCategoria())
				.distinct()
				.sorted((s1,s2)-> s1.compareTo(s2))
				.collect(Collectors.toList());
		System.out.println("Le categorie ordinate in ordine alfabetico e senza doppioni sono " + orderCategory);
		
		System.out.println("---------I nomi dei prodotti ordinati per prezzo crescente----------");
		// List<String> prodottiPerPrezzo
		

	}
	
	
	

}
