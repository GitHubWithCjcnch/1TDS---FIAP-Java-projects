package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i + " anos");
		
		//Aumentar o valor do carro em 20%	
		gol.atualizarValor(0.2);
		
		//Exibir o valor do carro
		System.out.println("O novo valor do carro " + gol.valor);
		
		double valorSeguro = gol.valorSeguro();
		
		System.out.println("O valor do seguro do carro é " + valorSeguro);
		
		double parcelaSeguro = gol.parcelaSeguro(12);
		
		System.out.println("O valor da parcela do seguro é " + parcelaSeguro);
	}
}