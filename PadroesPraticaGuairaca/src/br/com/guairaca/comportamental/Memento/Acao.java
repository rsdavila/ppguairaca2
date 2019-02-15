package br.com.guairaca.comportamental.Memento;

import java.util.ArrayList;
import java.util.List;

public class Acao {
	private String empresa;
	private float valor;
	private List<AcaoMemento> memoria = new ArrayList<AcaoMemento>();

	public Acao(String empresa) {
		this.empresa = empresa;
	}

	public String toString() {
		return empresa + " - " + valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
		memoria.add(new AcaoMemento(valor));
	}

	public void undo() {
		if (memoria.size() > 1) {
			memoria.remove(memoria.size() - 1);
			this.valor = memoria.get(memoria.size() - 1).getState();
		}
	}
}
