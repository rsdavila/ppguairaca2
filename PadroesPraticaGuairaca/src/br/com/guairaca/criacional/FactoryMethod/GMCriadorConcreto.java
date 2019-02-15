package br.com.guairaca.criacional.FactoryMethod;

public class GMCriadorConcreto extends GMCriador {
	public Opala factoryOpala() {
		return new Opala();
	}

	public Vectra factoryVectra() {
		return new Vectra();
	}
}