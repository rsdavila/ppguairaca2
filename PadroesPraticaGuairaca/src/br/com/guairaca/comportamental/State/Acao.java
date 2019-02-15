package br.com.guairaca.comportamental.State;

public class Acao {
	private String empresa;
	private float valor;
	private Variacao variacao = new Variacao();

	public Acao(String empresa) {
		this.empresa = empresa;
	}

	public String toString() {
		return empresa + " - " + valor;
	}

	public void setValor(float valor) {
		if (variacao.isTroca(valor)) {
			this.valor = valor;
		} else {
			System.out.println("Troca de Valor Indevida");
		}
	}
}
