package azienda;

import java.util.Date;

public class MainImpiegato {

	public static void main(String[] args) {
		System.out.println(Impiegato.getContatore());
		
		Impiegato imp1 = new Impiegato("Mirko",1500,new Date());
		
		System.out.println(Impiegato.getContatore());
		System.out.println(imp1);
		
		Impiegato imp2 = new Impiegato("dioni",1800,new Date(120,5,5));
		System.out.println(Impiegato.getContatore());
		System.out.println(imp2);
		
		System.out.println(imp1.getAnnoAssunzione());
		System.out.println(imp2.getAnnoAssunzione());
		
		imp1.IncSalario(100);
		System.out.println(imp1);
		
		imp2.IncSalario(150);
		System.out.println(imp2);
		
		Azienda azienda = new Azienda("eng");
		System.out.println(azienda);
		
		azienda.assume(imp1);
		azienda.assume(imp2);
		System.out.println(azienda);
		
		azienda.incrAllSalario(50);
		
		System.out.println(azienda);
	}

}
