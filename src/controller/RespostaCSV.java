package controller;

import entities.Conta;
import entities.Formato;
import entities.Requisicao;
import entities.Resposta;

public class RespostaCSV implements Resposta{

	private Resposta res;
	
	public RespostaCSV(Resposta res) {
		this.res = res;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular()+";"+conta.getSaldo());
		} else {
			res.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta res) {
		this.res = res;
	}

}
