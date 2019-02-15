package br.com.guairaca.comportamental.Visitor;

public class ShowVisitor implements ParteVisitor {
	public void visit(CPU cpu) {
		System.out.println("Computador...");
	}

	public void visit(Periferico periferico) {
		System.out.println("Periferico " + periferico);
	}
}