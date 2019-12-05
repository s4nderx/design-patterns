package controller;
import entities.Imposto;
import entities.Orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Imposto imposto, Orcamento orcamento) {
		double valor = imposto.calculaImposto(orcamento);
		System.out.println(valor);
	}
	
}
