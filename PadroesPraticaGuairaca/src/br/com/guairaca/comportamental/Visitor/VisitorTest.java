package br.com.guairaca.comportamental.Visitor;

public class VisitorTest {

	public static void main(String[] args) {
		ParteComp computador = new CPU();
		computador.adicionar(new ShowVisitor());

	}

}
