package abstractFactory.forno.catania;

import abstractFactory.forno.Pasta;

public class PastaCatanese extends Pasta{

	@Override
	public void aggiungiCondimento() {
		System.out.println("pasta condita alla catanese");
		
	}

}
