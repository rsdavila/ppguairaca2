package br.com.guairaca.comportamental.Strategy;

public class StrategyTest {

	public static void main(String[] args) {
		MeuArray m = new MeuArray(10);
		m.addValorEmPos(6, 1);
		m.addValorEmPos(8, 0);
		m.addValorEmPos(1, 4);
		m.addValorEmPos(7, 9);
		System.out.println("Formato Corrente:");
		m.setEstrategia(new FormatoPadrao());
		System.out.println("Formato Posicional:");
		m.setEstrategia(new FormatoPosicional());

	}

}
