package br.com.guairaca.estrutural.Flyweight;

public class ErvilhaAmarela extends ErvilhaCombinada {
	public ErvilhaAmarela(Ervilha ervilhaPai) {
		super(ervilhaPai);
	}

	public ErvilhaAmarela() {
		super(null);
	}

	public void combinar() {
		super.combinar();
		mostrarCor();
	}

	private void mostrarCor() {
		System.out.print("Ervilha Amarela");
	}
}