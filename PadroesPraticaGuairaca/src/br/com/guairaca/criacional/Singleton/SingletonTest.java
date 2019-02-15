package br.com.guairaca.criacional.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		new SingletonTest().criarContas();
	}

	public void criarContas() {
		ContaCorrente ct1 = ContaCorrente.newInstance();
		ct1.setNumeroConta("123-45");
		System.out.println(ct1 + " - " + ct1.hashCode());
		ContaCorrente ct2 = ContaCorrente.newInstance();
		ct2.setNumeroConta("323-35");
		System.out.println(ct2 + " - " + ct2.hashCode());
	}

}
