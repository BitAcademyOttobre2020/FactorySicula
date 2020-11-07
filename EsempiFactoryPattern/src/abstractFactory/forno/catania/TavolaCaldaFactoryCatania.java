package abstractFactory.forno.catania;

import abstractFactory.forno.AbstractTavolaCaldaFactory;
import abstractFactory.forno.Arancino;
import abstractFactory.forno.Pasta;
import abstractFactory.forno.Pizza;

public class TavolaCaldaFactoryCatania implements AbstractTavolaCaldaFactory {

	@Override
	public Arancino cuociArancino() {
		Arancino a = new ArancinoCatanese();
		return a;
	}

	@Override
	public Pasta cuociPasta() {
		Pasta p = new PastaCatanese();
		return p;
	}

	@Override
	public Pizza cuociPizza() {
		Pizza p = new PizzaCatanese();
		return p;
	}

}
