package dao;

import java.util.ArrayList;

import vo.ClienteVO;

public class ClienteDAO implements IClienteDAO {
	private ArrayList<ClienteVO> clientes;

	public void cadastrar(ClienteVO cliente) {
		System.out.println("Cliente cadastrado");
	}
}
