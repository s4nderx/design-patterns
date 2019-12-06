package controller;

import entities.Conta;
import entities.Formato;
import entities.Requisicao;
import entities.Resposta;

public class RespostaXML implements Resposta{

	private Resposta res;

	public RespostaXML(Resposta res) {
		this.res = res;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML) {
			System.out.println("<conta>\n<titular>" + conta.getTitular() + "</titular>\n<saldo>" + conta.getSaldo() + "</saldo>\n</conta>");
		} else {
			res.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta res) {
		this.res = res;
	}

}
