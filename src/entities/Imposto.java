package entities;

public abstract class Imposto {
	
	private final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}
	
	public abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		return outroImposto == null ? 0 : outroImposto.calculaImposto(orcamento);
	}
}
