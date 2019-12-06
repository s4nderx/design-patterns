package entities;

public class ICPP implements Imposto {
	
	
	//aplica maior ou menos taxação
	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(orcamento.getValor() > 500.) 
			return orcamento.getValor() * 0.07;
		 else 
			return orcamento.getValor() * 0.05;
	}

}
