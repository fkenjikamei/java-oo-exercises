import java.util.Scanner;

class OperacoesMatematicas {
	
	void somar(int numero1, int numero2) {
		int soma = numero1+numero2;
		System.out.println("Soma: "+soma);
	}

	void subtrair(int numero1, int numero2) {
		int subtrair = numero1-numero2;
		System.out.println("Subração: "+subtrair);
	}

	void expressao(int num1, int num2) {
		double expressao = (double)(num1+num2)/2;
		System.out.println("Expressão: "+expressao);
	}

	public static void main(String[] args) {
		Scanner entrada;
		int numero1, numero2;
		
		entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();

		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();

		OperacoesMatematicas operacoes = new OperacoesMatematicas();
		operacoes.somar(numero1, numero2);
		operacoes.subtrair(numero1, numero2);
		operacoes.expressao(numero1, numero2);
	}





}