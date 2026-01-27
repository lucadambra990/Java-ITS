package liste;

import java.util.LinkedList;

public class EsempioLinkedList {

	public static void main(String[] args) {
		LinkedList<String> fiori = new LinkedList<String>();
		System.out.println(fiori);
		System.out.println(fiori.size());

		fiori.add("rosa");
		fiori.add("margherita");
		fiori.add("orchidea");
		fiori.add("viola");

		for (String string : fiori) {
			System.out.println(string);
		}
		
		System.out.println("--------------------------");
		
		fiori.add(1, "narciso");
		
		for (String string : fiori) {
			System.out.println(string);
		}
		
		System.out.println("-------------add alla prima posizioe-------------");
		
		fiori.addFirst("tulipano");
		
		
		
		for (String string : fiori) {
			System.out.println(string);
		}
		
		System.out.println("-----------dove si trova quella stringa---------------");
		
		System.out.println(fiori.indexOf("rosa"));
		
		System.out.println("------------remove--------------");
		
		System.out.println("ho rimosso l'ultimo: " + fiori.removeLast());
		System.out.println("ho rimosso il primo: " + fiori.removeLast());
		System.out.println("---------lista aggiornata---------");
		for (String string : fiori) {
			System.out.println(string);
		}
	}

}
