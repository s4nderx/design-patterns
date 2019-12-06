package entities;

import java.util.ArrayList;
import java.util.List;

import controller.TemplateDeImpostoCondicional;

public class IHIT extends TemplateDeImpostoCondicional {
	
	/*
	 * Crie o imposto IHIT, que tem a seguinte regra: caso existam 2 itens com o mesmo nome, o imposto deve ser de 13% mais R$100,00.

		Caso contr�rio, o valor do imposto dever� ser (1% * o n�mero de �tens no or�amento)
	 * */

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {

		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return contem2ItensComMesmoNome(orcamento);
	}

	private boolean contem2ItensComMesmoNome(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		for (Item item : orcamento.getItens()) {
			if (orcamento.getItens().contains(item.getNome())) {
				return true;
			} else {
				noOrcamento.add(item.getNome());
			}
		}
		return false;
	}

}
