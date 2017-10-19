import java.util.Scanner;

class Gerente extends Funcionario {
	private int codDepartamentoGerencia;

	Gerente(String nome) {
		super(nome);
	}

	public void setCodDepartamentoGerencia(int cod) {
		this.codDepartamentoGerencia = cod;
	}

	public int getCodDepartamentoGerencia() {
		return this.codDepartamentoGerencia;
	}
}