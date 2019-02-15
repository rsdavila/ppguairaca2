package br.com.guairaca.estrutural.Decorator;

public class ErvilhaVermelha extends ErvilhaDecorator {
	public ErvilhaVermelha(Ervilha ervilhaPai) {
		super(ervilhaPai);
	}

	public ErvilhaVermelha() {
		super(null);
	}

	public void combinar() {
		super.combinar();
		mostrarCor();
	}

	public void mostrarCor() {
		System.out.println("Ervilha Vermelha");
	}
}