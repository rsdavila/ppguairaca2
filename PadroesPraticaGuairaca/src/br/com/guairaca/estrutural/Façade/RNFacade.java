package br.com.guairaca.estrutural.Façade;

public class RNFacade {
	private Cliente cliente;
	private Gravadora gravadora;

	public RNFacade() {
		cliente = new Cliente();
		gravadora = new Gravadora();
	}

	public void comprar(Categoria c) {
		CD cd = new CD(c);
		cliente.addComprar();
		gravadora.setRepasse(cd.getPreco() * 0.5f);
	}

	public void alugar(Categoria c) {
		CD cd = new CD(c);
		cliente.addComprar();
		gravadora.setRepasse(cd.getPreco() * 0.05f);
	}
}
