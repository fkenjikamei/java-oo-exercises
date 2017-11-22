package view;

import java.util.Scanner;

import bo.ClienteBO;
import dao.ClienteDAO;
import dao.IClienteDAO;
import vo.ClienteVO;

public class ClienteView {
	Scanner entrada;

	ClienteView() {
		this.entrada = new Scanner(System.in);
	}

	void cadastrar() {
		System.out.println("*** CADASTRAR CLIENTE ***");
		System.out.println("\nDigite o nome do cliente: ");
		String nome = entrada.next();
		
		System.out.println("Digite o email: ");
		String email = entrada.next();
		
		System.out.println("Digite o CPF: ");
		String cpf = entrada.next();
		
		ClienteVO clienteVO = new ClienteVO();
		clienteVO.setNome(nome);
		clienteVO.setCpf(cpf);
		clienteVO.setEmail(email);
		
		IClienteDAO clienteDAO = new ClienteDAO();
		ClienteBO clienteBO = new ClienteBO(clienteDAO);
		
		try {
			clienteBO.validarCadastro(clienteVO);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void consultar() {

	}

	void excluir() {

	}

	void menu() {
		System.out.println("*** MANTER CLIENTE ***");
		System.out.println("1- Cadastrar");
		System.out.println("2- Consultar");
		System.out.println("3- Excluir");

		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			cadastrar();
			break;
		case 2:
			consultar();
			break;
		case 3:
			excluir();
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

	public static void main(String[] args) {
		ClienteView cliente = new ClienteView();
		cliente.menu();
	}

}