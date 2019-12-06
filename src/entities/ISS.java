package entities;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
