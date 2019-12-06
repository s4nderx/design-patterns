package Teste;

import entities.ICMS;
import entities.ICPP;
import entities.ISS;
import entities.Imposto;
import entities.Orcamento;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500.);
		
		double valor = iss.calculaImposto(orcamento);
		System.out.println(valor);
	}
}
