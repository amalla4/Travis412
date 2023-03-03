package travis_ci_tutorial_java;

//apmalla

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSubstract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(8, 5), 3);
	}

	@Test
	public void testMultiply(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(4,2), 8);
	}

	@Test
	public void testDivide(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4,2), 2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero(){
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(4,0);
	}
	
}
