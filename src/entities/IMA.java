package entities;

public class IMA extends Imposto {

	/*
	 * Crie uma classe para um novo imposto chamado "imposto muito alto", que
	 * introduz 20% de taxa��o.
	 * 
	 * Fa�a com que essa classe possa ser composta por outros impostos tamb�m.
	 * 
	 * Em um m�todo main utilize-a em combina��o com outro imposto qualquer.
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
