package controller;

import entities.Conta;
import entities.Requisicao;
import entities.Resposta;

public class GeradorDeResposta {
	
	public void responde(Requisicao req, Conta conta) {
		Resposta r4 = new SemResposta();
		Resposta r3 = new RespostaPorCento(r4);
		Resposta r2 = new RespostaXML(r3);
		Resposta r1 = new RespostaCSV(r2);
		
		r1.responde(req, conta);
	}

}
