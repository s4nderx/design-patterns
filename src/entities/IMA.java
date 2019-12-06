package entities;

public class IMA extends Imposto {

	/*
	 * Crie uma classe para um novo imposto chamado "imposto muito alto", que
	 * introduz 20% de taxação.
	 * 
	 * Faça com que essa classe possa ser composta por outros impostos também.
	 * 
	 * Em um método main utilize-a em combinação com outro imposto qualquer.
	 */

	public IMA() {
		super();
	}

	public IMA(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
