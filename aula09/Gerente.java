class Gerente extends Funcionario {
	private int codDepartamentoGerencia;

	public void setCodDepartamentoGerencia(int cod) {
		this.codDepartamentoGerencia = cod;
	}

	public int getCodDepartamentoGerencia() {
		return this.codDepartamentoGerencia;
	}

	//Sobrescrita
	public void calcularSalario(int qtdHorasTrabalhadas) {
		this.salario = qtdHorasTrabalhadas*100;
	}
}