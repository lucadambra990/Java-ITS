package cartoleria;

public class Azienda extends Cliente {
	
	private double saldoCc;

	public Azienda(String anagrafica,double saldoCc) {
		super(anagrafica);
		this.setSaldoCc(saldoCc);
		
	}

	@Override
	public void paga(double importo) {
		double commiss = importo/10;
		saldoCc = saldoCc - (importo + commiss);
	}

	public double getSaldoCc() {
		return saldoCc;
	}

	public void setSaldoCc(double saldoCc) {
		this.saldoCc = saldoCc;
	}

	@Override
	public String toString() {
		return "Azienda: " + super.toString() + ", saldoCc=" + saldoCc;
	}
	

}
