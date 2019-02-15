package br.com.guairaca.comportamental.State;

public class StateTest {

	public static void main(String[] args) {
		Acao padrao = new Acao("Patterns Inc.");
		padrao.setValor(1.0f);
		System.out.println(padrao);
		padrao.setValor(8.0f);
		System.out.println(padrao);
		padrao.setValor(25.0f);
		System.out.println(padrao);
		padrao.setValor(1.0f);
		System.out.println(padrao);
	}

}
