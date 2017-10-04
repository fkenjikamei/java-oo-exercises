import java.util.Scanner;

class AdivinhacaoComMetodos {
	int numero = 72;
	
	void verificarChute(int chute) {
		if(chute == this.numero) {
			System.out.println("Parabéns, você acertou!");
			return true;
		}
		else if(chute > numero) {
			System.out.println("Chute foi maior");
		}
		else {
			System.out.println("Chute foi menor");
		}
	}

	boolean validarEntrada(int chute) {
		if(chute > 0 && chute <= 100)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int chute = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Jogo de Adivinhação ***");

		AdivinhacaoComMetodos jogo = new AdivinhacaoComMetodos();
		
		boolean isValido = false;

		while(isValido == false) {
			System.out.println("Digite um número de 1 a 100: ");
			chute = entrada.nextInt();
			isValido = jogo.validarEntrada(chute);
		}

		jogo.verificarChute(chute);
	}
}