package bea.com.br;

import java.util.Scanner;

public class Computador {
	
	private String nome;
	private int senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void cadastrarNome(String nome) {
		setNome(nome);
	}
	
	public void cadastrarSenha(int senha) {
		setSenha(senha);
	}
	
	public String retornarNome() {
		return "Beatriz";
	}
	public int retornarSenha() {
		return(123);
		
	}
	
	
}
