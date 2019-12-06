package controller;

import entities.Desconto;
import entities.Orcamento;

public class DescontoPorVendaCasada implements Desconto{


	
	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.contemItem("LAPIS") && orcamento.contemItem("CANETA")) {
			return orcamento.getValor() * 0.05;
		}
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// TODO Auto-generated method stub
		
	}

}
