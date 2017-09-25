class Carro {
	float potenciaMotor;
	String placa;
	String cor;
	String marca;
	String nome;
	int velocidade;

	void acelerar(int valor) {
		velocidade += valor;
	}

	void getVelocidade() {
		System.out.println("Velocidade de "+velocidade+" km/h");
	}

	void setNome(String nome) {
		this.nome = nome;
	}


	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.acelerar(10);
		carro1.getVelocidade();
		System.out.println(carro1);

		Carro carro2 = new Carro();
		carro2.acelerar(90);
		carro2.getVelocidade();
		System.out.println(carro2);

		Carro carro3 = carro2;
		System.out.println(carro3);
		carro3.acelerar(10);

		carro2.getVelocidade();
		carro3.getVelocidade();
	}
}






