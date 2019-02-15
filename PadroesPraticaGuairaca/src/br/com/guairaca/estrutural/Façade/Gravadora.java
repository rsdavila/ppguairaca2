package br.com.guairaca.estrutural.Façade;

public class Gravadora {
	private float repasse;

	public void setRepasse(float repasse) {
		this.repasse = repasse;
	}

	public String toString() {
		return "[Gravadora] Repasse: " + this.repasse;
	}
}
