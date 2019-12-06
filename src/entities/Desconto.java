package entities;

public interface Desconto {
	
	//metodo para aplicar a regra de desconto
	double desconta(Orcamento orcamento);
	
	//metodo para chamar o proximo desconto a ser aplicado caso o desconto chamado nao seja valido
	void setProximo(Desconto proximo);

}
