package view;

import java.util.Scanner;

import bo.BoateBO;
import dao.BoateDAO;

public class BoateView {
	BoateBO boateBO;
	Scanner entrada = new Scanner(System.in);
	
	public BoateView() {
		BoateDAO boateDAO = new BoateDAO();
		this.boateBO = new BoateBO(boateDAO);
	}
	
	public void comprarIngresso() {
		System.out.println("Comprando o igresso..");
		System.out.println("Digite o CPF:");
		String cpf = entrada.next();
		
		System.out.println("Digite o nome:");
		String nome = entrada.next();
		try {
			this.boateBO.validarCompra(cpf, nome);
		} catch(Exception e) {
			System.out.println("CPF invalido!");
		}
	}

	public void menu() {
		System.out.println("Digite a idade até 70:");
		Scanner entrada = new Scanner(System.in);
		
		try {
			int idade = entrada.nextInt();
			
			if(this.boateBO.validarDigito(idade)) {
				System.out.println("Idade valida");
				if(this.boateBO.validarIdade(idade)) {
					System.out.println("Pode comprar");
					this.comprarIngresso();
				}
				else {
					System.out.println("Não pode comprar");
				}
			} else {
				System.out.println("Idade inválida");
			}
		} catch(Exception e) {
			System.out.println("Digite um número");
			this.menu();
		}
	}
	
	public static void main(String[] args) {
		BoateView b = new BoateView();
		System.out.println("Bem vindo a Boate");
		b.menu();
	}
}
