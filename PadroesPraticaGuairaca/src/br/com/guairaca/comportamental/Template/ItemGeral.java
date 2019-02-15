package br.com.guairaca.comportamental.Template;

public class ItemGeral extends Item {
	private String nome;
	private int qtd;
	private int qtdMatriz;

	public ItemGeral(String nome, int qtd, int qtdMatriz) {
		this.nome = nome;
		this.qtd = qtd;
		this.qtdMatriz = qtdMatriz;
	}

	public String toString() {
		return nome + ". Na Loja: " + qtd + " Na Matriz: " + qtdMatriz;
	}

	public boolean validarQtd(int qtd) {
		return qtd >= 0;
	}

	protected int getEstoque() {
		return qtd + qtdMatriz;
	}

	protected void decEstoque(int qtdDec) {
		if (qtdDec > this.qtd) {
			qtdDec -= this.qtd;
			this.qtd = 0;
			qtdMatriz -= qtdDec;
		} else {
			this.qtd -= qtdDec;
		}
	}
}