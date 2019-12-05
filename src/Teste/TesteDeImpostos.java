package Teste;

import controller.CalculadorDeImpostos;
import entities.ICMS;
import entities.ISS;
import entities.Imposto;
import entities.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(iss, orcamento);
		calculador.realizaCalculo(icms, orcamento);
		
	}
	
}
