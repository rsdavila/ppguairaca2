package br.com.guairaca.estrutural.Decorator;

public class DecorateTest {
	public static void main(String[] args) {
		new ErvilhaVerde(new ErvilhaVermelha());
		new ErvilhaAmarela(new ErvilhaVerde());
		new ErvilhaAmarela();
	}
}