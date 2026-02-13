package stream;

public class Prodotto {

	private int codice;
	private String descrizione;
	private String categoria;
	private int quantita;
	private Boolean disponibilta;
	private double prezzo;
	private double sconto;
	public Prodotto(int codice, String descrizione, String categoria, int quantita, Boolean disponibilta, double prezzo,
			double sconto) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.quantita = quantita;
		this.disponibilta = disponibilta;
		this.prezzo = prezzo;
		this.sconto = sconto;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public Boolean getDisponibilta() {
		return disponibilta;
	}
	public void setDisponibilta(Boolean disponibilta) {
		this.disponibilta = disponibilta;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getSconto() {
		return sconto;
	}
	public void setSconto(double sconto) {
		this.sconto = sconto;
	}
	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", descrizione=" + descrizione + ", categoria=" + categoria
				+ ", quantita=" + quantita + ", disponibilta=" + disponibilta + ", prezzo=" + prezzo + ", sconto="
				+ sconto + "]";
	}
	
	
}
