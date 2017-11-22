package bo;

import dao.ClienteDAO;
import dao.IClienteDAO;
import vo.ClienteVO;

public class ClienteBO {
	private IClienteDAO clienteDAO;
	
	
	public ClienteBO(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	

	public void validarCadastro(ClienteVO clienteVO) throws Exception {
		if(clienteVO.getNome().isEmpty() || clienteVO.getNome() == null || clienteVO.getNome().length() <= 1)
			throw new Exception("Nome do cliente inválido");
		else {
			this.clienteDAO.cadastrar(clienteVO);
		}
	}
}
