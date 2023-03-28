package br.com.fiap.aluno;
import java.util.Scanner;


public class View {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Aluno AL = new Aluno();
		
		//Colocar informacoes nos atributos
		AL.nome = "Gabriel Melo dos Santos";
		AL.RM = "550202";
		
		System.out.println("Digite a nota do primeiro CheckPoint: ");
		double nota1 = leitor.nextInt();
		System.out.println("Digite a nota do primeiro CheckPoint: ");
		double nota2 = leitor.nextInt();
		System.out.println("Digite a nota do primeiro CheckPoint: ");
		double nota3 = leitor.nextInt();
		double CK = AL.calcularCheckPoint(nota1, nota2, nota3);
		System.out.println("A média do CheckPoints é de: " + CK);
		
		System.out.println("Digite a nota do Challenge: ");
		double notaCH = leitor.nextInt();
		double CH = AL.calcularChallenge(notaCH);
		System.out.println("A nota do Challenge é de: " + CH);
		
		System.out.println("Digite a nota da Global Solution: ");
		double notaGS = leitor.nextInt();
		double GS = AL.calcularGlobal(notaGS);
		System.out.println("A nota da Global Solution é de: " + GS);
		
		double notaFinal = CK + CH + GS;
		
		System.out.println("A media final(semestral) do aluno " + AL.nome + " portador do RM " + AL.RM + " é de: " + notaFinal);
	}
}
