class Conta {
	static int qtdContas;
	double saldo;


	Conta() {
		Conta.qtdContas += 1;
	}

	void depositar(double valor) {
		if(valor > 0)
			this.saldo += valor;
	}

	double getSaldo() {
		return this.saldo;
	}

	void sacar(double valor) throws Exception {
		if(valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			this.liberarDinheiro(valor);
		}
		else {
			throw new Exception("Saldo insuficiente ou valor inválido!");
		}
	}

	void liberarDinheiro(double valor) {
		System.out.println("Saque efetuado!");
		System.out.println("Retire o dinheiro: "+valor);
	}

/*
Um sistema que o correntista ao solicitar um valor para
ser sacado, verifica se é um valor válido (se tem saldo,
e se não menor que 1), e depois libera o dinheiro.
*/
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.depositar(100.0);
		System.out.println("Saldo: "+conta1.getSaldo());
		double valorSacar = 100.0;
		
		try {
			conta1.sacar(valorSacar);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}