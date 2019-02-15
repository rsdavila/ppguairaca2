package br.com.guairaca.comportamental.Mediator;

public class MediatorTest {

	public static void main(String[] args) {
		Usuario rodrigo = new Usuario("Rodrigo");
		Usuario jose = new Usuario("José");
		rodrigo.enviarMens("Rodrigo em qual Pattern estamos?");
		jose.enviarMens("Acho que no Mediator.");
	}

}
