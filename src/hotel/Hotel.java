package hotel;

import java.util.ArrayList;
import java.util.Iterator;


public class Hotel{	
	ArrayList<Room>listaStanze = new ArrayList<Room>();
	
	
	public Hotel() {
		Room r1 = new Room(100, 1, 2);
		Room r2 = new Room(112, 1, 3);
		Room r3 = new Room(124, 1, 2);
		Room r4 = new Room(111, 1, 3);
		Room r5 = new Room(201, 2, 4);
		Room r6 = new Room(210, 2, 4);
		Room r7 = new Room(205, 2, 2);
		Room r8 = new Room(222, 2, 3);
		
		listaStanze.add(r1);
		listaStanze.add(r2);
		listaStanze.add(r3);
		listaStanze.add(r4);
		listaStanze.add(r5);
		listaStanze.add(r6);
		listaStanze.add(r7);
		listaStanze.add(r8);
	}
	
public static void main(String[] args) {
	Hotel h = new Hotel();
	
	
	int totale = h.postiLetto(); 
    System.out.println("Totale posti letto: " + totale);
    
    int totalePiano1 = h.lettoPerPiano(1);
    System.out.println("Totale posto letto al primo piano " + totalePiano1);
    
    int totalePiano2 = h.lettoPerPiano(2);
    System.out.println("Totale posto letto al secondo piano " + totalePiano2);
    
    int totaleDoppiePerPiano = h.totCamereDoppiePerPiano(1,2);
    System.out.println("Le camere doppie per questo piano sono: " + totaleDoppiePerPiano);
    
    
	
	}
public int postiLetto(){
	int tot = 0;
	for (int i = 0; i < listaStanze.size(); i++) {
		tot += listaStanze.get(i).getPostiLetto();
	}
	return tot;
}

public int lettoPerPiano(int piano) {
	int tot = 0;
	for (int i = 0; i < listaStanze.size(); i++) {
		if(piano == listaStanze.get(i).getPiano()) {
			tot += listaStanze.get(i).getPostiLetto();
		}
		
	}
	return tot;
}

public int totCamereDoppiePerPiano(int piano, int posti) {
	int totDoppie = 0;
	for (int i = 0; i < listaStanze.size(); i++) {
		if(piano == listaStanze.get(i).getPiano() && posti == listaStanze.get(i).getPostiLetto()) {
			totDoppie += listaStanze.get(i).getPostiLetto();
		}
		
	}
	return totDoppie;
}

public Room searchRoom(int piano,int posti) {
	for (int i = 0; i < listaStanze.size(); i++) {
		if(piano == listaStanze.get(i).getPiano() && posti == listaStanze.get(i).getPostiLetto()) {
			return listaStanze.get(i);
		}
		
	}
	return null;
}



}


