package Teste;

import java.util.Calendar;

import controller.GeradorDeResposta;
import entities.Conta;
import entities.Formato;
import entities.Requisicao;

public class TesteDeFormatos {
	public static void main(String[] args) {
		GeradorDeResposta respostas = new GeradorDeResposta();
		Requisicao req = new Requisicao(Formato.XML);
		Conta conta = new Conta("Phellipe", 100., Calendar.getInstance());
		respostas.responde(req, conta);
	}
}
