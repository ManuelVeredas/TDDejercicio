package prFactorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void factorialEntrada0Salida1() {
		assertEquals(new Integer(1),
				     new Integer(Factorial.calcular(0)));
	}
	
}
