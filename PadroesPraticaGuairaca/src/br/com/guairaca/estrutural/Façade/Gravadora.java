package br.com.guairaca.estrutural.Fa�ade;

public class Gravadora {
	private float repasse;

	public void setRepasse(float repasse) {
		this.repasse = repasse;
	}

	public String toString() {
		return "[Gravadora] Repasse: " + this.repasse;
	}
}
