package br.com.guairaca.comportamental.Template;

public abstract class Item {
	public final boolean remover(int qtd) {
		if (!validarQtd(qtd)) {
			System.out.println("Impedir remover.");
			return false;
		}
		if (getEstoque() >= qtd) {
			decEstoque(qtd);
			System.out.println("Itens removidos.");
			return true;
		}
		System.out.println("Impedir remover.");
		return false;
	}

	protected abstract boolean validarQtd(int qtd);

	protected abstract int getEstoque();

	protected abstract void decEstoque(int qtd);
}
