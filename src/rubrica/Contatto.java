package rubrica;

public class Contatto {
	private String nome;
	private String cognome;
	private final Integer numero;
	
	
	public Contatto(String nome, String cognome, Integer numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	public Integer getNumero() {
		return numero;
	}


	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + "]";
	}
	
	
	
	
}
