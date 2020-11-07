package factoryMethod.forno.catania;

import factoryMethod.forno.Arancino;
import factoryMethod.forno.TavolaCalda;

public class TavolaCaldaCatania extends TavolaCalda {

	@Override
	public Arancino cuoci() {
		Arancino a = new ArancinoCatanese(0,0);
		a.aggiungiSaporiLocali();
		return a;
	}

}
