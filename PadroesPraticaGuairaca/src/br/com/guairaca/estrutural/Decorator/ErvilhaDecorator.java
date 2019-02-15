package br.com.guairaca.estrutural.Decorator;

public abstract class ErvilhaDecorator implements Ervilha {
	private Ervilha ervilhaPai = null;

	public ErvilhaDecorator(Ervilha ervilhaPai) {
		this.setErvilhaPai(ervilhaPai);
	}

	public void setErvilhaPai(Ervilha ervilhaPai) {
		this.ervilhaPai = ervilhaPai;
	}

	public void combinar() {
		if (ervilhaPai != null) {
			ervilhaPai.combinar();
			System.out.println(" x ");
		} else {
			System.out.println();
		}
	}
}
