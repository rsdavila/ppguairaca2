package br.com.guairaca.comportamental.Visitor;

public interface ParteVisitor {
	public void visit(CPU cpu);

	public void visit(Periferico perifefico);
}
