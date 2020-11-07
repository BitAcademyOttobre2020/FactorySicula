package factoryMethod.forno.catania;

import factoryMethod.forno.Arancino;

public class ArancinoCatanese extends Arancino{

	public ArancinoCatanese(double peso, double costo) {
		super(peso, costo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aggiungiSaporiLocali() {
		System.out.println("pesce spada");
	}
	
}
