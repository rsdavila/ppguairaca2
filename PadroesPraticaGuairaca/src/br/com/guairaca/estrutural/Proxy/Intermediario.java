package br.com.guairaca.estrutural.Proxy;

public class Intermediario implements SerSupremo {

	private SerSupremo real;

	public Intermediario() {
		real = new SerSupremoReal();
	}

	public String responder(String pergunta) {
		return real.responder(pergunta);
	}
}
