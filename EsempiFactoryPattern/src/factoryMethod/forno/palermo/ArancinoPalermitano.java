package factoryMethod.forno.palermo;

import factoryMethod.forno.Arancino;

public class ArancinoPalermitano extends Arancino {

	public ArancinoPalermitano(double peso, double costo) {
		super(peso, costo);
	}

	@Override
	public void aggiungiSaporiLocali() {
		System.out.println("aggiungi pistacchio");
	}
	
}
