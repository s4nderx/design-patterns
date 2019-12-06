package controller;

import entities.Conta;
import entities.Requisicao;
import entities.Resposta;

public class GeradorDeResposta {
	
	public void responde(Requisicao req, Conta conta) {
		Resposta r1 = new RespostaCSV();
		Resposta r2 = new RespostaXML();
		Resposta r3 = new RespostaPorCento();
		Resposta r4 = new SemResposta();
 		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
	
		r1.responde(req, conta);
	}

}
