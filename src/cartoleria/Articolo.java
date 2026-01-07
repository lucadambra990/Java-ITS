package cartoleria;

public class Articolo {
	private String marca;
	private String modello;
	private String colore;
	private double costo;
	private double prezzo;
	
	public Articolo(String marca, String modello, String colore, double costo, double prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.costo = costo;
		this.prezzo = costo*2;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public String toString() {
		return "Articolo [marca=" + marca + ", modello=" + modello + ", colore=" + colore + ", costo=" + costo
				+ ", prezzo=" + prezzo + "]";
	}
	
	
	
	
}
