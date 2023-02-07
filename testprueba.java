import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class testprueba {
	@Test
	void TPostfixCalculator() {
		PostfixCalculator postfixcal = new miCalculadora;
		
		int result = miCalculadora.suma(3, 5);
		assertEquals(8, result);
	}
	
	@Test
	void TPostfixCalculator() {
		int result = miCalculadora.resta(3, 5);
		assertEquals(3, result);
	}
	
	@Test
	void TPostfixCalculator() {
	
		int result = miCalculadora.multiplicación(3, 5);
		assertEquals(15, result);
	}
	
	@Test
	void TPostfixCalculator() {
	
		int result = miCalculadora.division(20, 5);
		assertEquals(4, result);
	}
	
}
