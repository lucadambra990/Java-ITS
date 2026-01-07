package cartoleria;

import java.util.ArrayList;

public class Cartoleria {
	private String nome;
	private ArrayList<Articolo>listaArt;
	
	public Cartoleria(String nome) {
		super();
		this.nome = nome;
		this.listaArt = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Articolo> getListaArt() {
		return listaArt;
	}

	public void setListaArt(ArrayList<Articolo> listaArt) {
		this.listaArt = listaArt;
	}

	@Override
	public String toString() {
		return "Cartoleria [nome=" + nome + ", listaArt=" + listaArt + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
