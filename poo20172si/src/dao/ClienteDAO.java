package dao;

import java.sql.Connection;
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
}







