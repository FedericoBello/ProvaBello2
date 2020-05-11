import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class QuadratoTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Quadrato a=new Quadrato(4);
		float risAtteso=16;
		float risOttenuto= a.Area();
		assertEquals(risAtteso,risOttenuto);
	}

}
