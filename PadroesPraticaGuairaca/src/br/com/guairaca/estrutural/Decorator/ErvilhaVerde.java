package br.com.guairaca.estrutural.Decorator;

public class ErvilhaVerde extends ErvilhaDecorator {
	public ErvilhaVerde(Ervilha ervilhaPai) {
		super(ervilhaPai);
	}

	public ErvilhaVerde() {
		super(null);
	}

	public void combinar() {
		super.combinar();
		mostrarCor();
	}

	public void mostrarCor() {
		System.out.println("Ervilha Verde");
	}
}