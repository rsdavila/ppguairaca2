package br.com.guairaca.criacional.Builder;

public class MontadoraVeiculoBuilder implements MontadoraBuilder {
	private Veiculo veiculo;

	public void montar(char tipo, String modelo) {
		switch (tipo) {
		case 'F':
			veiculo = new Ferrari(modelo);
			break;
		case 'J':
			veiculo = new Jeep(modelo);
			break;
		}
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
}
