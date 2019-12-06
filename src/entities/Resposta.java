package entities;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta res);
}
