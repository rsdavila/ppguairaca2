package br.com.guairaca.comportamental.Command;

import java.util.Scanner;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte opcao = 0;
		ControleRemoto remoto = new ControleRemoto(new TV());
		do {
			System.out.println("Selecione o comando (0 para sair)");
			System.out.println("1 - Ligar/Desligar");
			System.out.println("2 - Aumentar Volume");
			System.out.println("3 - Abaixar Volume");
			opcao = sc.nextByte();
			switch (opcao) {
			case 1:
				remoto.pressLigDes();
				break;
			case 2:
				remoto.pressAumVol();
				break;
			case 3:
				remoto.pressAbxVol();
				break;
			}
		} while (opcao != 0);
	}
}
