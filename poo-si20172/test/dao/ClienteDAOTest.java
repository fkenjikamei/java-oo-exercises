package dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import junit.framework.TestCase;
import vo.ClienteVO;

public class ClienteDAOTest extends TestCase {
	ClienteVO clienteVO;
	Connection conexao;

	@Override
	protected void setUp() throws Exception {
		this.clienteVO = new ClienteVO();
		clienteVO.setNome("ifal");
		clienteVO.setCpf("123456");
		clienteVO.setEmail("teste@teste.com");
		
		ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
		this.conexao = conexaoMySQL.getConexao();
		this.conexao.setAutoCommit(false);
	}

	@Override
	protected void tearDown() throws Exception {
		this.conexao.close();
	}

	@Test
	public void testDeveriaCadastrarCliente() throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO(conexao);
		clienteDAO.cadastrar(clienteVO);
	}

	void inserirCliente(Connection conexao) throws Exception {
		Statement stmt = conexao.createStatement();
		stmt.executeUpdate("INSERT INTO Cliente(nome, cpf, email) VALUES('" + this.clienteVO.getNome() + "','"
				+ this.clienteVO.getCpf() + "','" + this.clienteVO.getEmail() + "')");
	}

	@Test
	public void testDeveriaAlterarNomeClienteQuandoClienteJaCadastrado() throws Exception {
		this.inserirCliente(this.conexao);

		String cpf = "123456";
		String novoEmail = "novo@novo.com";

		ClienteDAO clienteDAO = new ClienteDAO(this.conexao);
		clienteDAO.alterarNome(cpf, novoEmail);
	}

	@Test
	public void testDeveriaConsultarPorNomeDoClienteQuandoClienteJaCadastrado() throws Exception {
		Statement stmt = this.conexao.createStatement();

		try {
			this.inserirCliente(this.conexao);
		} catch (SQLException e) {
			fail("Falha ao inserir Cliente no teste");
		}

		// ONDE REALMENTE QUERO TESTAR
		ClienteDAO clienteDAO = new ClienteDAO(this.conexao);
		ResultSet rs2 = clienteDAO.consultarClientePorNome(this.clienteVO.getNome());

		while (rs2.next()) {
			assertEquals(clienteVO.getNome(), rs2.getString("nome"));
		}
	}

	@Test
	public void testDeveriaExcluirClientePorNome() throws Exception {
		this.inserirCliente(this.conexao);

		try {
			ClienteDAO clienteDAO = new ClienteDAO(this.conexao);
			clienteDAO.excluirPorNome(clienteVO.getNome());

			Statement stmt = this.conexao.createStatement();
			String sql = "SELECT * FROM Cliente WHERE nome ='" + clienteVO.getNome() + "'";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				assertNull(rs.getString("nome"));
			}
		} catch (SQLException e) {
			fail("Erro para Excluir cliente: " + e.getMessage());
		}
	}
	
	@Test
	public void testCadastrarUtilizandoPreparedStatement() throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO(conexao);
		clienteDAO.cadastrarComPreparedStatement(clienteVO);
		
		Statement stmt = this.conexao.createStatement();
		String sql = "SELECT * FROM Cliente WHERE nome ='" + clienteVO.getNome() + "'";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			assertEquals(clienteVO.getNome(), rs.getString("nome"));
		}
	}
}