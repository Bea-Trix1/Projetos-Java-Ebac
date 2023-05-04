package bea.com.br;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Aluno, digite sua primeira nota: ");
		int nota1 = ent.nextInt();
		
		System.out.println(" \n Aluno, digite sua segunda nota: ");
		int nota2 = ent.nextInt();
		
		System.out.println("\n Aluno, digite sua terceira nota: ");
		int nota3 = ent.nextInt();
		
		System.out.println("\n Aluno, digite sua quarta nota: ");
		int nota4 = ent.nextInt();
		
		
		int media = (nota1+nota2+nota3+nota4) /4;
		
		
		if(media >= 5) {
			System.out.println("Aprovado! Media do aluno: " + media);
		}
		else{
			System.out.println("Reprovado! Media do aluno: " + media);
		}
		
		
	}

}
