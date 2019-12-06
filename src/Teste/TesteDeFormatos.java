package Teste;

import controller.GeradorDeResposta;
import entities.Conta;
import entities.Formato;
import entities.Requisicao;

public class TesteDeFormatos {
	public static void main(String[] args) {
		GeradorDeResposta respostas = new GeradorDeResposta();
		Requisicao req = new Requisicao(Formato.PORCENTO);
		Conta conta = new Conta("Phellipe", 100.);
		respostas.responde(req, conta);
	}
}
