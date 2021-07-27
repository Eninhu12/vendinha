package br.com.enio.beloprojeto;

import java.math.BigDecimal;

public class Produtos {
	
	private static String nomep;
	private static BigDecimal valor;

	public static String getNomep() {
		return nomep;
	}

	public static BigDecimal getValor() {
		return valor;
	}

	public Produtos(String nomep) {
		Produtos.nomep=nomep;
		this.valor=valor;
	}

}
