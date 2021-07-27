package br.com.enio.beloprojeto;

public class Cliente {
	
	private static String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public static String getNome() {
		return nome;
	}
}
