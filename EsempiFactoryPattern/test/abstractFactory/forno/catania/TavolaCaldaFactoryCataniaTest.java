package abstractFactory.forno.catania;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import abstractFactory.forno.AbstractTavolaCaldaFactory;
import abstractFactory.forno.Arancino;
import abstractFactory.forno.Pasta;
import abstractFactory.forno.Pizza;


class TavolaCaldaFactoryCataniaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCuoci() {
		AbstractTavolaCaldaFactory factory = new TavolaCaldaFactoryCatania();
		Arancino a = factory.cuociArancino();
		Pizza p = factory.cuociPizza();
		Pasta pasta = factory.cuociPasta();
		assertSame(ArancinoCatanese.class, a.getClass());
		assertSame(PizzaCatanese.class, p.getClass());
		assertSame(PastaCatanese.class, pasta.getClass());
	}

}
