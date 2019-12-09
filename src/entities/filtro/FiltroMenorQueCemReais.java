package entities.filtro;

import java.util.ArrayList;
import java.util.List;

import entities.Conta;

public class FiltroMenorQueCemReais extends Filtro {

	public FiltroMenorQueCemReais() {
		super();
	}

	public FiltroMenorQueCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100)
				filtradas.add(conta);
		}
		filtradas.addAll(proximo(contas));
		return filtradas;
	}

}
