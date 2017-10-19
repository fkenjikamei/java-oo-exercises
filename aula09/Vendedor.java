class Vendedor extends Gerente {
	private double comissao = 1.2;

	@Override
	public void calcularSalario(int qtdHorasTrabalhadas) {
		this.salario = (qtdHorasTrabalhadas*40)*this.comissao;
	}
}