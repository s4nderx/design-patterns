package Teste;

import controller.CalculadorDeDesconto;
import entities.Item;
import entities.Orcamento;

public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(500.);
		orcamento.adicionaItem(new Item("CANETA", 250.));
		orcamento.adicionaItem(new Item("LAPIS", 250.));
		
		double descontoFinal = descontos.calcula(orcamento);
		System.out.println("Desconto: R$" + descontoFinal);
	}
}
