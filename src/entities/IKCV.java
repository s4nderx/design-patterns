package entities;

public class IKCV implements Imposto{
	
	//aplica maior ou menos taxação
	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(orcamento.getValor() > 500. && temItemMaiorQue100ReaisNo(orcamento)) {
			return orcamento.getValor() * 0.1;
		}else {
			return orcamento.getValor() * 0.06;
		}
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100.) {
				return true;
			}
		}
		return false;
	}

}
