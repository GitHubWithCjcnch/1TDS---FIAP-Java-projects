package br.com.fiap.aluno;

public class Aluno {
	String nome;
	int idade;
	String RM;
	
	//CalcularMedia
	double calcularCheckPoint(double c1, double c2, double c3) {
		double media = (c1 + c2 + c3) / 3;
		double porcentagemCK = media * 0.20;
		return porcentagemCK;
}
	
	double calcularChallenge(double notaChallenge) {
		double porcentagemCH = notaChallenge * 0.20;
		return porcentagemCH;
	}
	
	double calcularGlobal(double notaGlobal) {
		double porcentagemGL = notaGlobal * 0.60;
		return porcentagemGL;
	}
	
}
