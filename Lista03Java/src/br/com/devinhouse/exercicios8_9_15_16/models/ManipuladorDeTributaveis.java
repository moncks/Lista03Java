package br.com.devinhouse.exercicios8_9_15_16.models;

import br.com.devinhouse.exercicios8_9_15_16.interfaces.Tributavel;

public class ManipuladorDeTributaveis {
	private double total;
	
	public void calculaImposto(Tributavel[] produtos) {
		for (Tributavel prod : produtos) {
			total += prod.getValorImposto();
		}
	}
	
	public double getTotal() {
		return this.total;
	}

}
