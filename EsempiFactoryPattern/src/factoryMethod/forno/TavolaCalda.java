package factoryMethod.forno;

import java.util.List;

public abstract class TavolaCalda {
	
	public abstract Arancino cuoci();
	public double calcolaCostoOrdine(List<Arancino> lista) {
		return 0;
	}
}
