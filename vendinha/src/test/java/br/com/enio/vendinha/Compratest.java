package br.com.enio.vendinha;

import java.math.BigDecimal;

public class Compratest {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Café", BigDecimal.valueOf(1));
    	Produto p2 = new Produto("RXT 4098 TI", BigDecimal.valueOf(1));
    	Produto p3 = new Produto("Monitor Alienware", BigDecimal.valueOf(1));
    	
    	Cliente carlos = new Cliente("Carlos");
    	
    	Compra c = carlos.comprar(p1, 4);
    	c.addProduto(p2, 2);
    	
    	
    	System.out.println("Cliente....: " + c.getCliente().getId() + " - " + c.getCliente().getNome());
    	for (ItemCompra i : c.getItens()) {
			System.out.println("");
    		System.out.println("Produto....: " + i.getProduto().getNome());
    		System.out.println("Qtd........: " + i.getQtd());
    		System.out.println("Valor UN...: " + i.getProduto().getValor());
    		System.out.println("Total......: " + i.getTotal());
		}
    	System.out.println("Total G....: " + c.getTotal());
    	c.Aprovar();
    	System.out.println("Troco......: " + c.Calculatroco());
    }
}
