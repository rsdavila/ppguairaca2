package br.com.guairaca.estrutural.Flyweight;

public class ErvilhaVermelha extends ErvilhaCombinada {
    public ErvilhaVermelha(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }
    public ErvilhaVermelha() {
        super(null);
    }
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    private void mostrarCor() {
        System.out.print("Ervilha Vermelha");
    }
}