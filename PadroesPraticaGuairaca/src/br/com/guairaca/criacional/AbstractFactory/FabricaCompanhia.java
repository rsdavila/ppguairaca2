package br.com.guairaca.criacional.AbstractFactory;

public class FabricaCompanhia implements Modelo {

	public Gato getGato() {
		return new Persa();
	}

	public Cachorro getCachorro() {
		return new Shitzu();
	}
}