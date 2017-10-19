import java.util.ArrayList;

class GerenciaFuncionarios {
	private ArrayList<Funcionario> listaFuncionarios;
	double valorFolha;

	public GerenciaFuncionarios() {
		this.listaFuncionarios = new ArrayList<Funcionario>();
	}

	void addFuncionario(Funcionario f) {
		this.listaFuncionarios.add(f);
	}

	void calcularFolha() {
		double valorFolha=0;

		for(Funcionario func : listaFuncionarios) {
			valorFolha += func.getSalario();
		}

		System.out.println("Valor da folha: "+valorFolha);
	}

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Gere 1");
		g1.calcularSalario(22);
		System.out.println("Gerente");
		System.out.println("Salário: "+g1.getSalario());
	
		GerenciaFuncionarios gerencia = new GerenciaFuncionarios();
		gerencia.addFuncionario(f1);
		gerencia.addFuncionario(g1);

		gerencia.calcularFolha();
	}
}