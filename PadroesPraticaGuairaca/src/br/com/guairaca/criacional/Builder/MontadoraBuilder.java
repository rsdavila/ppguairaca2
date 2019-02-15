package br.com.guairaca.criacional.Builder;

public interface MontadoraBuilder {

	void montar(char tipo, String modelo);

	Veiculo getVeiculo();

}
