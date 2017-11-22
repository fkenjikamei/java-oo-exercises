package bo;

import dao.BoateDAO;
import dao.IBoateDAO;

public class BoateBO {
	private IBoateDAO boateDAO;
	
	public BoateBO(IBoateDAO boateDAO) {
		this.boateDAO = boateDAO;
	}
	
	public boolean validarIdade(int idade) {
		if (idade >= 18 && idade <= 70)
			return true;

		return false;
	}

	public boolean validarDigito(int digito) {
		if (digito <= 0)
			return false;
		return true;
	}
	
	public boolean validarCPF(String cpf) {
		if(cpf.length() < 11)
			return false;
		else
			return true;
	}
	
	public boolean validarNome(String nome) {
		if(nome.length() < 1 || nome.equals(null))
			return false;
		else
			return true;
	}

	public void validarCompra(String cpf, String nome) throws Exception {
		BoateDAO boateDAO = new BoateDAO();
		
		if(!this.validarCPF(cpf) || !this.validarNome(nome)) {
			throw new Exception("CPF ou NOME inválido(s)");
		}
		else {
			boateDAO.comprar(cpf, nome);
		}	
	}
}
