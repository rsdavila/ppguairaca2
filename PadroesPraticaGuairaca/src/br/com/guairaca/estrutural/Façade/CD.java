package br.com.guairaca.estrutural.Façade;

public class CD {
	private float preco;

	public CD(Categoria categoria) {
		switch (categoria) {
		case PROMOCIONAL:
			preco = 9.99f;
		case LANCAMENTO:
			preco = 29.99f;
		case NORMAL:
			preco = 19.99f;
		}
	}

	public float getPreco() {
		return preco;
	}
}