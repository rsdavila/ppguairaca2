package br.com.guairaca.estrutural.Façade;

public class FaçadaTest {

	public static void main(String[] args) {
		RNFacade rn = new RNFacade();
		rn.comprar(Categoria.NORMAL);
		rn.alugar(Categoria.NORMAL);
	}

}
