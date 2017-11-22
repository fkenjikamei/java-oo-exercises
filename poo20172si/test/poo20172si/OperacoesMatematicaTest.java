package poo20172si;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class OperacoesMatematicaTest extends TestCase {
	
	@Test
	public void testDeveriaSomarDoisNumerosInteiros() throws Exception {
		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		assertEquals(20, operacoes.somar(19, 1));
		assertEquals(99, operacoes.somar(20, 79));
		assertEquals(-2, operacoes.somar(-1, -1));
	}
	
	public void testDeveriaSubtrairDoisNumerosInteiros() throws Exception {
		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		assertEquals(10, operacoes.subtrair(20, 10));
		assertEquals(100, operacoes.subtrair(110, 10));
	}
	
	public void testDeveriaDividirDoisNumerosInteiros() throws Exception {
		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		assertEquals(100.0, operacoes.dividir(200,2));
	}
	
	public void testNaoDeveriaDividirPorZero() throws Exception {
		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		try {
			assertEquals(100.0, operacoes.dividir(200,0));
			fail("Não deveria ter passado, pois era para dar erro na divisão por ZERO.");
		} catch(Exception e) {
			assertTrue(true);
			System.out.println(e.getMessage());
		}
	}
}
