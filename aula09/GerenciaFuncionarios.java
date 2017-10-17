import java.util.ArrayList;

class GerenciaFuncionarios {
	private ArrayList<Funcionario> listaFuncionarios;
	double valorFolha;

	void addFuncionario(Funcionario f) {
		this.listaFuncionarios.add(f);
	}

	void calcularFolha() {

	}

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.calcularSalario(22);
		System.out.println("Funcionario");
		System.out.println("Salário: "+f1.getSalario());

		Gerente g1 = new Gerente();
		g1.calcularSalario(22);
		System.out.println("Gerente");
		System.out.println("Salário: "+g1.getSalario());
	}
}