package factoryMethod.forno.palermo;

import factoryMethod.forno.Arancino;
import factoryMethod.forno.TavolaCalda;

public class TavolaCaldaPalermo extends TavolaCalda{

	@Override
	public Arancino cuoci() {
		Arancino a = new ArancinoPalermitano(0, 0);
		a.aggiungiSaporiLocali();
		return a;
	}
	
}
