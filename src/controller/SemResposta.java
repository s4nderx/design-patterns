package controller;

import entities.Conta;
import entities.Requisicao;
import entities.Resposta;

public class SemResposta implements Resposta{

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println("Requisi��o inv�lida!");
	}

	@Override
	public void setProxima(Resposta res) {
		
	}

}
