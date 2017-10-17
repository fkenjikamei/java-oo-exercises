public class Funcionario {
	private String nome;
	private int cpf;
	protected double salario;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void calcularSalario(int qtdHorasTrabalhadas) {
		this.salario = qtdHorasTrabalhadas*40;
	}

	public double getSalario() {
		return this.salario;
	}
}