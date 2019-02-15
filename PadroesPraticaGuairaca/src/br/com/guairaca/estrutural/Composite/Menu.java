package br.com.guairaca.estrutural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponente {
	private List<MenuComponente> componentes;

	public Menu(String descricao) {
		super(descricao, null);
		componentes = new ArrayList<MenuComponente>();
	}

	public void add(MenuComponente componente) {
		componentes.add(componente);
	}

	public void print() {
		System.out.println(">> " + super.toString());
		for (MenuComponente c : componentes) {
			c.print();
		}
	}
}