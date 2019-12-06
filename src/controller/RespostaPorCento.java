package controller;

import entities.Conta;
import entities.Formato;
import entities.Requisicao;
import entities.Resposta;

public class RespostaPorCento implements Resposta{

	private Resposta res;

	public RespostaPorCento(Resposta res) {
		this.res = res;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			res.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta res) {
		this.res = res;
	}

}
