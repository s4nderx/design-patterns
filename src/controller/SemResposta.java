package controller;

import entities.Conta;
import entities.Requisicao;
import entities.Resposta;

public class SemResposta implements Resposta{

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println("Requisição inválida!");
	}

	@Override
	public void setProxima(Resposta res) {
		
	}

}
