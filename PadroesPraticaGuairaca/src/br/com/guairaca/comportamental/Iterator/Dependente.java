package br.com.guairaca.comportamental.Iterator;

public class Dependente {
	private String nome;
	private GrauParentesco grauParentesco;

	public Dependente(String nome, GrauParentesco grauParentesco) {
		this.nome = nome;
		this.grauParentesco = grauParentesco;
	}

	public String getNome() {
		return nome;
	}

	public String getGrauParentesco() {
		switch (grauParentesco) {
		case CONJUGE:
			return "Conjuge";
		case FILHO:
			return "Filha/o";
		case PAI:
			return "Pai/Mae";
		}
		return null;
	}

	public String toString() {
		return this.getNome() + " " + this.getGrauParentesco();
	}
}