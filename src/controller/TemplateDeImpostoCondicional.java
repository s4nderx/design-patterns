package controller;

import entities.Imposto;
import entities.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	public TemplateDeImpostoCondicional() {
		super();
	}

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	
}
