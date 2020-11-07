package factoryMethod.forno.catania;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factoryMethod.forno.Arancino;
import factoryMethod.forno.TavolaCalda;

class TavolaCaldaCataniaTest {

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
		TavolaCalda x = new TavolaCaldaCatania();
		Arancino a = x.cuoci();
		assertSame(ArancinoCatanese.class, a.getClass());
	}

}
