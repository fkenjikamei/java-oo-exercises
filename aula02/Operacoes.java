import java.util.Scanner;

class Operacoes {
	public static void main(String[] args) {
		Scanner entrada;
		int numero1, numero2;
		
		entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();

		System.out.println("Digite o segundo numero: ");
		numero2 = entrada.nextInt();

		int soma = numero1+numero2;
		int subtracao = numero1-numero2;
		int multiplicacao = numero1*numero2;
		double divisao = (double)numero1/numero2;

		System.out.println("Soma: "+soma);
		System.out.println("Subtracao: "+subtracao);
		System.out.println("Multiplicacao: "+multiplicacao);
		System.out.println("Divisao: "+divisao);
	}
}