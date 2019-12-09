package entities.filtro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.Conta;

public class FiltroMesmoMes extends Filtro{

	public FiltroMesmoMes() {
	}

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if(conta.getDataDeAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) 
			&& conta.getDataDeAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR) ) {
				filtradas.add(conta);
			}
		}
		
		filtradas.addAll(proximo(contas));
		return filtradas;
	}

}
