package br.com.guairaca.comportamental.Strategy;

public class FormatoPadrao implements ArrayFormata {
	public void mostrar(int[] arr) {
		System.out.print("{ ");
		for (int n = 0; n < arr.length - 1; n++)
			System.out.print(arr[n] + ", ");
		System.out.println(arr[arr.length - 1] + "}");
	}
}