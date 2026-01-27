package GenericaPila;

import java.util.LinkedList;

public class mainPilaBase {

	public static void main(String[] args) {
		
		pila p1 = new pila();
		p1.add("primo");
		p1.add("secondo");
		p1.add("terzo");
		p1.add("quarto");
		p1.add("quinto");
	
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
	}

}
