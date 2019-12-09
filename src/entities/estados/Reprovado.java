package entities.estados;

import entities.Orcamento;

public class Reprovado implements EstadosDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());
	}
	
}
