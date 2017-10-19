public abstract class Funcionario {
	private String nome;
	private int cpf;
	protected double salario;

	Funcionario(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public abstract void calcularSalario(int qtdHorasTrabalhadas);

	public double getSalario() {
		return this.salario;
	}

}