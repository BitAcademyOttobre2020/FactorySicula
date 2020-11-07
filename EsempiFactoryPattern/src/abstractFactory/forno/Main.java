package abstractFactory.forno;

public class Main {
	public static void main(String[] args) {
		AbstractTavolaCaldaFactory factory = AbstractTavolaCaldaFactory.chooseFactory();
		Arancino a = factory.cuociArancino();
		Pizza pi = factory.cuociPizza();
		Pasta pa = factory.cuociPasta();
		System.out.println(a.getClass().getName());
		System.out.println(pi.getClass().getName());
		System.out.println(pa.getClass().getName());
		
	}
}
