package br.com.guairaca.comportamental.Interpreter;

public class InterpreterTest {

	public Expressao carregarAutores(String autor1, String autor2) {
		return new ExpressaoOu(new ExpressaoFinal(autor1), new ExpressaoFinal(autor2));
	}

	public Expressao carregarLinguagem(String pessoa) {
		return new ExpressaoE(new ExpressaoFinal(pessoa), new ExpressaoFinal("Java"));
	}

	public static void main(String[] args) {
		new InterpreterTest().verificar();
	}

	public void verificar() {
		Expressao autores = carregarAutores("Fernando", "Anselmo");
		Expressao conhecimento = carregarLinguagem("Fernando");

		System.out.println("Fernando foi o Autor deste curso?" + autores.entender("Fernando Autor"));

		System.out.println("Fernando sabe Java?" + conhecimento.entender("Fernando Java"));
	}
}