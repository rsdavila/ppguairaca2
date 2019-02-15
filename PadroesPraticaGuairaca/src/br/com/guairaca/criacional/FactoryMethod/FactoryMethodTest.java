package br.com.guairaca.criacional.FactoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		GMCriador gm = new GMCriadorConcreto();
		Veiculo vectra = gm.factoryVectra();
		Veiculo opala = gm.factoryOpala();

	}

}
