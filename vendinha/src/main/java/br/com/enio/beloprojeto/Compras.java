package br.com.enio.beloprojeto;

import java.math.BigDecimal;

public class Compras {
	public BigDecimal Comprar() {
		BigDecimal total = null;
		System.out.println("Bom dia, "+Cliente.getNome()+" digite o que desejas comprar.");
		Produtos.getNomep();
		BigDecimal valorp = null;
		valorp = valorp.add(Produtos.getValor());
		return total;
	}
	
}
