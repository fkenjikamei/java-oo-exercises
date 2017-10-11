import java.util.Scanner;
import java.util.Random;

class NumeroSecreto {
	int numeroSecreto;
	int[] chutes;

	NumeroSecreto() {
		
	}

	NumeroSecreto(int limite) {
		Random aleatorio = new Random();
		this.numeroSecreto = aleatorio.nextInt(limite)+1;
	}

	boolean verificarChute(int chute) {
		if(chute == this.numeroSecreto) {
			System.out.println("*** Parabéns, você acertou! ***");
			return true;
		}
		else if(chute > this.numeroSecreto) {
			System.out.println(">> Chute foi maior");
		}
		else {
			System.out.println(">> Chute foi menor");
		}
		return false;
	}

	boolean isValidarEntrada(int chute) {
		if(chute > 0 && chute <= 100)
			return true;
		return false;
	}

	int escolherNivel() {
		int chances = 0;
		boolean isNivelValido = true;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Nível 1: 3 chances");
			System.out.println("Nível 2: 5 chances");
			System.out.println("Nível 3: 8 chances");
			System.out.println("Escolha um nível:");
			int nivel = entrada.nextInt();
	
			switch(nivel) {
				case 1: chances = 3; 
						break;
				case 2: chances = 5;
						break;
				case 3: chances = 8;
						break;
				default: 
					System.out.println("cheguei aqui!");
					isNivelValido = false;
			}
		} while(isNivelValido==false);

		return chances;
	}

	void jogar(int chances) {
		this.chutes = new int[chances];

		int chute = 0;
		Scanner entrada = new Scanner(System.in);

		boolean isGanhou = false;

		for(int i=1; i<=chances; i++) {
			System.out.println("\nChance de no. "+i);

			boolean isChuteValido = false;

			do {
				System.out.println("Digite um número de 1 a 100: ");
				chute = entrada.nextInt();
				isChuteValido = this.isValidarEntrada(chute);
			} while(isChuteValido == false);
			
			this.chutes[i-1] = chute;
			isGanhou = this.verificarChute(chute);

			if(isGanhou) {
				System.out.println("Parabéns, você acertou!");
				break;
			}
		}

		if(!isGanhou) {
			System.out.println("Você perdeu. Tente novamente!");
			
			System.out.println("Seus chutes foram: ");

			for(int i=0; i<this.chutes.length; i++) {
				System.out.println(chutes[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NumeroSecreto jogo = new NumeroSecreto(10);

		System.out.println("*** Jogo de Adivinhação ***");
		int chances = jogo.escolherNivel();
		jogo.jogar(chances);
	}
}