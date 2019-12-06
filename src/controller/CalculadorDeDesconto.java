package controller;

import entities.Orcamento;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		//separando as responsabilidades
		double desconto = new DescontoPorCincoItens().desonta(orcamento);
		if(desconto == 0)
			desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
		//caso contrario... sem desconto
		return 0;
	}
	
	
	//problema: a cada nova regra de negocio mais um if será adicionado
}
