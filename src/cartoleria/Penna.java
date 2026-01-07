package cartoleria;

public class Penna extends Articolo {

	private String colore;
	
	public Penna(String marca, String modello,double costo, double prezzo,String colore) {
		super(marca, modello, costo, prezzo);
		this.setColore(colore);
		
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Penna [colore=" + colore + ", toString()=" + super.toString() + "]";
	}
	
	
}
