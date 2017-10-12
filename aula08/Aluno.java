class Aluno {
	private String[] disciplinasCursadas;
	private int posicao = 0;

	public Aluno() {
		this.disciplinasCursadas = new String[10];
	}

	void addDisciplinaCursada(String nomeDisciplina) {
		try {
			validarDisciplina(nomeDisciplina);
			this.disciplinasCursadas[posicao] = nomeDisciplina;
			this.posicao += 1;
		} catch(Exception e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}

	private void validarDisciplina(String nomeDisciplina) throws Exception {
		if(nomeDisciplina == "" || nomeDisciplina == null || nomeDisciplina.length() > 20)
			throw new Exception("Nome inválido");
	}

	void listarDisciplinasCursadas() {
		System.out.println("Disciplinas cursadas: ");
		for(String nomeDisciplina: this.disciplinasCursadas) {
			if(nomeDisciplina != null)
				System.out.println(nomeDisciplina);
		}
	}

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome = "ie";
		System.out.println(aluno1.getNome());
		aluno1.addDisciplinaCursada("Matemática");
		aluno1.listarDisciplinasCursadas();
	}
}