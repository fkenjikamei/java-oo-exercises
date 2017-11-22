package poo20172si;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		System.out.println("Linha 1");
		System.out.println("Linha 2");
		System.out.println("Linha 3");
	}

	public int somar(int num1, int num2) {
		return num1+num2;
	}

	public int subtrair(int num1, int num2) {
		return num1-num2;
	}

	public double dividir(int num1, int num2) throws Exception {
		double divisao;
		
		try {
			divisao = num1/num2;
			return divisao;
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}