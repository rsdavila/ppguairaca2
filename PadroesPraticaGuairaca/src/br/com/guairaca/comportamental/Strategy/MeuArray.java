package br.com.guairaca.comportamental.Strategy;

public class MeuArray {
	private int[] array;
	private int tam;
	ArrayFormata formata;

	public MeuArray(int tam) {
		array = new int[tam];
	}

	public void addValorEmPos(int valor, int pos) {
		array[pos] = valor;
	}

	public void setEstrategia(ArrayFormata st) {
		formata = st;
		formata.mostrar(array);
	}
}
