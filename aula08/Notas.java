import java.util.Scanner;

class Notas {
	
	public static void main(String[] args) {
		double[][] notas;
		notas = new double[4][2];

		Scanner in = new Scanner(System.in);

		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				System.out.println("Digite a "+(j+1)+"a nota do "+(i+1)+"o bimestre: ");
				notas[i][j] = in.nextDouble();
			}
		}

		double mediaFinal = 0;

		for(int i=0; i<notas.length; i++) {
			double soma = 0;
			for(int j=0; j<notas[i].length; j++) {
				soma += notas[i][j];
				mediaFinal += notas[i][j];
			}
			System.out.println("Media do "+(i+1)+"o bimestre = "+(soma)/2);
		}

		System.out.println("Media final = "+(mediaFinal/8));
	}
}