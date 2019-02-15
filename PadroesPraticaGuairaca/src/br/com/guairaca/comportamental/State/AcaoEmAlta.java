package br.com.guairaca.comportamental.State;

public class AcaoEmAlta implements State {
	public byte getNivel() {
		return (byte) 3;
	}

	public boolean isValor(float valor) {
		return valor > 20;
	}
}