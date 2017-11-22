package poo20172si;

import static org.junit.Assert.*;

import org.junit.Test;

import bo.BoateBO;
import junit.framework.TestCase;

public class BoateBOTest extends TestCase {
	private BoateBO boate;
	
	/***
	 * 1- Só pode entrar na boate maior de idade (>=18)
	 * 2- Não pode entrar menor de idade
	 * 3- Não deve permitir entrar acima de 70 anos
	 */
	
	@Override
	protected void setUp() throws Exception {
		BoateDAOMock boateDAOMock = new BoateDAOMock();
		this.boate = new BoateBO(boateDAOMock);
	}
	
	public void testDevePermitirEntrarNaBoateMaiorDeIdade() throws Exception {
		assertTrue(boate.validarIdade(18));
		assertFalse(boate.validarIdade(82));
	}
	
	public void testNaoDevePermitirEntrarMenorDeIdade() throws Exception {
		assertFalse(boate.validarIdade(17));
		assertFalse(boate.validarIdade(12));
	}
	
	public void testNaoDevePermitirEntrarAcima70Anos() throws Exception {
		assertFalse(boate.validarIdade(71));
		assertFalse(boate.validarIdade(75));
	}
	
	public void testDeveriaValidarDigito() throws Exception {
		assertFalse(boate.validarDigito(0));
	}
	
	@Test
	public void testDeveriaEfetuarCompraIngresso() throws Exception {
		try {
			boate.validarCompra("12345678911", "nome");
		} catch(Exception e) {
			fail("Erro ao comprar");
		}
	}
}
