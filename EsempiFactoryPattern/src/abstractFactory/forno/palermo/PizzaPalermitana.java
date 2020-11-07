package abstractFactory.forno.palermo;

import abstractFactory.forno.Pizza;

public class PizzaPalermitana extends Pizza{

	@Override
	public void impasta() {
		System.out.println("pizza palermitana impastata");
	}

}
