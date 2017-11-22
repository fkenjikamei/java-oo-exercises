package poo20172si;

import static org.junit.Assert.*;

import org.junit.Test;

import bo.ClienteBO;
import dao.IClienteDAO;
import junit.framework.TestCase;
import vo.ClienteVO;

public class ClienteBOTest extends TestCase {

	@Test
	public void testDeveriaCadastrarClientePassandoNomeComMaisDe1Caractere() throws Exception {
		IClienteDAO clienteDAOMock = new ClienteDAOMock();
		ClienteBO clienteBO = new ClienteBO(clienteDAOMock);
		ClienteVO clienteVO1 = new ClienteVO();
		clienteVO1.setNome("11111");
		ClienteVO clienteVO2 = new ClienteVO();
		clienteVO2.setNome("22222");
		ClienteVO clienteVO3 = new ClienteVO();
		clienteVO3.setNome("33333");
		
		try {
			clienteBO.validarCadastro(clienteVO1);
			clienteBO.validarCadastro(clienteVO2);
			clienteBO.validarCadastro(clienteVO3);
		} catch(Exception e) {
			fail("Não deveria ter falhado");
		}
	}
	
	@Test
	public void testNaoDeveriaCadastrarClientePassadoNomeComMenosDe2Caracteres() throws Exception {
		IClienteDAO clienteDAOMock = new ClienteDAOMock();
		ClienteBO clienteBO = new ClienteBO(clienteDAOMock);
		ClienteVO clienteVO1 = new ClienteVO();
		clienteVO1.setNome("1");
		ClienteVO clienteVO2 = new ClienteVO();
		clienteVO2.setNome("2");
		ClienteVO clienteVO3 = new ClienteVO();
		clienteVO3.setNome("3");
		
		try {
			clienteBO.validarCadastro(clienteVO1);
			clienteBO.validarCadastro(clienteVO2);
			clienteBO.validarCadastro(clienteVO3);
			fail("Não deveria ter passado");
		} catch(Exception e) {
			assertTrue(true);
		}
	}
}
