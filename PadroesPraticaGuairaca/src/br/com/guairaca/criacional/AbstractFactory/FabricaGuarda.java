package br.com.guairaca.criacional.AbstractFactory;

public class FabricaGuarda implements Modelo {
	
    public Cachorro getCachorro() {
        return new Pastor();
    }
    public Gato getGato() {
        return new RagDoll();
    }

}
