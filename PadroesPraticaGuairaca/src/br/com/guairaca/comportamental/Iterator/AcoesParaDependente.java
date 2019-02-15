package br.com.guairaca.comportamental.Iterator;

public class AcoesParaDependente {
	private Dependente[] lstDependente;

	public void adicionar(Dependente dependente) {
		byte pos = 0;
		if (lstDependente == null) {
			lstDependente = new Dependente[1];
		} else {
			IteratorImpl<Dependente> backup = new IteratorImpl<Dependente>(lstDependente);
			lstDependente = new Dependente[lstDependente.length + 1];
			for (backup.first(); !backup.isDone(); backup.next())
				lstDependente[backup.getIndex()] = backup.currentItem();
			pos = (byte) backup.getLength();
		}
		lstDependente[pos] = dependente;
	}

	public void remover(byte posicao) {
		if (lstDependente.length == 1)
			lstDependente = null;
		else {
			IteratorImpl<Dependente> backup = new IteratorImpl<Dependente>(lstDependente);
			lstDependente = new Dependente[lstDependente.length - 1];
			byte j = 0;
			for (backup.first(); !backup.isDone(); backup.next())
				if (backup.getIndex() != posicao)
					lstDependente[j++] = backup.currentItem();
		}
	}

	public void listar() {
		if (lstDependente != null) {
			System.out.println("Dependentes de Funcionário:");
			IteratorImpl<Dependente> backup = new IteratorImpl<Dependente>(lstDependente);
			for (backup.first(); !backup.isDone(); backup.next())
				System.out.println("- " + backup.currentItem());
		}
	}
}
