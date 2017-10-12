class Pessoa {
	static int cod;
	protected String nome;
	int idade;

	public void setNome(String nome) {
		cod +=1;
		this.nome = cod+"-"+nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return "Nome: "+this.nome;
	}

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Teste");
	}
}