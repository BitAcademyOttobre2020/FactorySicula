package abstractFactory.forno.catania;

import abstractFactory.forno.Pizza;

public class PizzaCatanese extends Pizza{

	@Override
	public void impasta() {
		System.out.println("impasto alla catanese");
	}
}
