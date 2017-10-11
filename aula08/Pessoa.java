class Pessoa {
	String nome;
	int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return "Nome: "+this.nome;
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
	}
}