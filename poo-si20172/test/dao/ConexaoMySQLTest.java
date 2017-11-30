package dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import junit.framework.TestCase;

public class ConexaoMySQLTest extends TestCase {
	
	@Test
	public void testDeveriaConectar() {
		ConexaoMySQL conexaoMySQL = new ConexaoMySQL();	
		
		try {
			Connection conexao = conexaoMySQL.getConexao();
			assertNotNull(conexao);
		} catch(Exception e) {
			fail("Falha na conexão: "+e.getMessage());
		}
	}
}
