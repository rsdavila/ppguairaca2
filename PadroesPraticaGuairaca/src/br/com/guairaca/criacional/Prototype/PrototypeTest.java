package br.com.guairaca.criacional.Prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		Ovelha original = new Ovelha("Dolly");
		Ovelha clone = new PrototypeImpl().duplicar(original);
	}

}
