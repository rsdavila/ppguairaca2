package br.com.guairaca.comportamental.Observer;

public class ObserverTest {

	public static void main(String[] args) {
		Numero num = new Numero();
		new HexObserver(num);
		new OctalObserver(num);
		num.setValor(15);
		num.setValor(30);
		num.setValor(12);

	}

}
