package br.com.devinhouse.exercicios8_9_15_16.main;

import br.com.devinhouse.exercicios8_9_15_16.interfaces.Tributavel;
import br.com.devinhouse.exercicios8_9_15_16.models.ContaCorrente;
import br.com.devinhouse.exercicios8_9_15_16.models.ManipuladorDeTributaveis;
import br.com.devinhouse.exercicios8_9_15_16.models.SeguroDeVida;

public class Main {

	public static void main(String[] args) {
		SeguroDeVida sv = new SeguroDeVida("Titular1", 15000.00);
		ContaCorrente cc1 = new ContaCorrente("Titular da Conta1", 1234, 1, 500, 100, "29/03/2021");
		
		cc1.recuperaDadosParaImpressao();
		
		sv.imprimirSeguro();
		
		sv.setValor(15010.25);
		sv.imprimirSeguro();
		System.out.println(" ");
		
		Tributavel[] benstributaveis = new Tributavel[2];
		
		benstributaveis[0] = sv;
		benstributaveis[1] = cc1;
		
		ManipuladorDeTributaveis manipulatributaveis = new ManipuladorDeTributaveis();
		
		manipulatributaveis.calculaImposto(benstributaveis);
		
		System.out.println("Total de tributos dos nossos cliente: " + manipulatributaveis.getTotal());
		
		

	}

}
