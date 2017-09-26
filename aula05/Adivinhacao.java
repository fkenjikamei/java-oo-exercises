import java.util.Scanner;

class Adivinhacao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 72;

		System.out.println("Digite um número: ");
		int chute = entrada.nextInt();

		if(chute == numero) {
			System.out.println("Parabéns, você acertou!");
		}
		else if(chute > numero) {
			System.out.println("Chute foi maior");
		}
		else {
			System.out.println("Chute foi menor");
		}
	}
}