import java.util.Scanner;

class Boate {
	public static void main(String[] args) {
		boolean isAmigo;

		Scanner entrada = new Scanner(System.in);
		System.out.println("** Sistema de Boate **");
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();

		System.out.println("Você é amigo do dono? \n1-Sim\n2-Não");
		int opcao = entrada.nextInt();

		if(opcao == 1)
			isAmigo = true;
		else
			isAmigo = false;

		if(!isAmigo)
			System.out.println("Não entra, não é amigo!");
		else if(idade >= 18) {
			System.out.println("Pode entrar! Beba com moderação!");
		}
		else {
			System.out.println("Não entra");
		}
	}
}