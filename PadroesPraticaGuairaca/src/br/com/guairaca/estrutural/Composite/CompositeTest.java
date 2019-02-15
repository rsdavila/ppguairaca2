package br.com.guairaca.estrutural.Composite;

public class CompositeTest {

	public static void main(String[] args) {
		Menu parte = new Menu("Parte 1");
		parte.add(new MenuItem("Item 1", "Evento 1"));
		parte.add(new MenuItem("Item 2", "Evento 2"));
		Menu parte2 = new Menu("Parte 2");
		parte2.add(new MenuItem("Item 1", "Evento 3"));
		parte2.add(new MenuItem("Item 2", "Evento 4"));
		parte2.add(new MenuItem("Item 3", "Evento 5"));
		Menu principal = new Menu("Principal");
		principal.add(parte);
		principal.add(parte2);
		principal.print();
	}

}
