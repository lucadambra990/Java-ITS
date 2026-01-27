package bankaccount;

import java.time.LocalDate;

public abstract class Movimenti {
	private String tipo;
	private LocalDate data;
	private double importo;
	
	public Movimenti(String tipo, LocalDate data, double importo) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.importo = importo;
	}

	public String getTipo() {
		return tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public double getImporto() {
		return importo;
	}
	
}
