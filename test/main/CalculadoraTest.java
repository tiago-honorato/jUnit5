package main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumTwoNumbers() {
		
		Calculadora calc = new Calculadora();
		
		double result = calc.somar(5, 5);
		
		assertEquals(10, result);
	}
	
	@Test
	void subTwoNumbers() {
		 
		Calculadora calc = new Calculadora();
		
		double result = calc.subtrair(10, 5);
		
		assertEquals(5, result);
		
	}
	
	@Test
	void verifyMultTwoNumbers() {
		
		Calculadora calc = new Calculadora();
		
		double result = calc.multiplicar(2, 10);
		
		assertEquals(20, result);
		
	}
	
	@Test
	void verifyDivTwoNumbers() {
		
		Calculadora calc = new Calculadora();
		
		double result = calc.dividir(50, 2);
		
		assertEquals(25, result);
		
	}
	
	@Test
	void verifyEven() {
		
		Calculadora calc = new Calculadora();
		
		boolean even = calc.verificaPar(10);
		
		assertTrue(even);
		
	}

}



