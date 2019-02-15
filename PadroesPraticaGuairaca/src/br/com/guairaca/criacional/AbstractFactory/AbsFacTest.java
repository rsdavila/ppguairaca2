package br.com.guairaca.criacional.AbstractFactory;

import java.util.Scanner;

public class AbsFacTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 1-Companhia ou 2-Guarda");
		
		byte opc = sc.nextByte();
		Modelo modelo = null;
		
		switch (opc) {
		case 1:
			modelo = new FabricaCompanhia();
			break;
		case 2:
			modelo = new FabricaGuarda();
			break;
		}
		System.out.println("Cachorro: " + modelo.getCachorro());
		System.out.println("Gato: " + modelo.getGato());

	}

}
