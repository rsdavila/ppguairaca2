package br.com.guairaca.comportamental.Command;

public class TVAbxVolCommand implements Command {
	private TV tv;

	public TVAbxVolCommand(TV tv) {
		this.tv = tv;
	}

	public void executar() {
		tv.abaixarVolume();
	}
}