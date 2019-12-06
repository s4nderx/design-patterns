package controller;

import entities.Desconto;
import entities.Orcamento;

public class CalculadorDeDesconto{
	
	public double calcula(Orcamento orcamento) {
		//instancia descontos
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		//seta o proximo desconto a ser chamado caso a condicao nao seja verdadeira
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		//inicia a cadeia de verificacao de desconto. 
		return d1.desconta(orcamento);
	}
}
