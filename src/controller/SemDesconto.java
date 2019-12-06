package controller;

import entities.Desconto;
import entities.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//final da cadeia de descontos
	}
	
	
}
