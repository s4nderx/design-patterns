package controller;
import entities.Imposto;
import entities.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Imposto imposto, Orcamento orcamento) {
		imposto.calculaImposto(orcamento);
	}
	
}
