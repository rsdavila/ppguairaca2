package br.com.guairaca.comportamental.Visitor;

public class CPU implements ParteComp {
	private ParteComp[] partes;

	public CPU() {
		partes = new ParteComp[] { new Periferico("Mouse"), new Periferico("Teclado"), new Periferico("Monitor") };
	}

	public void adicionar(ParteVisitor parteVisitor) {
		parteVisitor.visit(this);
		for (int i = 0; i < partes.length; i++) {
			partes[i].adicionar(parteVisitor);
		}
	}
}