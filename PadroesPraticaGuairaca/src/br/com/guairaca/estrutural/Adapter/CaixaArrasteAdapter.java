package br.com.guairaca.estrutural.Adapter;

public class CaixaArrasteAdapter implements Vetor {
	private CaixaArraste caixaArraste = new CaixaArraste();

	public int getPosX() {
		Coordenada c = caixaArraste.getTopoEsq();
		return c.getX();
	}

	public int getPosY() {
		Coordenada c = caixaArraste.getTopoEsq();
		return c.getY();
	}

	public int getLargura() {
		Coordenada c1 = caixaArraste.getTopoEsq();
		Coordenada c2 = caixaArraste.getRodapeDir();
		return c2.getX() - c1.getX();
	}

	public int getAltura() {
		Coordenada c1 = caixaArraste.getTopoEsq();
		Coordenada c2 = caixaArraste.getRodapeDir();
		return c2.getY() - c1.getY();
	}
}
