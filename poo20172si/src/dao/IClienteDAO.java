package dao;

import java.sql.SQLException;

import vo.ClienteVO;

public interface IClienteDAO {

	public void cadastrar(ClienteVO clienteVO) throws SQLException;
}
