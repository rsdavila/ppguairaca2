package br.com.guairaca.comportamental.Template;

public class ItemRaro extends Item {
	private String nome;
	private int qtd;
	private int maxRetirada;

	public ItemRaro(String nome, int maxRetirada, int qtd) {
		this.nome = nome;
		this.qtd = qtd;
		this.maxRetirada = maxRetirada;
	}

	public String toString() {
		return nome + ". Na Loja: " + qtd + " (Max.Retirada: " + maxRetirada + ")";
	}

	public boolean validarQtd(int qtd) {
		return qtd >= 0 && qtd <= Math.min(qtd, maxRetirada);
	}

	protected int getEstoque() {
		return qtd;
	}

	protected void decEstoque(int qtdDec) {
		this.qtd -= qtdDec;
	}
}