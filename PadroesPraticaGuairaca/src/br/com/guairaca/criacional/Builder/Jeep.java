package br.com.guairaca.criacional.Builder;

public class Jeep extends Veiculo {
	private String nome;

	public Jeep(String modelo) {
		super(modelo, "Utilitario");
		this.nome = "Jeep";
	}

	public String toString() {
		return "Carro: " + nome + " " + getModelo() + " " + getTipo();
	}
}