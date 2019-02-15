package br.com.guairaca.criacional.Builder;

public class BuilderTest {

	public static void main(String[] args) {
		Montadora montadora = new Montadora();
		Veiculo carro1 = montadora.montar('F', "Testerossa");
		Veiculo carro2 = montadora.montar('J', "Renegade");
		System.out.println(carro1);
		System.out.println(carro2);
	}
}
