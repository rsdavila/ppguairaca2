package br.com.guairaca.estrutural.Fa�ade;

public class Fa�adaTest {

	public static void main(String[] args) {
		RNFacade rn = new RNFacade();
		rn.comprar(Categoria.NORMAL);
		rn.alugar(Categoria.NORMAL);
	}

}
