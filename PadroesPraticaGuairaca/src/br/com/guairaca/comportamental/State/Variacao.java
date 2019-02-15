package br.com.guairaca.comportamental.State;

public class Variacao {
	private State atual;

	public Variacao() {
		atual = new AcaoEmBaixa();
	}

	public boolean isTroca(float valor) {
		if (atual.isValor(valor)) {
			return true;
		}
		State novo = trocarAtual(valor);
		if (novo.getNivel() == atual.getNivel() + 1 || novo.getNivel() == atual.getNivel() - 1) {
			atual = novo;
			return true;
		}
		return false;
	}

	private State trocarAtual(float valor) {
		if (new AcaoEmAlta().isValor(valor))
			return new AcaoEmAlta();
		else if (new AcaoEmBaixa().isValor(valor))
			return new AcaoEmBaixa();
		else
			return new AcaoEmMedia();
	}
}
