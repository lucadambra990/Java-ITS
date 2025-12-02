package oggetti;

import java.util.Date;

public class EsempioDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d); // toString non è obbligatorio perchè println lo fa in automatico
		
		d.setMonth(12);
		System.out.println(d);
		
		Date natale = new Date(125, 11, 25);
		System.out.println(natale);
	}

}
