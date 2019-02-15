package br.com.guairaca.criacional.Builder;

public abstract class Veiculo {

	private String modelo;
	private String tipo;

	public Veiculo(String modelo, String tipo) {
		this.modelo = modelo;
		this.tipo = tipo;
	}

	protected String getModelo() {
		return modelo;
	}

	protected String getTipo() {
		return tipo;
	}
}
