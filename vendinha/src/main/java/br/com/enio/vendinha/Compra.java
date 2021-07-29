package br.com.enio.vendinha;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Compra{
	private Long id;
	private Cliente cliente;
	private List<ItemCompra> itens;
	private LocalDate hoje;

	public Compra(Cliente c, Produto p, Integer qtd) {
		this.hoje = LocalDate.now();
		this.itens = new ArrayList<>();
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE);
		this.cliente = c;
		this.addProduto(p, qtd);
	}

	public void addProduto(Produto p, Integer qtd) {
		this.itens.add(new ItemCompra(p, qtd));
	}
	public BigDecimal Calculatroco() {
		System.out.println("Insira o valor a ser pago :");
		Scanner ler = new Scanner(System.in);
		String valor = ler.next();
		Integer a = Integer.valueOf(valor);
		BigDecimal v = BigDecimal.valueOf(a);
		BigDecimal t = getTotal();
		BigDecimal Troco= new BigDecimal(0);
		if(v.compareTo(t) >= 0) {
			Troco =v.subtract(t);
			System.out.println("Obrigado, Volte Sempre <3.");
		}
		else {
			throw new RuntimeException("---------------Dinheiro Insuficiente---------------");
		}
		return Troco; 
	}
	public void Aprovar() {
		System.out.println("------------"+EnumVendinha.AGUARDANDO+"------------");
		System.out.println("Deseja confirmar a compra ?");
		Scanner ler = new Scanner(System.in);
		String confirma = ler.next();
		LocalDate agora = LocalDate.now();
		if("sim".equals(confirma)) {
			System.out.println("------------"+EnumVendinha.APROVADO+"------------");
			System.out.println(agora);
		}
		else{
			System.out.println("------------"+EnumVendinha.CANCELADO+"------------");
			System.out.println(agora);
			throw new RuntimeException("---------------Fechando Programa---------------");
		}
	}
	public Cliente getCliente() {
		return cliente;
	}

	public Long getId() {
		return id;
	}

	public List<ItemCompra> getItens() {
		return itens;
	}

	public BigDecimal getTotal() {
		BigDecimal soma = BigDecimal.ZERO;
		for (ItemCompra i : itens) {
			soma = soma.add(i.getTotal());
		}
		return soma;
	}
}