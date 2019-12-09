package entities.filtro;

import java.util.ArrayList;
import java.util.List;

import entities.Conta;

public class FiltroMaiorQueQuinhentosMilReais extends Filtro{

	public FiltroMaiorQueQuinhentosMilReais() {
	}

	public FiltroMaiorQueQuinhentosMilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500000) filtradas.add(conta);
		}
		filtradas.addAll(proximo(contas));
		return filtradas;
	}
	
	

}
