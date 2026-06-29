package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calc;

	@BeforeEach
	void setUp()  {
		calc = new Calculator();
	}

	@Test
	void testAddIntInt() {
		//Calculator cal = new Calculator();
		assertEquals(10, calc.add(3, 7));
	}

	@Test
	void testAddStringString() {
		assertEquals("apple", calc.add("app", "le"));
	}

}
