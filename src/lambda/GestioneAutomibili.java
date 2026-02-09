package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GestioneAutomibili {

	public static void main(String[] args) {
		ArrayList<Automobile> Motorizzazione = new ArrayList<>();
		Motorizzazione.add(new Automobile("Peugeot", "107", "AA102EE"));
		Motorizzazione.add(new Automobile("Fiat", "500", "BB245KT"));
		Motorizzazione.add(new Automobile("Volkswagen", "Golf", "CR781LM"));
		Motorizzazione.add(new Automobile("Renault", "Clio", "DD309FR"));
		Motorizzazione.add(new Automobile("Toyota", "Yaris", "EP654NS"));
		Motorizzazione.add(new Automobile("Ford", "Focus", "FG912RH"));
		Motorizzazione.add(new Automobile("Peugeot", "208", "HK337TV"));
		Motorizzazione.add(new Automobile("Opel", "Corsa", "JL560PW"));
		Motorizzazione.add(new Automobile("Audi", "A3", "MN823CZ"));
		Motorizzazione.add(new Automobile("BMW", "320d", "PR448GX"));
		Motorizzazione.add(new Automobile("Alfa Romeo", "Giulietta", "SV296BD"));
		
		List<Automobile> listaAuto = filtraAuto(Motorizzazione, t -> t.getMarca().equals("Peugeot"));
		for (Automobile automobile : listaAuto) {
			System.out.println(automobile);
		}

	}
	
	public static List<Automobile> filtraAuto(List<Automobile> Motorizzazione, Predicate<Automobile> a){
		ArrayList<Automobile> listaFiltro = new ArrayList<Automobile>();
		for (Automobile automobile : Motorizzazione) {
			if(a.test(automobile) == true) {
				listaFiltro.add(automobile);
			}
		}
		return listaFiltro;
	}
	

}
