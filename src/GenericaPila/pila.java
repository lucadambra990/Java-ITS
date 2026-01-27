package GenericaPila;

import java.util.LinkedList;

public class pila {
	LinkedList<Object> pila= new LinkedList<Object>();
	
	
	public pila() {
		
	}

	public Object remove(){
		if(pila.isEmpty()) {
			return null;
		}
		return pila.removeLast();
	}
	
	public void add(Object elem) {
		pila.addLast(elem);
	}

	@Override
	public String toString() {
		return "pila [pila=" + pila + "]";
	}
	
	
}
