package bea.com.br;

import java.util.Scanner;

public class Informacoes {

	public static void main(String[] args) {
		System.out.println("Seja Bem-Vindo(a)!!! \n"
						+ "Seu Usuario e senha sao: ");
		
		Computador computador = new Computador();
		
		computador.cadastrarNome("Beatriz");
		computador.cadastrarSenha(1234);
		
		 System.out.println(computador.getNome());
		 System.out.println(computador.getSenha()); 
		 
		
	}

}
