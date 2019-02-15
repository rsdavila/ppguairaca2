package br.com.guairaca.estrutural.Flyweight;

public abstract class ErvilhaCombinada implements Ervilha {
	private Ervilha ervilhaPai = null;

	public ErvilhaCombinada(Ervilha ervilhaPai) {
		this.ervilhaPai = ervilhaPai;
	}

	public void setErvilhaPai(Ervilha ervilhaPai) {
		this.ervilhaPai = ervilhaPai;
	}

	public void combinar() {
		if (ervilhaPai != null) {
			ervilhaPai.combinar();
			System.out.print(" x ");
		} else {
			System.out.println();
		}
	}
}