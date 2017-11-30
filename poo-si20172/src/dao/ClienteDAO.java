package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vo.ClienteVO;

public class ClienteDAO implements IClienteDAO {
	private ArrayList<ClienteVO> clientes;
	private Connection conexao;

	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(ClienteVO cliente) throws SQLException {
		Statement stmt = this.conexao.createStatement();
		stmt.executeUpdate("INSERT INTO Cliente(nome, cpf, email) VALUES('"+cliente.getNome()+"','"+cliente.getCpf()+"','"+cliente.getEmail()+"')");
	}
	

	public void alterarNome(String cpf, String novoEmail) throws SQLException {
		Statement stmt = this.conexao.createStatement();
		String sql = "UPDATE Cliente SET email='"+novoEmail+"' WHERE cpf='"+cpf+"'";
		stmt.executeUpdate(sql);
	}

	public ResultSet consultarClientePorNome(String nome) throws SQLException {
		Statement stmt = this.conexao.createStatement();
		String sql = "SELECT * FROM Cliente WHERE nome ='"+nome+"'";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		return rs;
	}

	public void excluirPorNome(String nome) throws SQLException {
		Statement stmt = this.conexao.createStatement();
		String sql = "DELETE FROM Cliente WHERE nome='"+nome+"'";
		stmt.executeUpdate(sql);
	}

	public void cadastrarComPreparedStatement(ClienteVO clienteVO) throws SQLException {
		String sql = "INSERT INTO Cliente(nome, cpf, email) VALUES(?,?,?)";
		PreparedStatement pstmt = this.conexao.prepareStatement(sql);
		pstmt.setString(1, clienteVO.getNome());
		pstmt.setString(2, clienteVO.getCpf());
		pstmt.setString(3, clienteVO.getEmail());
		pstmt.executeUpdate();
	}
}