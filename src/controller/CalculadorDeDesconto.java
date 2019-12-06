package controller;

import entities.Orcamento;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		//mais de 5 itens, desconto
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
			//valor do orcamento maior que 500 reais, desconto
		} else if(orcamento.getValor() > 500.) {
			return orcamento.getValor() * 0.07;
		}
		//caso contrario... sem desconto
		return 0;
	}
	
	
	//problema: a cada nova regra de negocio mais um if será adicionado
}
