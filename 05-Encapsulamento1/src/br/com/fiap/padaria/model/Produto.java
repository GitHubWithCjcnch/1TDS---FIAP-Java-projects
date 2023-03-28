package br.com.fiap.padaria.model;

public class Produto {
	int id, qtd;
	String nome;
	double precoCusto, precoVenda;
	
	double calcularLucro() {
		return (precoCusto - precoVenda) * qtd;
	}
	
	void atualizarEstoque(int quantidade) {
		quantidade += qtd;
	}
	
}
