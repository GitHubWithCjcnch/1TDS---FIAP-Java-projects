package br.com.fiap.padaria.view;

import java.util.Scanner;

import br.com.fiap.padaria.model.Produto;

public class Terminal {
	public static void main(String[] args) {
		String nomeProduto;
		Produto produto = new Produto();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		nomeProduto = leitor.next();
		produto.nome = nomeProduto;
		
		System.out.println("o nome do produto é " + nomeProduto);
	}
}
