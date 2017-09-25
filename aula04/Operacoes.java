import java.util.Scanner;
import java.text.NumberFormat;

class Operacoes {
	
	public static void main(String[] args) {
		int inteiro2;
		float pontoFlutuante;
		char caractere;
		boolean isMaiorIdade;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = entrada.nextLine();
		System.out.println("Nome: "+nome);

		int numeroInteiro = 10;
		double numeroReal = numeroInteiro;
		System.out.println("Inteiro: "+numeroInteiro);
		System.out.println("Real: "+numeroReal);

		double real = 29.5;
		int inteiro = (int)real; //casting
		System.out.println("Inteiro: "+inteiro);
		System.out.println("Real: "+real);

		//Exressões - Java só entende parenteses
		int exp1 = (10+29)+(10-2-(5*2));
		System.out.println("Expressão 1: "+exp1);

		int exp2 = 10+1-8+90*2/2;
		System.out.println("Expressão 2: "+exp2);

		System.out.println("Dizima: "+(10.0/3.0));

		NumberFormat nf;
		nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(5);
		double x = 10.0 / 3.0;
		String saidaFormatada = nf.format(x);
		System.out.println(saidaFormatada);

	}
}