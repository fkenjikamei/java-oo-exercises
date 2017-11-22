package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ConexaoMySQLTest extends TestCase {
	
	@Test
	public void testDeveriaConectar() throws Exception {
		ConexaoMySQL conexao = new ConexaoMySQL();	
		assertNotNull(conexao.getConexao());
	}

}
