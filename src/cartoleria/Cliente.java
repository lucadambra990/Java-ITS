package cartoleria;

public abstract class Cliente {

	private String anagrafica;

	public Cliente(String anagrafica) {
		super();
		this.anagrafica = anagrafica;
	}

	public String getAnagrafica() {
		return anagrafica;
	}

	public void setAnagrafica(String anagrafica) {
		this.anagrafica = anagrafica;
	}

	@Override
	public String toString() {
		return "Cliente [anagrafica=" + anagrafica + "]";
	}
	
	public abstract void paga(double importo);
}
