package abstractFactory.forno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import abstractFactory.forno.catania.TavolaCaldaFactoryCatania;
import abstractFactory.forno.palermo.TavolaCaldaFactoryPalermo;

public interface AbstractTavolaCaldaFactory {
	Arancino cuociArancino();
	Pasta cuociPasta();
	Pizza cuociPizza();
	static AbstractTavolaCaldaFactory chooseFactory() {
		try(FileInputStream file = new FileInputStream("configuration.properties")){
			Properties prop = new Properties();
			prop.load(file);
			String s = prop.getProperty("tipo");
			switch(s) {
			case "catania": return new TavolaCaldaFactoryCatania();
			case "palermo": return new TavolaCaldaFactoryPalermo();
			default: return new TavolaCaldaFactoryPalermo();
			}
		} catch (IOException e) {
			throw new RuntimeException("File inesistente o corrotto");
		}
		
	}
}
