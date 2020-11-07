package abstractFactory.forno.palermo;

import abstractFactory.forno.AbstractTavolaCaldaFactory;
import abstractFactory.forno.Arancino;
import abstractFactory.forno.Pasta;
import abstractFactory.forno.Pizza;

public class TavolaCaldaFactoryPalermo implements AbstractTavolaCaldaFactory{

	@Override
	public Arancino cuociArancino() {
		Arancino a = new ArancinoPalermitano();
		return a;
	}

	@Override
	public Pasta cuociPasta() {
		Pasta p = new PastaPalermitana();
		return p;
	}

	@Override
	public Pizza cuociPizza() {
		Pizza p = new PizzaPalermitana();
		return p;
	}

}
