package adapter;

import java.util.Date;

import azienda.Impiegato;

public class MainImpiegato {

	public static void main(String[] args) {
		
			Impiegato imp = new Impiegato("Mario", 1600, new Date(100,1,1));
			
			System.out.println(imp);
			
			AdattatoreImpiegato adapt = new AdattatoreImpiegato(imp);
			System.out.println(adapt);

	}

}
