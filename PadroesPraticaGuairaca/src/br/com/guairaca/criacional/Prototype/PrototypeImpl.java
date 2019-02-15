package br.com.guairaca.criacional.Prototype;

public class PrototypeImpl implements Prototype {
	public Ovelha duplicar(Ovelha ovelha) {
		return (Ovelha) ovelha.clone();
	}
}