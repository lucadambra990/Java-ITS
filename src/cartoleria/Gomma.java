package cartoleria;

public class Gomma extends Articolo {
	
	private String dimensione;
	private String forma;

	public Gomma(String marca, String modello, String colore, double costo, double prezzo,String dimensione,String forma) {
		super(marca, modello,costo, prezzo);
		this.setDimensione(dimensione);
		this.setForma(forma);
	}

	public String getDimensione() {
		return dimensione;
	}

	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Gomma [dimensione=" + dimensione + ", forma=" + forma + ", toString()=" + super.toString() + "]";
	}
	
}
