package abstractFactory.forno.palermo;

import abstractFactory.forno.Pasta;

public class PastaPalermitana extends Pasta{

	@Override
	public void aggiungiCondimento() {
		System.out.println("pasta palermitana aggiunta");		
	}

}
