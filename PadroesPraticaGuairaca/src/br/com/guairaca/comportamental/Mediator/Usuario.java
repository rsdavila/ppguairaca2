package br.com.guairaca.comportamental.Mediator;

public class Usuario {
	private String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return nome;
	}

	public void enviarMens(String mens) {
		SalaChat.show(this, mens);
	}
}
