package br.com.guairaca.estrutural.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		SerSupremo ser = new Intermediario();
		System.out.println(ser.responder("Dragon Ball ou Naruto, qual é melhor ?"));

	}

}
