package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
	
	// criar método que calcula e retorna o valor do seguro do carro
	// Seguro do carro é baseado no valor, 5% do valor do carro
	
	public double valorSeguro() {
		return 0.05 * valor;
	}
	
	// Criar um método que recebe a quantidade de parcelas, calcula e retorna
	// o valor da parcela do seguro
	
	public double parcelaSeguro(int qtdParcela) {
		return valorSeguro() / qtdParcela;
	}
	
}