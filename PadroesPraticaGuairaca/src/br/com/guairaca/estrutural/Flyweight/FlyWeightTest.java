package br.com.guairaca.estrutural.Flyweight;

public class FlyWeightTest {

	public static void main(String[] args) {
		ErvilhaFlyWeight fly = new ErvilhaFlyWeight();
		fly.mostrar(new ErvilhaVerde());
		fly.mostrar(new ErvilhaVermelha());
		fly.mostrar(new ErvilhaAmarela());
	}

}
