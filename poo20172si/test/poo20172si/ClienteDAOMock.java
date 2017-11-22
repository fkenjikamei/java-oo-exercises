package poo20172si;

import java.util.ArrayList;

import dao.IClienteDAO;
import vo.ClienteVO;

public class ClienteDAOMock implements IClienteDAO {
	private ArrayList<ClienteVO> clientes = new ArrayList<ClienteVO>();
	

	@Override
	public void cadastrar(ClienteVO cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente cadastrado Mock");
	}

}
