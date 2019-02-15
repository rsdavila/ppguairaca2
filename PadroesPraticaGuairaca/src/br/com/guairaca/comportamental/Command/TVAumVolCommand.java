package br.com.guairaca.comportamental.Command;

public class TVAumVolCommand implements Command {
	private TV tv;

	public TVAumVolCommand(TV tv) {
		this.tv = tv;
	}

	public void executar() {
		tv.aumentarVolume();
	}
}